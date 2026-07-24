# Linked List Cycle Detection

## Problem Statement

Given the beginning of a linked list `head`, return `true` if there is a cycle in the linked list. Otherwise, return `false`.

A cycle exists if a node can be visited again by continuously following the `next` pointer.

---

## Example 1

Input:

```txt
head = [1,2,3,4]
index = 1
```

Output:

```txt
true
```

Explanation:

The last node points back to the node at index `1`, creating a cycle.

---

## Example 2

Input:

```txt
head = [1,2]
index = -1
```

Output:

```txt
false
```

Explanation:

The last node points to `null`, so no cycle exists.

---

## Constraints

```txt
0 <= Length of the list <= 1000
-1000 <= Node.val <= 1000
index is -1 or a valid index in the linked list
```

---

## Approach

1. Create a `HashSet` to store visited nodes.
2. Traverse the linked list.
3. For each node, try to add it to the HashSet.
4. If the node already exists in the HashSet, a cycle is detected.
5. Return `true`.
6. If traversal reaches `null`, return `false`.

---

## Core Idea

A `HashSet` stores only unique objects.

- If a node is visited for the first time, add it to the HashSet.
- If the same node is encountered again, it means the linked list contains a cycle.

---

## Dry Run

Input:

```txt
head = [1,2,3,4]
index = 1
```

Traversal:

| Current Node | HashSet Before | Action | HashSet After |
|--------------|----------------|--------|---------------|
| 1 | {} | Add | {1} |
| 2 | {1} | Add | {1,2} |
| 3 | {1,2} | Add | {1,2,3} |
| 4 | {1,2,3} | Add | {1,2,3,4} |
| 2 | {1,2,3,4} | Already Present → Cycle Found | Stop |

Return:

```txt
true
```

---

## Complexity Analysis

Time Complexity:

```txt
O(n)
```

Space Complexity:

```txt
O(n)
```

---

## Data Structure Used

- HashSet

---

## Java Solution

Code available in submission file.

# Reverse Nodes in K-Group

## Problem Statement

Given the head of a singly linked list `head` and a positive integer `k`, reverse the nodes of the linked list in groups of `k`.

If there are fewer than `k` nodes remaining at the end, leave those nodes unchanged.

Only the nodes' `next` pointers can be modified. The values of the nodes must not be changed.

---

## Example 1

**Input:**

```txt
head = [1,2,3,4,5,6]
k = 3
```

**Output:**

```txt
[3,2,1,6,5,4]
```

**Explanation:**

The list is divided into groups of 3:

```txt
[1,2,3] [4,5,6]
```

Reverse each group:

```txt
[3,2,1] [6,5,4]
```

Final result:

```txt
[3,2,1,6,5,4]
```

---

## Example 2

**Input:**

```txt
head = [1,2,3,4,5]
k = 3
```

**Output:**

```txt
[3,2,1,4,5]
```

**Explanation:**

The first 3 nodes are reversed:

```txt
[1,2,3] → [3,2,1]
```

Only 2 nodes remain:

```txt
[4,5]
```

Since there are fewer than `k` nodes, they remain unchanged.

Final result:

```txt
[3,2,1,4,5]
```

---

## Constraints

```txt
1 <= k <= n <= 5000
0 <= Node.val <= 100
```

Where `n` is the length of the linked list.

---

## Approach

Use an **in-place linked list reversal** technique.

1. Create a dummy node pointing to the head.
2. Maintain `groupPrev`, which represents the node immediately before the current group.
3. Find the `k`th node of the current group using a helper method `getKth()`.
4. If fewer than `k` nodes remain, stop the process.
5. Store the node after the current group as `groupNext`.
6. Reverse the current group by changing only the `next` pointers.
7. Connect the previous group to the newly reversed group.
8. Move `groupPrev` to the end of the reversed group.
9. Repeat until there are fewer than `k` nodes remaining.
10. Return `dummy.next`.

---

## Core Idea

The main idea is to reverse each group of `k` nodes **in-place**.

For example:

```txt
1 → 2 → 3 → 4 → 5
```

For:

```txt
k = 2
```

First group:

```txt
1 → 2
```

becomes:

```txt
2 → 1
```

Second group:

```txt
3 → 4
```

becomes:

```txt
4 → 3
```

The last node remains unchanged:

```txt
5
```

Final list:

```txt
2 → 1 → 4 → 3 → 5
```

A dummy node is used so that the first group's reversal can be handled easily.

During reversal, three pointers are important:

```txt
prev
curr
temp
```

They are used to reverse the `next` pointers without creating new nodes.

---

## Dry Run

Consider:

```txt
head = [1,2,3,4,5,6]
k = 3
```

Initial list:

```txt
1 → 2 → 3 → 4 → 5 → 6
```

### Step 1: Find the First Group

The first group contains:

```txt
1 → 2 → 3
```

The next group starts at:

```txt
4
```

So:

```txt
groupNext = 4
```

Reverse the first group:

```txt
1 → 2 → 3
```

becomes:

```txt
3 → 2 → 1
```

Connect it with the remaining list:

```txt
3 → 2 → 1 → 4 → 5 → 6
```

---

### Step 2: Reverse the Second Group

The next group is:

```txt
4 → 5 → 6
```

Reverse it:

```txt
6 → 5 → 4
```

Connect it to the previous group:

```txt
3 → 2 → 1 → 6 → 5 → 4
```

Final result:

```txt
[3,2,1,6,5,4]
```

---

## Dry Run for Unequal Group

Consider:

```txt
head = [1,2,3,4,5]
k = 3
```

First group:

```txt
1 → 2 → 3
```

After reversal:

```txt
3 → 2 → 1
```

Remaining nodes:

```txt
4 → 5
```

Since there are only 2 nodes remaining and:

```txt
2 < k
```

they are not reversed.

Final list:

```txt
3 → 2 → 1 → 4 → 5
```

---

## Complexity Analysis

### Time Complexity

```txt
O(n)
```

Each node is visited and processed a constant number of times while finding groups and reversing them.

### Space Complexity

```txt
O(1)
```

Only a constant number of pointers are used. No additional array, stack, or linked list is created.

---

## Data Structure Used

- Singly Linked List
- Dummy Node
- Multiple pointers

Important pointers:

```txt
groupPrev → Node before the current group
kth       → Last node of the current group
groupNext → First node of the next group
prev      → Previous node during reversal
curr      → Current node during reversal
```

---

## Java Solution
java solution available in submission file

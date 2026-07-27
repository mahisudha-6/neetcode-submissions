# Reorder Linked List

## Problem Statement

You are given the head of a singly linked list.

Reorder the linked list in the following pattern:

```txt
L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → ...
```

You may not modify the values in the nodes. Only the node connections should be changed.

---

## Example 1

Input:

```txt
head = [2,4,6,8]
```

Output:

```txt
[2,8,4,6]
```

---

## Example 2

Input:

```txt
head = [2,4,6,8,10]
```

Output:

```txt
[2,10,4,8,6]
```

---

## Constraints

```txt
1 <= Length of the list <= 1000
1 <= Node.val <= 1000
```

---

## Approach

1. Find the middle of the linked list using slow and fast pointers.
2. Split the list into two halves.
3. Reverse the second half of the linked list.
4. Merge the first half and reversed second half alternately.
5. Continue until all nodes are reordered.

---

## Core Idea

The solution consists of three steps:

- Find the middle of the linked list.
- Reverse the second half.
- Merge both halves by alternating nodes.

This reorders the list without creating any extra linked list.

---

## Dry Run

Input:

```txt
head = [1,2,3,4,5]
```

### Step 1: Find Middle

```txt
First Half  = [1,2,3]
Second Half = [4,5]
```

### Step 2: Reverse Second Half

```txt
[5,4]
```

### Step 3: Merge Alternately

| First Half | Second Half | Result |
|------------|-------------|--------|
| 1 | 5 | 1 → 5 |
| 2 | 4 | 1 → 5 → 2 → 4 |
| 3 | - | 1 → 5 → 2 → 4 → 3 |

Final Output:

```txt
[1,5,2,4,3]
```

---

## Complexity Analysis

Time Complexity:

```txt
O(n)
```

Space Complexity:

```txt
O(1)
```

---

## Data Structure Used

- Linked List

---

## Java Solution

Code available in submission file.

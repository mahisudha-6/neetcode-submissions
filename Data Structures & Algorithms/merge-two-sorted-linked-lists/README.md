# Merge Two Sorted Linked Lists

## Problem Statement

You are given the heads of two sorted linked lists `list1` and `list2`.

Merge the two lists into one sorted linked list and return the head of the merged list.

The merged list should be made by linking together the nodes of the two input lists.

---

## Example 1

Input:
```txt
list1 = [1,2,4]
list2 = [1,3,5]
```

Output:
```txt
[1,1,2,3,4,5]
```

---

## Example 2

Input:
```txt
list1 = []
list2 = [1,2]
```

Output:
```txt
[1,2]
```

---

## Example 3

Input:
```txt
list1 = []
list2 = []
```

Output:
```txt
[]
```

---

## Constraints

```txt
0 <= Length of each list <= 100
-100 <= Node.val <= 100
```

---

## Approach

1. Create a dummy node.
2. Create a pointer `node` pointing to the dummy node.
3. Compare the current nodes of both linked lists.
4. Attach the smaller node to `node.next`.
5. Move the corresponding list pointer forward.
6. Move `node` forward.
7. Repeat until one list becomes empty.
8. Attach the remaining nodes of the non-empty list.
9. Return `dummy.next`.

---

## Core Idea

Use a **dummy node** to simplify merging.

- Compare the current nodes of both lists.
- Always connect the smaller node to the merged list.
- Continue until one list ends.
- Attach the remaining nodes directly since they are already sorted.

---

## Dry Run

Input:

```txt
list1 = [1,2,4]
list2 = [1,3,5]
```

| list1 | list2 | Selected Node | Merged List |
|--------|--------|---------------|-------------|
| 1 | 1 | 1 (list2) | 1 |
| 1 | 3 | 1 (list1) | 1 → 1 |
| 2 | 3 | 2 | 1 → 1 → 2 |
| 4 | 3 | 3 | 1 → 1 → 2 → 3 |
| 4 | 5 | 4 | 1 → 1 → 2 → 3 → 4 |
| null | 5 | Attach remaining | 1 → 1 → 2 → 3 → 4 → 5 |

Final Output:

```txt
[1,1,2,3,4,5]
```

---

## Complexity Analysis

Time Complexity:

```txt
O(n + m)
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

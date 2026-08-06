# Remove Nth Node From End of List

## Problem Statement

Given the head of a linked list and an integer `n`, remove the `n`th node from the end of the list and return the head of the modified linked list.

---

## Example 1

Input:

```txt
head = [1,2,3,4]
n = 2
```

Output:

```txt
[1,2,4]
```

---

## Example 2

Input:

```txt
head = [5]
n = 1
```

Output:

```txt
[]
```

---

## Example 3

Input:

```txt
head = [1,2]
n = 2
```

Output:

```txt
[2]
```

---

## Constraints

```txt
1 <= Size of linked list <= 30
0 <= Node.val <= 100
1 <= n <= Size of linked list
```

---

## Approach

1. Create a dummy node and connect it to the head.
2. Initialize two pointers: `sp` (slow pointer) and `fp` (fast pointer) at the dummy node.
3. Move the fast pointer `n + 1` steps ahead.
4. Move both pointers one step at a time until the fast pointer becomes `null`.
5. The slow pointer will be just before the node to be removed.
6. Skip the target node by updating `sp.next`.
7. Return `dummy.next`.

---

## Core Idea

Use the **Two Pointer** technique.

- Keep the fast pointer `n + 1` nodes ahead of the slow pointer.
- When the fast pointer reaches the end, the slow pointer will be just before the node that needs to be removed.
- Using a dummy node also handles the case where the head node needs to be deleted.

---

## Dry Run

Input:

```txt
head = [1,2,3,4]
n = 2
```

Initial:

```txt
dummy → 1 → 2 → 3 → 4
sp = dummy
fp = dummy
```

Move `fp` 3 steps (`n + 1`):

```txt
fp → 3
sp → dummy
```

Move both pointers together:

| sp | fp |
|----|----|
| dummy | 3 |
| 1 | 4 |
| 2 | null |

Now `sp` is before the node to remove.

Delete:

```txt
sp.next = sp.next.next
```

Result:

```txt
1 → 2 → 4
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

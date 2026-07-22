# Reverse Linked List

## Problem Statement

Given the beginning of a singly linked list `head`, reverse the linked list and return the new head.

---

## Example 1

Input:
```txt
head = [0,1,2,3]
```

Output:
```txt
[3,2,1,0]
```

---

## Example 2

Input:
```txt
head = []
```

Output:
```txt
[]
```

---

## Constraints

```txt
0 <= The length of the list <= 1000
-1000 <= Node.val <= 1000
```

---

## Submission 0 Approach

### Using Three Pointers

Maintain three pointers:

- `prev` points to the previous node.
- `curr` points to the current node.
- `next` stores the next node before changing the link.

Reverse each node's pointer one by one until the end of the list, then return `prev` as the new head.

---

## Approach

1. Initialize `prev` as `null` and `curr` as `head`.
2. Traverse the linked list.
3. Store `curr.next` in `next`.
4. Reverse the current node's link by setting `curr.next = prev`.
5. Move `prev` to `curr`.
6. Move `curr` to `next`.
7. Repeat until `curr` becomes `null`.
8. Return `prev`.

---

## Core Idea

Reverse the direction of every `next` pointer while traversing the linked list only once.

Using three pointers ensures that no node is lost during the reversal process.

---

## Dry Run

Input:

```txt
head = [1,2,3,4]
```

| prev | curr | next | Updated List |
|------|------|------|--------------|
| null | 1 | 2 | 1 → null |
| 1 | 2 | 3 | 2 → 1 |
| 2 | 3 | 4 | 3 → 2 |
| 3 | 4 | null | 4 → 3 |

Final Linked List:

```txt
[4,3,2,1]
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

---

# Submission 1

## Submission 1 Approach

### Using Stack

Store all node values in a Stack during the first traversal. Traverse the linked list again and replace each node's value by popping from the Stack.

Since Stack follows the **LIFO (Last In, First Out)** principle, the node values are written back in reverse order.

---

## Approach

1. Create an empty Stack.
2. Traverse the linked list.
3. Push every node value into the Stack.
4. Traverse the linked list again.
5. Pop values from the Stack and assign them to each node.
6. Return the head.

---

## Core Idea

A Stack follows the **LIFO (Last In, First Out)** principle.

- Push all node values into the Stack.
- Pop values one by one.
- Assign popped values back to the linked list.
- The values become reversed while the node connections remain unchanged.

---

## Dry Run

Input:

```txt
head = [1,2,3,4]
```

Push all values:

```txt
Stack = [1,2,3,4]
```

Second Traversal:

| Current Node | Stack Top | Updated Node |
|--------------|-----------|--------------|
| 1 | 4 | 4 |
| 2 | 3 | 3 |
| 3 | 2 | 2 |
| 4 | 1 | 1 |

Final Linked List:

```txt
[4,3,2,1]
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

- Stack

---

## Java Solution

Code available in submission file.

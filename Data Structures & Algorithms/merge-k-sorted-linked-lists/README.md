# Merge K Sorted Linked Lists

## Problem Statement

Given an array of `k` linked lists, where each linked list is sorted in ascending order, merge all the linked lists into one sorted linked list.

The final linked list should contain all nodes from the given lists in sorted order.

---

## Example 1

**Input:**

```text
lists = [[1,2,4],[1,3,5],[3,6]]
```

**Output:**

```text
[1,1,2,3,3,4,5,6]
```

---

## Example 2

**Input:**

```text
lists = []
```

**Output:**

```text
[]
```

---

## Example 3

**Input:**

```text
lists = [[]]
```

**Output:**

```text
[]
```

---

## Constraints

```text
0 <= lists.length <= 10000
0 <= lists[i].length <= 500
-10000 <= lists[i][j] <= 10000
lists[i] is sorted in ascending order
The total number of nodes across all lists <= 10000
```

---

## Approach

Use the idea of **merging two sorted linked lists**.

Instead of storing all nodes in an array and sorting them, merge the linked lists one by one.

1. If the `lists` array is empty, return `null`.
2. Start from the second list.
3. Merge the current list with the previously merged list.
4. Store the resulting merged list at the current index.
5. Continue until all lists are merged.
6. Return the last merged list.

For example:

```text
lists = [
    [1,2,4],
    [1,3,5],
    [3,6]
]
```

First merge:

```text
[1,2,4] + [1,3,5]
        ↓
[1,1,2,3,4,5]
```

Then merge the result with the third list:

```text
[1,1,2,3,4,5] + [3,6]
        ↓
[1,1,2,3,3,4,5,6]
```

---

## Core Idea

The main idea is to **reuse the two sorted linked list merging technique**.

For every list:

```text
Current merged list + Next list
```

The `merge()` function compares the nodes of both lists and connects the smaller node to the result.

The process continues until all `k` lists are merged.

### Example

```text
List 1: 1 → 2 → 4
List 2: 1 → 3 → 5
```

Compare the nodes:

```text
1 vs 1 → take 1
2 vs 1 → take 1
2 vs 3 → take 2
4 vs 3 → take 3
4 vs 5 → take 4
remaining → 5
```

Result:

```text
1 → 1 → 2 → 3 → 4 → 5
```

---

## Dry Run

Given:

```text
lists = [
    [1,2,4],
    [1,3,5],
    [3,6]
]
```

### Step 1: Start

```text
i = 1
```

Merge:

```text
lists[1] + lists[0]
```

```text
[1,3,5] + [1,2,4]
```

Result:

```text
[1,1,2,3,4,5]
```

Now:

```text
lists[1] = [1,1,2,3,4,5]
```

---

### Step 2: Merge With Third List

```text
i = 2
```

Merge:

```text
lists[2] + lists[1]
```

```text
[3,6] + [1,1,2,3,4,5]
```

Result:

```text
[1,1,2,3,3,4,5,6]
```

Now:

```text
lists[2] = [1,1,2,3,3,4,5,6]
```

---

### Step 3: Return Result

The final merged list is stored at:

```text
lists[lists.length - 1]
```

Therefore, return:

```text
[1,1,2,3,3,4,5,6]
```

---

## Complexity Analysis

Let:

- `k` = number of linked lists
- `n` = total number of nodes across all lists

### Time Complexity

```text
O(n * k)
```

Each new list is merged with the previously merged list. In the worst case, nodes may be traversed multiple times.

### Space Complexity

```text
O(1)
```

No additional data structure is used to store the nodes. The existing linked list nodes are reused.

---

## Data Structure Used

- Array of linked lists
- Singly Linked List
- Two-pointer technique

The linked list nodes are directly connected during the merge process.



# Invert Binary Tree

## Problem

You are given the root of a binary tree `root`. Invert the binary tree and return its root.

To **invert** a binary tree, swap the left and right children of every node.

---

## Example

### Example 1

```text
Input:  root = [1,2,3,4,5,6,7]

Output: [1,3,2,7,6,5,4]
```

### Example 2

```text
Input:  root = [3,2,1]

Output: [3,1,2]
```

### Example 3

```text
Input:  root = []

Output: []
```

---

## Constraints

* `0 <=` Number of nodes `<= 100`
* `-100 <= Node.val <= 100`

---

## Core Idea

The main idea is to **swap the left and right child of every node**.

We use **DFS (Depth First Search)** with recursion.

For each node:

```text
Left child ↔ Right child
```

After swapping the children of the current node, we recursively perform the same operation on both subtrees.

---

## Approach

1. If `root` is `null`, return `null`.
2. Store the left child temporarily.
3. Swap the left and right children.
4. Recursively invert the left subtree.
5. Recursively invert the right subtree.
6. Return the root.

This process continues until every node in the tree has been inverted.

---

## Dry Run

Consider:

```text
        1
       / \
      2   3
     / \ / \
    4  5 6  7
```

### Step 1: At node `1`

Swap its children:

```text
        1
       / \
      3   2
     / \ / \
    6  7 4  5
```

### Step 2: Invert node `3`

Swap `6` and `7`:

```text
        1
       / \
      3   2
     / \ / \
    7  6 4  5
```

### Step 3: Invert node `2`

Swap `4` and `5`:

```text
        1
       / \
      3   2
     / \ / \
    7  6 5  4
```

Final result:

```text
[1,3,2,7,6,5,4]
```

---

## Complexity Analysis

### Time Complexity

**O(n)**

Every node is visited exactly once.

### Space Complexity

**O(n)** in the worst case because of the recursion stack.

For a balanced tree, the recursion depth is **O(log n)**.

---

## Java Solution

Solution available in the submission file.

# Maximum Depth of Binary Tree

## Problem

Given the `root` of a binary tree, return its **maximum depth**.

The maximum depth of a binary tree is the number of nodes along the longest path from the root node down to the farthest leaf node.

---

## Example

### Example 1

```text
Input: root = [1,2,3,null,null,4]

Output: 3
```

The longest path is:

```text
1 → 3 → 4
```

So the maximum depth is `3`.

### Example 2

```text
Input: root = []

Output: 0
```

Since the tree is empty, its depth is `0`.

---

## Constraints

* `0 <=` Number of nodes `<= 100`
* `-100 <= Node.val <= 100`

---

## Core Idea

The maximum depth of a node is:

```text
1 + max(left subtree depth, right subtree depth)
```

The `1` represents the **current node**.

For an empty tree:

```text
depth = 0
```

We use **DFS (Depth First Search)** with recursion to calculate the depth of the left and right subtrees.

---

## Approach

1. If `root` is `null`, return `0`.
2. Recursively find the maximum depth of the left subtree.
3. Recursively find the maximum depth of the right subtree.
4. Take the larger of the two depths.
5. Add `1` for the current node.
6. Return the result.

The recursion continues until it reaches the leaf nodes.

---

## Dry Run

Consider the tree:

```text
        1
       / \
      2   3
         /
        4
```

### Step 1: Node `1`

We need:

```text
leftDepth  = depth of subtree 2
rightDepth = depth of subtree 3
```

### Step 2: Node `2`

Node `2` has no children:

```text
leftDepth = 0
rightDepth = 0

depth = 1 + max(0, 0)
      = 1
```

So:

```text
depth(2) = 1
```

### Step 3: Node `4`

Node `4` is a leaf:

```text
depth(4) = 1
```

### Step 4: Node `3`

Node `3` has the subtree containing `4`:

```text
leftDepth  = 1
rightDepth = 0

depth(3) = 1 + max(1, 0)
         = 2
```

### Step 5: Node `1`

Now:

```text
leftDepth  = 1
rightDepth = 2

depth(1) = 1 + max(1, 2)
         = 3
```

Therefore:

```text
Maximum Depth = 3
```

---

## Complexity Analysis

### Time Complexity

**O(n)**

Every node in the binary tree is visited exactly once.

### Space Complexity

**O(n)** in the worst case because of the recursion stack.

For a balanced binary tree, the recursion depth is **O(log n)**.

---

## Java Solution

Solution available in the submission file.

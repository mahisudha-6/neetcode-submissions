# Balanced Binary Tree

## Problem

Given a binary tree, return `true` if it is **height-balanced** and `false` otherwise.

A binary tree is **height-balanced** when the heights of the left and right subtrees of **every node** differ by no more than `1`.

In simple terms:

```text
|leftHeight - rightHeight| <= 1
```

This condition must be true for every node in the tree.

---

## Example

### Example 1

```text
Input: root = [1,2,3,null,null,4]

Output: true
```

The height difference between the left and right subtrees of every node is at most `1`.

Therefore, the tree is balanced.

### Example 2

```text
Input: root = [1,2,3,null,null,4,null,5]

Output: false
```

At least one node has a left and right subtree height difference greater than `1`.

Therefore, the tree is not balanced.

### Example 3

```text
Input: root = []

Output: true
```

An empty tree is considered balanced.

---

## Constraints

* `0 <=` Number of nodes in the tree `<= 1000`
* `-1000 <= Node.val <= 1000`

---

## Core Idea

For every node, we need to know two things:

```text
1. Is the subtree balanced?
2. What is the height of the subtree?
```

We use **DFS (Depth First Search)** to calculate both pieces of information in a single traversal.

For a node to be balanced:

```text
Left subtree must be balanced

AND

Right subtree must be balanced

AND

|leftHeight - rightHeight| <= 1
```

The height of the current node is:

```text
1 + max(leftHeight, rightHeight)
```

For a `null` node:

```text
Balanced = true
Height = 0
```

---

## Approach

1. Start DFS from the root.
2. If the current node is `null`, return:

   * Balanced = `true`
   * Height = `0`
3. Recursively calculate the balance status and height of the left subtree.
4. Recursively calculate the balance status and height of the right subtree.
5. Check whether both subtrees are balanced.
6. Calculate the difference between their heights.
7. If the height difference is at most `1`, the current node is balanced.
8. Calculate the current node's height:

```text
1 + max(leftHeight, rightHeight)
```

9. Return both the balance status and height to the parent node.
10. Finally, return whether the entire tree is balanced.

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

### Step 1: Node `2`

Node `2` is a leaf.

```text
leftHeight  = 0
rightHeight = 0

|0 - 0| = 0
```

Since:

```text
0 <= 1
```

Node `2` is balanced.

Its height is:

```text
1 + max(0, 0) = 1
```

So:

```text
Balanced = true
Height = 1
```

---

### Step 2: Node `4`

Node `4` is also a leaf.

```text
leftHeight  = 0
rightHeight = 0

|0 - 0| = 0
```

Therefore:

```text
Balanced = true
Height = 1
```

---

### Step 3: Node `3`

Node `3` has:

```text
leftHeight  = 1
rightHeight = 0
```

Check the difference:

```text
|1 - 0| = 1
```

Since:

```text
1 <= 1
```

Node `3` is balanced.

Its height is:

```text
1 + max(1, 0)
= 2
```

So:

```text
Balanced = true
Height = 2
```

---

### Step 4: Node `1`

Now:

```text
leftHeight  = 1
rightHeight = 2
```

Check the difference:

```text
|1 - 2| = 1
```

Since both subtrees are balanced and:

```text
1 <= 1
```

Node `1` is also balanced.

Its height is:

```text
1 + max(1, 2)
= 3
```

Therefore:

```text
Output = true
```

The entire binary tree is **height-balanced**.

---

## Complexity Analysis

### Time Complexity

**O(n)**

Each node in the binary tree is visited exactly once during DFS.

### Space Complexity

**O(n)** in the worst case because of the recursion stack.

For a balanced binary tree, the recursion depth is **O(log n)**.

---

## Java Solution

Solution available in the submission file.

# Diameter of Binary Tree

## Problem

The **diameter of a binary tree** is the length of the longest path between any two nodes in the tree.

The path does **not necessarily have to pass through the root**.

The length of a path is measured by the **number of edges** between the two nodes.

Given the root of a binary tree `root`, return the diameter of the tree.

---

## Example

### Example 1

```text
Input: root = [1,null,2,3,4,5]

Output: 3
```

One of the longest paths is:

```text
1 → 2 → 3 → 5
```

It contains `3` edges.

Therefore:

```text
Diameter = 3
```

### Example 2

```text
Input: root = [1,2,3]

Output: 2
```

The longest path is:

```text
2 → 1 → 3
```

It contains `2` edges.

Therefore:

```text
Diameter = 2
```

---

## Constraints

* `1 <=` Number of nodes in the tree `<= 100`
* `-100 <= Node.val <= 100`

---

## Core Idea

For every node, the longest path passing through that node is:

```text
left subtree height + right subtree height
```

Therefore:

```text
Diameter at a node = leftHeight + rightHeight
```

We use **DFS (Depth First Search)** to calculate the height of each subtree.

While calculating the height, we also keep track of the **maximum diameter** found so far.

The height returned by each node is:

```text
1 + max(leftHeight, rightHeight)
```

---

## Approach

1. Create a variable to store the maximum diameter.
2. Start DFS from the root.
3. If the current node is `null`, return height `0`.
4. Recursively calculate the height of the left subtree.
5. Recursively calculate the height of the right subtree.
6. Calculate the diameter passing through the current node:

```text
leftHeight + rightHeight
```

7. Compare it with the maximum diameter found so far and update the maximum if necessary.
8. Return the height of the current node:

```text
1 + max(leftHeight, rightHeight)
```

9. After DFS completes, return the maximum diameter.

---

## Dry Run

Consider the tree:

```text
        1
       / \
      2   3
     / \
    4   5
```

### Step 1: Node `4`

Node `4` is a leaf.

```text
leftHeight  = 0
rightHeight = 0

diameter = 0 + 0 = 0

height = 1
```

---

### Step 2: Node `5`

Node `5` is also a leaf.

```text
leftHeight  = 0
rightHeight = 0

diameter = 0

height = 1
```

---

### Step 3: Node `2`

The left and right subtree heights are:

```text
leftHeight  = 1
rightHeight = 1
```

Diameter through node `2`:

```text
diameter = 1 + 1
         = 2
```

Height of node `2`:

```text
height = 1 + max(1, 1)
       = 2
```

Current maximum diameter:

```text
2
```

---

### Step 4: Node `3`

Node `3` is a leaf.

```text
leftHeight  = 0
rightHeight = 0

diameter = 0

height = 1
```

---

### Step 5: Node `1`

Now:

```text
leftHeight  = 2
rightHeight = 1
```

Diameter through node `1`:

```text
diameter = 2 + 1
         = 3
```

Update the maximum diameter:

```text
maxDiameter = max(2, 3)
            = 3
```

The longest path is:

```text
4 → 2 → 1 → 3
```

or

```text
5 → 2 → 1 → 3
```

There are `3` edges.

Therefore:

```text
Diameter = 3
```

---

## Complexity Analysis

### Time Complexity

**O(n)**

Each node in the binary tree is visited exactly once.

### Space Complexity

**O(n)** in the worst case due to the recursion stack.

For a balanced binary tree, the recursion depth is **O(log n)**.

---

## Java Solution

Solution available in the submission file.

# Container With Most Water

## Problem Statement

You are given an integer array `heights` where `heights[i]` represents the height of the `i-th` bar.

Choose any two bars to form a container.

Return the maximum amount of water the container can store.

---

## Example 1

Input:

```txt
height = [1,7,2,5,4,7,3,6]
```

Output:

```txt
36
```

Explanation:

The maximum area is formed by bars with heights:

```txt
7 and 6
```

Width:

```txt
6
```

Area:

```txt
6 × 6 = 36
```

---

## Example 2

Input:

```txt
height = [2,2,2]
```

Output:

```txt
4
```

Explanation:

```txt
Height = 2
Width = 2

Area = 2 × 2 = 4
```

---

## Constraints

```txt
2 <= height.length <= 1000
0 <= height[i] <= 1000
```

---

## Approach

1. Initialize two pointers:
   - `left = 0`
   - `right = height.length - 1`

2. Calculate:

```txt
height = min(heights[left], heights[right])
```

3. Calculate area:

```txt
area = height × (right - left)
```

4. Update maximum area.

5. Move the pointer with smaller height:
   - If left height is smaller → move left pointer
   - Otherwise → move right pointer

6. Continue until pointers meet.

---

## Core Idea

The water stored between two bars depends on:

```txt
min(leftHeight, rightHeight) × width
```

The shorter bar limits the height of the container.

Therefore:

- Moving the taller bar cannot increase area
- Move the shorter bar to possibly find a taller bar

This helps achieve an optimal solution.

---

## Dry Run

Input:

```txt
height = [1,7,2,5,4,7,3,6]
```

Initial:

```txt
left = 0
right = 7

max = 0
```

### Iteration 1

```txt
height = min(1,6) = 1
width = 7

area = 1 × 7 = 7
```

```txt
max = 7
```

Move:

```txt
left++
```

---

### Iteration 2

```txt
left = 1
right = 7

height = min(7,6) = 6
width = 6

area = 6 × 6 = 36
```

```txt
max = 36
```

Move:

```txt
right--
```

---

### Iteration 3

```txt
left = 1
right = 6

height = min(7,3) = 3
width = 5

area = 15
```

```txt
max = 36
```

Move:

```txt
right--
```

---

Continue until:

```txt
left >= right
```

Final Answer:

```txt
36
```

---

## Complexity Analysis

Time Complexity:

```txt
O(n)
```

Reason:

Each pointer moves at most once through the array.

---

Space Complexity:

```txt
O(1)
```

Reason:

Only a few variables are used.

---

## Data Structure Used

- Array
- Two Pointers

---

## Java Solution

Code available in submission file.

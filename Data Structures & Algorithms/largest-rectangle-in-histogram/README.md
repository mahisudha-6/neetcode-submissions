# Largest Rectangle in Histogram

## Problem Statement

You are given an integer array `heights` where `heights[i]` represents the height of a histogram bar. The width of each bar is `1`.

Return the area of the largest rectangle that can be formed in the histogram.

---

## Example 1

Input:

```txt
heights = [7,1,7,2,2,4]
```

Output:

```txt
8
```

Explanation:

The largest rectangle has height `2` and width `4`.

---

## Example 2

Input:

```txt
heights = [1,3,7]
```

Output:

```txt
7
```

Explanation:

The largest rectangle is formed by the last bar with height `7`.

---

## Constraints

```txt
1 <= heights.length <= 1000

0 <= heights[i] <= 1000
```

---

## Approach

1. Create an empty stack to store indices.
2. Traverse the histogram from left to right.
3. If the current bar is taller than or equal to the bar at the top of the stack, push its index.
4. If the current bar is smaller, repeatedly pop indices from the stack.
5. For every popped bar:
   - Calculate its height.
   - Find its width using the current index and the new stack top.
   - Compute the rectangle area.
   - Update the maximum area.
6. After processing all bars, use a height of `0` to pop the remaining bars and calculate their areas.

---

## Core Idea

The stack stores indices of bars in increasing height order.

Whenever a shorter bar is found:

- Pop taller bars.
- Calculate the maximum rectangle that can be formed using the popped bar as the smallest height.
- Continue until the stack becomes increasing again.

This is called a **Monotonic Increasing Stack**.

---

## Dry Run

Input:

```txt
heights = [7,1,7,2,2,4]
```

Initial:

```txt
Stack = []
maxArea = 0
```

---

i = 0

```txt
height = 7
```

Push index 0

```txt
Stack = [0]
```

---

i = 1

```txt
height = 1
```

1 < 7

Pop index 0

```txt
Height = 7
Width = 1
Area = 7
maxArea = 7
```

Push index 1

```txt
Stack = [1]
```

---

i = 2

```txt
height = 7
```

Push index 2

```txt
Stack = [1,2]
```

---

i = 3

```txt
height = 2
```

2 < 7

Pop index 2

```txt
Height = 7
Width = 1
Area = 7
maxArea = 7
```

Push index 3

```txt
Stack = [1,3]
```

---

i = 4

```txt
height = 2
```

Push index 4

```txt
Stack = [1,3,4]
```

---

i = 5

```txt
height = 4
```

Push index 5

```txt
Stack = [1,3,4,5]
```

---

i = 6 (Dummy height = 0)

Pop index 5

```txt
Height = 4
Width = 1
Area = 4
```

Pop index 4

```txt
Height = 2
Width = 4
Area = 8
maxArea = 8
```

Pop index 3

```txt
Height = 2
Width = 4
Area = 8
```

Pop index 1

```txt
Height = 1
Width = 6
Area = 6
```

Final Answer:

```txt
8
```

---

## Complexity Analysis

### Time Complexity

```txt
O(n)
```

Reason:

Each index is pushed and popped from the stack at most once.

---

### Space Complexity

```txt
O(n)
```

Reason:

The stack may store all indices in the worst case.

---

## Data Structure Used

- Stack
- Array

---

## Java Solution

Code available in submission file.

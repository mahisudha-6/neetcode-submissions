# Two Integer Sum II

## Problem Statement

Given a sorted integer array `numbers` in non-decreasing order, return the indices (1-indexed) of two numbers such that they add up to a given target.

There is exactly one valid solution.

You may not use the same element twice.

The solution must use `O(1)` additional space.

---

## Example 1

Input:
```txt
numbers = [1,2,3,4]
target = 3
```

Output:
```txt
[1,2]
```

Explanation:

```txt
numbers[0] + numbers[1] = 1 + 2 = 3
```

Since the array is 1-indexed:

```txt
index1 = 1
index2 = 2
```

---

## Constraints

```txt
2 <= numbers.length <= 1000
-1000 <= numbers[i] <= 1000
-1000 <= target <= 1000
```

---

## Approach

1. Initialize two pointers:
   - `left = 0`
   - `right = numbers.length - 1`

2. Calculate:

```txt
sum = numbers[left] + numbers[right]
```

3. If `sum == target`
   - return indices `(left + 1, right + 1)`

4. If `sum < target`
   - move left pointer forward

5. If `sum > target`
   - move right pointer backward

6. Continue until target is found.

---

## Core Idea

Since the array is already sorted:

- If current sum is smaller than target:
  - move left pointer right to increase sum

- If current sum is greater than target:
  - move right pointer left to decrease sum

This avoids checking all pairs and gives an efficient solution.

---

## Dry Run

Input:

```txt
numbers = [1,2,3,4]
target = 3
```

Initial:

```txt
left = 0
right = 3
```

### Iteration 1

```txt
sum = 1 + 4 = 5
```

```txt
5 > 3
```

Move:

```txt
right--
```

Now:

```txt
left = 0
right = 2
```

---

### Iteration 2

```txt
sum = 1 + 3 = 4
```

```txt
4 > 3
```

Move:

```txt
right--
```

Now:

```txt
left = 0
right = 1
```

---

### Iteration 3

```txt
sum = 1 + 2 = 3
```

Target found.

Return:

```txt
[left + 1, right + 1]

[1,2]
```

---

## Complexity Analysis

Time Complexity:

```txt
O(n)
```

Reason:

Each pointer moves at most `n` times.

Space Complexity:

```txt
O(1)
```

Reason:

Only two pointers and one result array are used.

---

## Data Structure Used

- Array
- Two Pointers

---

## Java Solution

Code available in submission file.

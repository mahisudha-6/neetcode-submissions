# Binary Search

## Problem Statement

You are given a sorted array of distinct integers `nums` and an integer `target`.

Return the index of `target` if it exists in the array. Otherwise, return `-1`.

The solution must run in `O(log n)` time.

---

## Example 1

Input:

```txt
nums = [-1,0,2,4,6,8]
target = 4
```

Output:

```txt
3
```

Explanation:

The target `4` is present at index `3`.

---

## Example 2

Input:

```txt
nums = [-1,0,2,4,6,8]
target = 3
```

Output:

```txt
-1
```

Explanation:

The target `3` is not present in the array.

---

## Constraints

```txt
1 <= nums.length <= 10000

-10000 < nums[i], target < 10000

All elements in nums are unique.
```

---

## Approach

1. Initialize two pointers:
   - `left = 0`
   - `right = nums.length - 1`
2. Find the middle index.
3. If the middle element equals the target, return its index.
4. If the target is greater than the middle element, search the right half.
5. Otherwise, search the left half.
6. Repeat until `left > right`.
7. If the target is not found, return `-1`.

---

## Core Idea

Since the array is sorted, compare the target with the middle element.

- If target is greater, discard the left half.
- If target is smaller, discard the right half.
- Continue searching in the remaining half.

Each comparison reduces the search space by half.

---

## Dry Run

Input:

```txt
nums = [-1,0,2,4,6,8]
target = 4
```

Initial:

```txt
left = 0
right = 5
```

---

Iteration 1

```txt
mid = (0 + 5) / 2 = 2

nums[mid] = 2
```

Since

```txt
2 < 4
```

Move left pointer.

```txt
left = 3
right = 5
```

---

Iteration 2

```txt
mid = (3 + 5) / 2 = 4

nums[mid] = 6
```

Since

```txt
6 > 4
```

Move right pointer.

```txt
left = 3
right = 3
```

---

Iteration 3

```txt
mid = (3 + 3) / 2 = 3

nums[mid] = 4
```

Target found.

```txt
Return 3
```

---

## Complexity Analysis

### Time Complexity

```txt
O(log n)
```

Reason:

The search space is reduced to half in every iteration.

---

### Space Complexity

```txt
O(1)
```

Reason:

Only a few variables are used regardless of the input size.

---

## Data Structure Used

- Array

---

## Java Solution

Code available in submission file.

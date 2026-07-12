# Search in Rotated Sorted Array

## Problem Statement

You are given a sorted array `nums` that has been rotated at an unknown pivot. All elements in the array are unique.

Given an integer `target`, return its index if it exists in the array. Otherwise, return `-1`.

The solution must run in `O(log n)` time.

---

## Example 1

Input:

```txt
nums = [3,4,5,6,1,2]
target = 1
```

Output:

```txt
4
```

Explanation:

The target `1` is present at index `4`.

---

## Example 2

Input:

```txt
nums = [3,5,6,0,1,2]
target = 4
```

Output:

```txt
-1
```

Explanation:

The target `4` is not present in the array.

---

## Constraints

```txt
1 <= nums.length <= 1000

-1000 <= nums[i] <= 1000

-1000 <= target <= 1000

All elements are unique.

nums is a sorted array that may be rotated.
```

---

## Approach

1. Initialize two pointers:
   - `low = 0`
   - `high = nums.length - 1`
2. Find the middle element.
3. If the middle element is the target, return its index.
4. Check which half of the array is sorted.
5. If the left half is sorted:
   - Check whether the target lies within the left half.
   - If yes, search the left half.
   - Otherwise, search the right half.
6. If the right half is sorted:
   - Check whether the target lies within the right half.
   - If yes, search the right half.
   - Otherwise, search the left half.
7. Repeat until the target is found or the search space becomes empty.
8. Return `-1` if the target is not found.

---

## Core Idea

In a rotated sorted array, at least one half is always sorted.

- Identify the sorted half.
- Check whether the target belongs to that half.
- Discard the other half.
- Continue Binary Search on the remaining half.

This allows searching in logarithmic time.

---

## Dry Run

Input:

```txt
nums = [3,4,5,6,1,2]
target = 1
```

Initial:

```txt
low = 0
high = 5
```

---

Iteration 1

```txt
mid = (0 + 5) / 2 = 2

nums[mid] = 5
```

Left half is sorted.

```txt
[3,4,5]
```

Target `1` is not in this range.

Move right.

```txt
low = 3
```

---

Iteration 2

```txt
low = 3
high = 5

mid = (3 + 5) / 2 = 4

nums[mid] = 1
```

Target found.

```txt
Return 4
```

---

## Complexity Analysis

### Time Complexity

```txt
O(log n)
```

Reason:

Binary Search reduces the search space by half in every iteration.

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

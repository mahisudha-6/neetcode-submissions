# 3Sum

## Problem Statement

Given an integer array `nums`, return all unique triplets:

```txt
[nums[i], nums[j], nums[k]]
```
such that:

```txt
nums[i] + nums[j] + nums[k] = 0
```

where:

```txt
i != j != k
```

The output should not contain duplicate triplets.

You may return the triplets in any order.

---

## Example 1

Input:

```txt
nums = [-1,0,1,2,-1,-4]
```

Output:

```txt
[[-1,-1,2],[-1,0,1]]
```

Explanation:

```txt
(-1) + (-1) + 2 = 0
(-1) + 0 + 1 = 0
```

---

## Example 2

Input:

```txt
nums = [0,1,1]
```

Output:

```txt
[]
```

Explanation:

```txt
No triplet sums to 0.
```

---

## Example 3

Input:

```txt
nums = [0,0,0]
```

Output:

```txt
[[0,0,0]]
```

Explanation:

```txt
0 + 0 + 0 = 0
```

---

## Constraints

```txt
3 <= nums.length <= 1000
-10^5 <= nums[i] <= 10^5
```

---

## Approach

1. Sort the array.
2. Traverse the array using index `i`.
3. Skip duplicate values of `nums[i]`.
4. Use two pointers:

   * `left = i + 1`
   * `right = nums.length - 1`
5. Calculate:

```txt
sum = nums[i] + nums[left] + nums[right]
```

6. If sum is 0:

   * Add triplet to result.
   * Move both pointers.
   * Skip duplicate values.

7. If sum < 0:

   * Move left pointer.

8. If sum > 0:

   * Move right pointer.

9. Continue until `left >= right`.

---

## Core Idea

After sorting the array:

* Fix one element.
* Use two pointers to find the remaining two elements.
* Skip duplicates to avoid repeated triplets.

Sorting helps efficiently search for valid triplets.

---

## Dry Run

Input:

```txt
nums = [-1,0,1,2,-1,-4]
```

After sorting:

```txt
[-4,-1,-1,0,1,2]
```

### i = 0

```txt
nums[i] = -4
left = 1
right = 5
```

```txt
sum = -4 + (-1) + 2 = -3
```

Move left pointer.

No valid triplet found.

---

### i = 1

```txt
nums[i] = -1
left = 2
right = 5
```

```txt
sum = -1 + (-1) + 2 = 0
```

Add:

```txt
[-1,-1,2]
```

Move both pointers.

---

Now:

```txt
left = 3
right = 4
```

```txt
sum = -1 + 0 + 1 = 0
```

Add:

```txt
[-1,0,1]
```

Move both pointers.

---

Result:

```txt
[[-1,-1,2],[-1,0,1]]
```

---

## Complexity Analysis

Time Complexity:

```txt
O(n²)
```

Reason:

For each element, the two pointers scan the remaining array.

---

Space Complexity:

```txt
O(1)
```

Reason:

Only pointers are used (excluding output list).

---

## Data Structure Used

* Array
* Two Pointers

---

## Java Solution

Code available in submission file.

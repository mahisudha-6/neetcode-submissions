# Median of Two Sorted Arrays

## Problem Statement

Given two sorted integer arrays `nums1` and `nums2`, return the median of the two sorted arrays.

The overall run time complexity must be `O(log(m+n))`.

---

## Example 1

Input:
```txt
nums1 = [1,2]
nums2 = [3]
```

Output:
```txt
2.0
```

Explanation:

Merged array:
```txt
[1,2,3]
```

Median = `2`

---

## Example 2

Input:
```txt
nums1 = [1,3]
nums2 = [2,4]
```

Output:
```txt
2.5
```

Explanation:

Merged array:
```txt
[1,2,3,4]
```

Median:
```txt
(2 + 3) / 2 = 2.5
```

---

## Constraints

```txt
0 <= nums1.length <= 1000
0 <= nums2.length <= 1000
-10^6 <= nums1[i], nums2[i] <= 10^6
```

---

## Approach

1. Always perform Binary Search on the smaller array.
2. Partition both arrays into left and right halves.
3. Find the partition positions.
4. Compare the boundary elements of both partitions.
5. If partition is valid, calculate the median.
6. Otherwise move Binary Search left or right.
7. Return the median.

---

## Core Idea

Instead of merging both arrays, partition them such that:

- Left half contains half of the total elements.
- Every element in the left half is less than or equal to every element in the right half.

Once a valid partition is found, the median can be calculated directly.

---

## Dry Run

Input:

```txt
nums1 = [1,3]
nums2 = [2,4]
```

Initial values:

```txt
low = 0
high = 2
```

### Iteration 1

```txt
i = 1
j = 1
```

Partitions:

```txt
left1 = 1
right1 = 3

left2 = 2
right2 = 4
```

Check:

```txt
left1 <= right2 ✔
left2 <= right1 ✔
```

Valid partition found.

Total elements = 4 (Even)

Median:

```txt
(max(1,2) + min(3,4)) / 2

= (2 + 3) / 2

= 2.5
```

Return:

```txt
2.5
```

---

## Complexity Analysis

Time Complexity:

```txt
O(log(min(m,n)))
```

Space Complexity:

```txt
O(1)
```

---

## Data Structure Used

- Arrays
- Binary Search

---

## Java Solution

Code available in submission file.

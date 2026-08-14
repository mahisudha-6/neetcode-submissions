# Find the Duplicate Number

## Problem Statement

Given an array of integers `nums` containing `n + 1` integers, where each integer is in the range `[1, n]`, find the **one repeated integer**.

The array must not be modified, and the solution should use **O(1) extra space**.

---

## Example 1

Input:

```txt
nums = [1,2,3,2,2]
```

Output:

```txt
2
```

---

## Example 2

Input:

```txt
nums = [1,2,3,4,4]
```

Output:

```txt
4
```

---

## Constraints

```txt
1 <= n <= 10,000
nums.length == n + 1
1 <= nums[i] <= n
```

---

## Approach (Submission 0 - Sorting)

This submission uses **sorting** to find the duplicate number.

### Step 1

Sort the array in ascending order.

For example:

```txt
Before:
[1,2,3,2,2]

After sorting:
[1,2,2,2,3]
```

### Step 2

Traverse the sorted array and compare every element with the next element.

If:

```txt
nums[i] == nums[i + 1]
```

then `nums[i]` is the duplicate number.

### Step 3

Return the duplicate number.

---

## Core Idea

After sorting, duplicate values will appear next to each other.

For example:

```txt
[1,2,2,3,4]
   ↑ ↑
 duplicate
```

So we only need to check adjacent elements.

---

## Dry Run

Input:

```txt
nums = [1,2,3,2,2]
```

### After Sorting

```txt
[1,2,2,2,3]
```

### Comparison

```txt
1 == 2 → false
2 == 2 → true
```

Therefore:

```txt
Duplicate = 2
```

---

## Complexity Analysis

### Time Complexity

```txt
O(n log n)
```

Sorting the array takes `O(n log n)` time.

### Space Complexity

```txt
O(1)
```

No additional data structure is explicitly used.

> Note: The exact auxiliary space used internally by Java's sorting implementation can depend on the sorting algorithm and JVM implementation.

---

## Data Structure Used

* Array

---

## Techniques Used

* Sorting
* Linear Traversal
* Adjacent Element Comparison

---

##  Follow-Up

The optimal solution should satisfy:

```txt
Time: O(n)
Space: O(1)
```

without modifying the input array.

A better approach is **Floyd's Cycle Detection Algorithm**, which treats the array like a linked list and finds the duplicate without sorting.

---

## Java Solution

Code available in submission file.

# Two Sum

## Problem Statement

Given an integer array `nums` and an integer `target`, return the indices `i` and `j` such that:

```txt
nums[i] + nums[j] = target
```

where:

```txt
i != j
```

You may assume that every input has exactly one valid answer.

Return the answer with the smaller index first.

---

## Example 1

Input:

```txt
nums = [3,4,5,6]
target = 7
```

Output:

```txt
[0,1]
```

Explanation:

```txt
nums[0] + nums[1] = 3 + 4 = 7
```

---

## Example 2

Input:

```txt
nums = [4,5,6]
target = 10
```

Output:

```txt
[0,2]
```

Explanation:

```txt
nums[0] + nums[2] = 4 + 6 = 10
```

---

## Example 3

Input:

```txt
nums = [5,5]
target = 10
```

Output:

```txt
[0,1]
```

Explanation:

```txt
nums[0] + nums[1] = 5 + 5 = 10
```

---

## Constraints

```txt
2 <= nums.length <= 1000
-10,000,000 <= nums[i] <= 10,000,000
-10,000,000 <= target <= 10,000,000
Only one valid answer exists.
```

---

## Approach

1. Create a HashMap
2. Traverse the array
3. Find the complement

```txt
complement = target - nums[i]
```

4. Check whether complement already exists in HashMap
5. If it exists:
   - return stored index and current index
6. Otherwise:
   - store current element and its index in HashMap
7. Continue until pair is found

---

## Core Idea

For every element:

```txt
nums[i]
```

find the value needed to reach target:

```txt
target - nums[i]
```

If that value already exists in HashMap, then we found the answer.

HashMap provides fast lookup in constant time.

---

## Dry Run

Input:

```txt
nums = [3,4,5,6]
target = 7
```

Initial HashMap:

```txt
{}
```

### i = 0

```txt
nums[i] = 3
complement = 7 - 3 = 4
```

```txt
4 not found
```

Store:

```txt
{3=0}
```

---

### i = 1

```txt
nums[i] = 4
complement = 7 - 4 = 3
```

```txt
3 found in HashMap
```

Index of 3:

```txt
0
```

Current index:

```txt
1
```

Return:

```txt
[0,1]
```

---

## Complexity Analysis

Time Complexity:

```txt
O(n)
```

Reason:

Traverse the array once and HashMap lookup takes O(1) on average.

Space Complexity:

```txt
O(n)
```

Reason:

HashMap may store all elements in the worst case.

---

## Data Structure Used

- HashMap

---

## Java Solution

Code available in submission file.

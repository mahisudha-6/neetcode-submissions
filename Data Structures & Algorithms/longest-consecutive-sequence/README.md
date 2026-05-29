# Longest Consecutive Sequence

## Problem Statement

Given an integer array `nums`, return the length of the longest consecutive sequence of elements that can be formed.

A consecutive sequence means each element is exactly `1` greater than the previous element.

The algorithm must run in `O(n)` time.

---

## Example 1

Input:
```txt
nums = [2,20,4,10,3,4,5]
```

Output:
```txt
4
```

Explanation:
Longest consecutive sequence is:
```txt
[2,3,4,5]
```

---

## Example 2

Input:
```txt
nums = [0,3,2,5,4,6,1,1]
```

Output:
```txt
7
```

Explanation:
Longest consecutive sequence is:
```txt
[0,1,2,3,4,5,6]
```

---

## Constraints

```txt
0 <= nums.length <= 1000
-10^9 <= nums[i] <= 10^9
```

---

## Approach

1. Insert all elements into HashSet
2. Traverse through set elements
3. Check whether `curr - 1` exists in set
4. If it exists → skip current element
5. Otherwise → current element is starting point
6. Count consecutive sequence length using while loop
7. Update maximum sequence length

---

## Core Idea

To avoid unnecessary traversal:

- Start sequence only from starting elements
- Skip middle elements of sequences

Example:
```txt
For sequence [1,2,3,4]

Start from 1 only
Do not start from 2,3,4
```

This helps achieve linear time complexity.

---

## Dry Run

Input:
```txt
nums = [100,4,200,1,3,2]
```

HashSet:
```txt
{100,4,200,1,3,2}
```

### curr = 100

- `99` is not present in set
- So `100` is starting point

```txt
length = 1
```

`101` is not present in set.

```txt
max = max(1,0) = 1
```

Sequence:
```txt
[100]
```

---

### curr = 4

- `3` is present in set
- So `4` is not starting point

```txt
skip
```

---

### curr = 200

- `199` is not present in set
- So `200` is starting point

```txt
length = 1
```

`201` is not present in set.

```txt
max = max(1,1) = 1
```

Sequence:
```txt
[200]
```

---

### curr = 1

- `0` is not present in set
- So `1` is starting point

Check consecutive elements:

```txt
2 present
3 present
4 present
```

```txt
length = 4
```

```txt
max = max(4,1) = 4
```

Longest sequence:
```txt
[1,2,3,4]
```

---

## Complexity Analysis

Time Complexity:
```txt
O(n)
```

Reason:
Each element is processed at most once.

Space Complexity:
```txt
O(n)
```

Reason:
HashSet stores all unique elements.

---

## Data Structure Used

- HashSet

---

## Java Solution

Code available in submission file.

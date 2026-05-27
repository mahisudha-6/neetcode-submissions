# Contains Duplicate

## Problem Statement

Given an integer array `nums`, return:

- `true` if any value appears more than once
- `false` if all elements are unique

---

## Example 1

Input:
```txt
nums = [1,2,3,3]
```

Output:
```txt
true
```

Explanation:
Element `3` appears more than once.

---

## Example 2

Input:
```txt
nums = [1,2,3,4]
```

Output:
```txt
false
```

Explanation:
All elements are distinct.

---

## Constraints

```txt
0 <= nums.length <= 10^5
-10^9 <= nums[i] <= 10^9
```

---

## Approach

### Idea
Use a `HashSet` to store visited elements.

### Steps

1. Create a HashSet
2. Traverse each element in array
3. Check whether element already exists in set
4. If yes → return true
5. Otherwise add element into set
6. Finish traversal → return false

---

## Core Concept

`HashSet` stores only unique elements.

- Existing element → duplicate found
- New element → insert into set

HashSet lookup works in constant time on average.

---

## Dry Run

Input:
```txt
nums = [1,2,3,2]
```

| Current Element | Set Before | Action | Set After |
|-----------------|------------|---------|------------|
| 1 | {} | add | {1} |
| 2 | {1} | add | {1,2} |
| 3 | {1,2} | add | {1,2,3} |
| 2 | {1,2,3} | duplicate found | stop |

Return:
```txt
true
```

---

## Complexity Analysis

Time Complexity:

```txt
O(n)
```

Reason:

Traverse array once and HashSet lookup is average O(1)

Space Complexity:

```txt
O(n)
```

Reason:

In worst case all elements are unique.
---

## Data Structure Used

- HashSet

---

## Java Solution

Code available in submission file.

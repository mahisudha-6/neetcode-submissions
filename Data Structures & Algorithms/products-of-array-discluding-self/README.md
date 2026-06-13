# Products of Array Except Self

## Problem Statement

Given an integer array `nums`, return an array `output` where:

```txt
output[i] = product of all elements except nums[i]
```

Each product is guaranteed to fit in a 32-bit integer.

The solution should run in:

```txt
O(n)
```

time without using division.

---

## Example 1

Input:

```txt
nums = [1,2,4,6]
```

Output:

```txt
[48,24,12,8]
```

Explanation:

```txt
output[0] = 2×4×6 = 48
output[1] = 1×4×6 = 24
output[2] = 1×2×6 = 12
output[3] = 1×2×4 = 8
```

---

## Example 2

Input:

```txt
nums = [-1,0,1,2,3]
```

Output:

```txt
[0,-6,0,0,0]
```

---

## Constraints

```txt
2 <= nums.length <= 1000
-20 <= nums[i] <= 20
```

---

## Approach

1. Create a prefix product array.
2. Store product of all elements before the current index.
3. Traverse from right to left using a suffix product variable.
4. Multiply prefix product with suffix product.
5. Update suffix product during traversal.
6. Return the resulting array.

---

## Core Idea

For every index:

```txt
Product Except Self =
(Product of all elements on left)
×
(Product of all elements on right)
```

Instead of calculating repeatedly, store:

* Prefix products
* Suffix products

This allows finding the answer for every index in one traversal.

---

## Dry Run

Input:

```txt
nums = [1,2,4,6]
```

### Step 1: Build Prefix Array

```txt
prefix[0] = 1

prefix[1] = 1
prefix[2] = 2
prefix[3] = 8
```

Prefix Array:

```txt
[1,1,2,8]
```

---

### Step 2: Traverse From Right

Initial:

```txt
suffixMult = 1
```

Index 3:

```txt
prefix[3] = 8 × 1 = 8
suffixMult = 1 × 6 = 6
```

Result:

```txt
[1,1,2,8]
```

---

Index 2:

```txt
prefix[2] = 2 × 6 = 12
suffixMult = 6 × 4 = 24
```

Result:

```txt
[1,1,12,8]
```

---

Index 1:

```txt
prefix[1] = 1 × 24 = 24
suffixMult = 24 × 2 = 48
```

Result:

```txt
[1,24,12,8]
```

---

Index 0:

```txt
prefix[0] = 1 × 48 = 48
```

Result:

```txt
[48,24,12,8]
```

---

Final Answer:

```txt
[48,24,12,8]
```

---

## Complexity Analysis

Time Complexity:

```txt
O(n)
```

Reason:

Two linear traversals of the array.

---

Space Complexity:

```txt
O(n)
```

Reason:

An output array is used to store prefix products.

---

## Data Structure Used

* Array

---

## Java Solution

Code available in submission file.

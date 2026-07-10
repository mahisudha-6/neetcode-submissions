# Search a 2D Matrix

## Problem Statement

You are given an `m × n` integer matrix where:

- Each row is sorted in non-decreasing order.
- The first element of every row is greater than the last element of the previous row.

Return `true` if the target exists in the matrix, otherwise return `false`.

The solution must run in `O(log(m × n))` time.

---

## Example 1

Input:

```txt
matrix = [[1,2,4,8],
          [10,11,12,13],
          [14,20,30,40]]

target = 10
```

Output:

```txt
true
```

Explanation:

The target `10` is present in the matrix.

---

## Example 2

Input:

```txt
matrix = [[1,2,4,8],
          [10,11,12,13],
          [14,20,30,40]]

target = 15
```

Output:

```txt
false
```

Explanation:

The target `15` is not present in the matrix.

---

## Constraints

```txt
1 <= m, n <= 100

-10000 <= matrix[i][j], target <= 10000
```

---

## Approach

1. Consider the entire matrix as a single sorted array.
2. Initialize:
   - `low = 0`
   - `high = (m × n) - 1`
3. Find the middle index.
4. Convert the middle index into row and column:
   - `row = mid / n`
   - `col = mid % n`
5. Compare `matrix[row][col]` with the target.
6. If equal, return `true`.
7. If the target is smaller, search the left half.
8. Otherwise, search the right half.
9. If the target is not found, return `false`.

---

## Core Idea

Since every row starts with a value greater than the previous row's last value, the entire matrix behaves like one sorted array.

Using Binary Search on this virtual array allows searching in logarithmic time.

---

## Dry Run

Input:

```txt
matrix = [[1,2,4,8],
          [10,11,12,13],
          [14,20,30,40]]

target = 10
```

Initial:

```txt
m = 3
n = 4

low = 0
high = 11
```

---

Iteration 1

```txt
mid = (0 + 11) / 2 = 5

row = 5 / 4 = 1
col = 5 % 4 = 1

matrix[1][1] = 11
```

Since

```txt
10 < 11
```

Move high.

```txt
high = 4
```

---

Iteration 2

```txt
mid = (0 + 4) / 2 = 2

row = 2 / 4 = 0
col = 2 % 4 = 2

matrix[0][2] = 4
```

Since

```txt
10 > 4
```

Move low.

```txt
low = 3
```

---

Iteration 3

```txt
mid = (3 + 4) / 2 = 3

row = 3 / 4 = 0
col = 3 % 4 = 3

matrix[0][3] = 8
```

Since

```txt
10 > 8
```

Move low.

```txt
low = 4
```

---

Iteration 4

```txt
mid = (4 + 4) / 2 = 4

row = 4 / 4 = 1
col = 4 % 4 = 0

matrix[1][0] = 10
```

Target found.

```txt
Return true
```

---

## Complexity Analysis

### Time Complexity

```txt
O(log(m × n))
```

Reason:

Binary Search halves the search space in every iteration.

---

### Space Complexity

```txt
O(1)
```

Reason:

Only a few variables are used regardless of the input size.

---

## Data Structure Used

- 2D Array

---

## Java Solution

Code available in submission file.

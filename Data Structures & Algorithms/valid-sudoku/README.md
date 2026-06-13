# Valid Sudoku

## Problem Statement

You are given a `9 x 9` Sudoku board.

A Sudoku board is valid if:

- Each row contains digits `1-9` without duplicates.
- Each column contains digits `1-9` without duplicates.
- Each `3 x 3` sub-box contains digits `1-9` without duplicates.

Return `true` if the board is valid, otherwise return `false`.

Note:

- The board does not need to be completely filled.
- The board does not need to be solvable.

---

## Example 1

Input:

```txt
board =
[["1","2",".",".","3",".",".",".","."],
 ["4",".",".","5",".",".",".",".","."],
 [".","9","8",".",".",".",".",".","3"],
 ["5",".",".",".","6",".",".",".","4"],
 [".",".",".","8",".","3",".",".","5"],
 ["7",".",".",".","2",".",".",".","6"],
 [".",".",".",".",".",".","2",".","."],
 [".",".",".","4","1","9",".",".","8"],
 [".",".",".",".","8",".",".","7","9"]]
```

Output:

```txt
true
```

---

## Example 2

Input:

```txt
board =
[["1","2",".",".","3",".",".",".","."],
 ["4",".",".","5",".",".",".",".","."],
 [".","9","1",".",".",".",".",".","3"],
 ["5",".",".",".","6",".",".",".","4"],
 [".",".",".","8",".","3",".",".","5"],
 ["7",".",".",".","2",".",".",".","6"],
 [".",".",".",".",".",".","2",".","."],
 [".",".",".","4","1","9",".",".","8"],
 [".",".",".",".","8",".",".","7","9"]]
```

Output:

```txt
false
```

Explanation:

```txt
There are two 1's in the top-left 3 x 3 box.
```

---

## Constraints

```txt
board.length == 9
board[i].length == 9
board[i][j] is a digit 1-9 or '.'
```

---

## Approach

1. Create a HashSet.
2. Traverse every cell in the board.
3. Ignore empty cells (`.`).
4. For every digit create:
   - Row key
   - Column key
   - Box key
5. Check if any key already exists in the HashSet.
6. If found:
   - Return `false`
7. Otherwise add all three keys into the HashSet.
8. After checking all cells:
   - Return `true`

---

## Core Idea

For every digit, store information about:

```txt
Digit in Row
Digit in Column
Digit in Box
```

If the same information appears again, it means a duplicate exists and the Sudoku board becomes invalid.

HashSet allows fast duplicate detection.

---

## Dry Run

Input:

```txt
board[0][0] = '1'
```

Create:

```txt
rowKey = "1 in row 0"
colKey = "1 in col 0"
boxKey = "1 in box 0-0"
```

HashSet:

```txt
{
 "1 in row 0",
 "1 in col 0",
 "1 in box 0-0"
}
```

---

Next Cell:

```txt
board[0][1] = '2'
```

Create:

```txt
rowKey = "2 in row 0"
colKey = "2 in col 1"
boxKey = "2 in box 0-0"
```

Not present in HashSet.

Add all keys.

---

Suppose another:

```txt
'1'
```

appears in the same box.

```txt
boxKey = "1 in box 0-0"
```

Already exists.

Return:

```txt
false
```

---

## Complexity Analysis

Time Complexity:

```txt
O(1)
```

Reason:

The board size is fixed at:

```txt
9 × 9 = 81 cells
```

---

Space Complexity:

```txt
O(1)
```

Reason:

The maximum number of stored entries is bounded by the fixed Sudoku board size.

---

## Data Structure Used

- HashSet

---

## Java Solution

Code available in submission file.

# Longest Substring Without Repeating Characters

## Problem Statement

Given a string `s`, find the length of the longest substring without duplicate characters.

A substring is a contiguous sequence of characters within a string.

---

## Example 1

Input:

```txt
s = "zxyzxyz"
```

Output:

```txt
3
```

Explanation:

```txt
The longest substring without repeating characters is "xyz".
```

---

## Example 2

Input:

```txt
s = "xxxx"
```

Output:

```txt
1
```

Explanation:

```txt
The longest substring without repeating characters is "x".
```

---

## Constraints

```txt
0 <= s.length <= 1000
s may consist of printable ASCII characters
```

---

## Approach

1. Create a HashSet to store unique characters.
2. Use two pointers:

   * left
   * right
3. Traverse the string using the right pointer.
4. If the current character already exists in the HashSet:

   * Remove characters from the left side.
   * Move left pointer forward.
5. Add the current character into the HashSet.
6. Calculate current window length.
7. Update maximum length.
8. Return the maximum length.

---

## Core Idea

Maintain a sliding window that always contains unique characters.

* If a duplicate character is found, shrink the window from the left.
* Otherwise expand the window to the right.

The window always represents a valid substring without repeating characters.

---

## Dry Run

Input:

```txt
s = "zxyzxyz"
```

Initial:

```txt
left = 0
max = 0
set = {}
```

---

right = 0

```txt
Character = z
```

Add to set:

```txt
{z}
```

Length:

```txt
1
```

max:

```txt
1
```

---

right = 1

```txt
Character = x
```

Add to set:

```txt
{z,x}
```

Length:

```txt
2
```

max:

```txt
2
```

---

right = 2

```txt
Character = y
```

Add to set:

```txt
{z,x,y}
```

Length:

```txt
3
```

max:

```txt
3
```

---

right = 3

```txt
Character = z
```

Duplicate found.

Remove:

```txt
z
```

Move left.

Set becomes:

```txt
{x,y}
```

Add current z:

```txt
{x,y,z}
```

Length:

```txt
3
```

max:

```txt
3
```

---

Continue similarly for remaining characters.

Final Answer:

```txt
3
```

---

## Complexity Analysis

Time Complexity:

```txt
O(n)
```

Reason:

Each character is added and removed from the HashSet at most once.

---

Space Complexity:

```txt
O(n)
```

Reason:

HashSet stores characters present in the current window.

---

## Data Structure Used

* HashSet
* Two Pointers (Sliding Window)

---

## Java Solution

Code available in submission file.

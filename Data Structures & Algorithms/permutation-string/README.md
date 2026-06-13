# Permutation in String

## Problem Statement

You are given two strings `s1` and `s2`.

Return `true` if `s2` contains a permutation of `s1`, otherwise return `false`.

A permutation means the characters are the same but can appear in a different order.

---

## Example 1

Input:

```txt
s1 = "abc"
s2 = "lecabee"
```

Output:

```txt
true
```

Explanation:

```txt
The substring "cab" is a permutation of "abc".
```

---

## Example 2

Input:

```txt
s1 = "abc"
s2 = "lecaabee"
```

Output:

```txt
false
```

Explanation:

```txt
No substring of length 3 contains the same character frequencies as "abc".
```

---

## Constraints

```txt
1 <= s1.length, s2.length <= 1000
```

---

## Approach

1. If `s1.length()` is greater than `s2.length()`, return `false`.
2. Create a frequency array for `s1`.
3. Create another frequency array for the current window in `s2`.
4. Fill the first window of size `s1.length()`.
5. Compare both frequency arrays.
6. If all frequencies match, return `true`.
7. Slide the window:

   * Remove the left character.
   * Add the right character.
   * Compare frequencies again.
8. If any window matches, return `true`.
9. Otherwise return `false`.

---

## Core Idea

Two strings are permutations of each other if they have the same frequency of every character.

Use a sliding window of length:

```txt
s1.length()
```

over `s2`.

If the frequency counts of the current window and `s1` are identical, then a permutation exists.

---

## Dry Run

Input:

```txt
s1 = "abc"
s2 = "lecabee"
```

Frequency of s1:

```txt
a = 1
b = 1
c = 1
```

---

First Window:

```txt
"lec"
```

Frequency:

```txt
l = 1
e = 1
c = 1
```

Not equal.

---

Slide Window:

```txt
"eca"
```

Frequency:

```txt
e = 1
c = 1
a = 1
```

Not equal.

---

Slide Window:

```txt
"cab"
```

Frequency:

```txt
c = 1
a = 1
b = 1
```

Matches s1 frequency.

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

The sliding window traverses `s2` once.

---

Space Complexity:

```txt
O(1)
```

Reason:

Two frequency arrays of size 26 are used.

---

## Data Structure Used

* Array
* Sliding Window
* Two Pointers

---

## Java Solution

Code available in submission file.

# Longest Repeating Character Replacement

## Problem Statement

You are given a string `s` consisting of uppercase English letters and an integer `k`.

You can replace at most `k` characters with any uppercase English character.

Return the length of the longest substring that can contain only one distinct character after performing at most `k` replacements.

---

## Example 1

Input:

```txt
s = "XYYX"
k = 2
```

Output:

```txt
4
```

Explanation:

```txt
Replace both X's with Y's

"XYYX" → "YYYY"
```

Length:

```txt
4
```

---

## Example 2

Input:

```txt
s = "AAABABB"
k = 1
```

Output:

```txt
5
```

Explanation:

```txt
Replace one B with A

"AAABA"
```

Length:

```txt
5
```

---

## Constraints

```txt
1 <= s.length <= 1000
0 <= k <= s.length
```

---

## Approach

1. Use a sliding window.
2. Maintain the frequency of characters inside the current window.
3. Track the character with maximum frequency.
4. Calculate:

```txt
Window Length - Maximum Frequency
```

5. If the value is greater than `k`, shrink the window from the left.
6. Otherwise expand the window.
7. Update the maximum window length.

---

## Core Idea

In a valid window:

```txt
(Window Length - Most Frequent Character Count) <= k
```

This means we can replace all other characters and make the entire window contain one repeating character.

If replacements required become greater than `k`, shrink the window.

---

## Dry Run

Input:

```txt
s = "XYYX"
k = 2
```

Initial:

```txt
left = 0
maxFreq = 0
res = 0
```

---

right = 0

```txt
Window = "X"
```

Frequency:

```txt
X = 1
```

```txt
maxFreq = 1
```

Window Length:

```txt
1
```

Valid:

```txt
1 - 1 = 0 <= 2
```

```txt
res = 1
```

---

right = 1

```txt
Window = "XY"
```

Frequency:

```txt
X = 1
Y = 1
```

```txt
maxFreq = 1
```

Valid:

```txt
2 - 1 = 1 <= 2
```

```txt
res = 2
```

---

right = 2

```txt
Window = "XYY"
```

Frequency:

```txt
X = 1
Y = 2
```

```txt
maxFreq = 2
```

Valid:

```txt
3 - 2 = 1 <= 2
```

```txt
res = 3
```

---

right = 3

```txt
Window = "XYYX"
```

Frequency:

```txt
X = 2
Y = 2
```

```txt
maxFreq = 2
```

Valid:

```txt
4 - 2 = 2 <= 2
```

```txt
res = 4
```

---

Final Answer:

```txt
4
```

---

## Complexity Analysis

Time Complexity:

```txt
O(n)
```

Reason:

Each character enters and leaves the sliding window at most once.

---

Space Complexity:

```txt
O(1)
```

Reason:

Frequency array size is fixed at 26 uppercase letters.

---

## Data Structure Used

* Array
* Sliding Window
* Two Pointers

---

## Java Solution

Code available in submission file.

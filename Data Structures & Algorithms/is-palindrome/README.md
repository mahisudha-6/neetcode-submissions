# Valid Palindrome

## Problem Statement

Given a string `s`, return `true` if it is a palindrome, otherwise return `false`.

A palindrome reads the same forward and backward.

The comparison should:
- Ignore uppercase and lowercase differences
- Ignore all non-alphanumeric characters

---

## Example 1

Input:
```txt
s = "Was it a car or a cat I saw?"
```

Output:
```txt
true
```

Explanation:

After removing non-alphanumeric characters and converting to lowercase:

```txt
wasitacaroracatisaw
```

This string reads the same forward and backward.

---

## Example 2

Input:
```txt
s = "tab a cat"
```

Output:
```txt
false
```

Explanation:

After removing spaces:

```txt
tabacat
```

This is not a palindrome.

---

## Constraints

```txt
1 <= s.length <= 1000
s contains only printable ASCII characters
```

---

## Approach

1. Initialize two pointers:
   - `left = 0`
   - `right = s.length() - 1`

2. Move `left` forward until it points to an alphanumeric character.

3. Move `right` backward until it points to an alphanumeric character.

4. Compare characters after converting both to lowercase.

5. If characters are different:
   - return `false`

6. Otherwise:
   - move both pointers inward

7. Continue until `left >= right`

8. If all characters match:
   - return `true`

---

## Core Idea

Use the Two Pointer technique.

- One pointer starts from the beginning
- One pointer starts from the end

Ignore:
- spaces
- punctuation marks
- special characters

Compare only alphanumeric characters in lowercase form.

---

## Dry Run

Input:
```txt
s = "A man, a plan, a canal: Panama"
```

Initial:

```txt
left = 0
right = 29
```

Comparisons:

```txt
A == a ✓
m == m ✓
a == a ✓
n == n ✓
```

Skip:

```txt
spaces
commas
colon
```

Continue comparing remaining characters.

All characters match.

Output:

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

Each character is visited at most once by either pointer.

Space Complexity:

```txt
O(1)
```

Reason:

No extra data structure is used.

---

## Data Structure Used

- Two Pointers

---

## Java Solution

Code available in submission file.

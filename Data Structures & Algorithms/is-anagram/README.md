# Valid Anagram

## Problem Statement

Given two strings `s` and `t`, return `true` if they are anagrams of each other, otherwise return `false`.

An anagram is a string that contains exactly the same characters as another string, but the order of characters may be different.

---

## Example 1

Input:

```txt
s = "racecar"
t = "carrace"
```

Output:

```txt
true
```

Explanation:

```txt
Both strings contain the same characters with the same frequencies.
```

---

## Example 2

Input:

```txt
s = "jar"
t = "jam"
```

Output:

```txt
false
```

Explanation:

```txt
Character 'r' is present in s but not in t.
```

---

## Constraints

```txt
1 <= s.length, t.length <= 5 * 10^4
s and t consist of lowercase English letters
```

---

## Approach

1. If lengths are different, return `false`.
2. Create a HashMap to store character frequencies.
3. Traverse string `s` and increment the count of each character.
4. Traverse string `t` and decrement the count of each character.
5. Check all values in the HashMap.
6. If any value is not `0`, return `false`.
7. Otherwise return `true`.

---

## Core Idea

Two strings are anagrams if:

```txt
Every character appears the same number of times in both strings.
```

Use a HashMap to count frequencies.

* Increment counts for characters in `s`
* Decrement counts for characters in `t`

If all counts become `0`, both strings are anagrams.

---

## Dry Run

Input:

```txt
s = "racecar"
t = "carrace"
```

### Step 1

Build frequency map using `s`:

```txt
r → 2
a → 2
c → 2
e → 1
```

HashMap:

```txt
{r=2, a=2, c=2, e=1}
```

---

### Step 2

Traverse `t` and decrease frequencies:

```txt
c → 1
a → 1
r → 1
r → 0
a → 0
c → 0
e → 0
```

HashMap:

```txt
{r=0, a=0, c=0, e=0}
```

---

### Step 3

Check all values:

```txt
All values are 0
```

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

Each string is traversed once.

---

Space Complexity:

```txt
O(n)
```

Reason:

HashMap stores character frequencies.

---

## Data Structure Used

* HashMap

---

## Java Solution

Code available in submission file.

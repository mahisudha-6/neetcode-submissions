# Group Anagrams

## Problem Statement

Given an array of strings `strs`, group all anagrams together into sublists.

An anagram is a word formed by rearranging the characters of another word while using all the original characters exactly once.

You may return the groups in any order.

---

## Example 1

Input:

```txt
strs = ["act","pots","tops","cat","stop","hat"]
```

Output:

```txt
[["hat"],["act","cat"],["stop","pots","tops"]]
```

Explanation:

```txt
act and cat are anagrams

pots, tops and stop are anagrams

hat has no anagram
```

---

## Example 2

Input:

```txt
strs = ["x"]
```

Output:

```txt
[["x"]]
```

---

## Example 3

Input:

```txt
strs = [""]
```

Output:

```txt
[[""]]
```

---

## Constraints

```txt
1 <= strs.length <= 1000
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters
```

---

## Approach

1. Create a HashMap.
2. Traverse each string in the array.
3. Convert the string into a character array.
4. Sort the character array.
5. Convert it back into a string.
6. Use the sorted string as the key in HashMap.
7. Add the original string to the corresponding list.
8. Return all values of the HashMap.

---

## Core Idea

All anagrams produce the same sorted string.

Example:

```txt
act → act
cat → act
tac → act
```

Since all have the same sorted form:

```txt
act
```

they belong to the same group.

Use the sorted string as the HashMap key.

---

## Dry Run

Input:

```txt
strs = ["act","cat","hat"]
```

### Process "act"

Sorted:

```txt
act
```

HashMap:

```txt
{
 act : [act]
}
```

---

### Process "cat"

Sorted:

```txt
act
```

HashMap:

```txt
{
 act : [act, cat]
}
```

---

### Process "hat"

Sorted:

```txt
aht
```

HashMap:

```txt
{
 act : [act, cat],
 aht : [hat]
}
```

---

Result:

```txt
[
 [act, cat],
 [hat]
]
```

---

## Complexity Analysis

Time Complexity:

```txt
O(n * k log k)
```

Reason:

* There are `n` strings.
* Sorting each string of length `k` takes `O(k log k)`.

---

Space Complexity:

```txt
O(n * k)
```

Reason:

HashMap stores all strings and their sorted keys.

---

## Data Structure Used

* HashMap
* ArrayList
* Character Array

---

## Java Solution

Code available in submission file.

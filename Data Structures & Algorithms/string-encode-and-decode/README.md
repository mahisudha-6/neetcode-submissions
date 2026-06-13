# Encode and Decode Strings

## Problem Statement

Design an algorithm to encode a list of strings into a single string and decode it back to the original list.

The decoded list must be exactly the same as the original list.

Implement:

```txt
encode(List<String> strs)
decode(String encodedString)
```

---

## Example 1

Input:

```txt
strs = ["Hello","World"]
```

Encoded String:

```txt
5#Hello5#World
```

Output:

```txt
["Hello","World"]
```

---

## Example 2

Input:

```txt
strs = [""]
```

Encoded String:

```txt
0#
```

Output:

```txt
[""]
```

---

## Constraints

```txt
0 <= strs.length < 100
0 <= strs[i].length < 200
strs[i] may contain any ASCII character
```

---

## Approach

### Encoding

1. Create a StringBuilder.
2. Traverse each string in the list.
3. Append:

   * Length of string
   * Delimiter '#'
   * Actual string
4. Return the final encoded string.

### Decoding

1. Traverse the encoded string.
2. Find the '#' character.
3. Extract the length before '#'.
4. Read exactly that many characters after '#'.
5. Add the extracted string to the result list.
6. Continue until the end of the encoded string.

---

## Core Idea

Store each string in the format:

```txt
length#string
```

Examples:

```txt
Hello → 5#Hello
World → 5#World
```

Even if the string contains special characters, the length tells us exactly how many characters belong to that string.

This makes decoding easy and reliable.

---

## Dry Run

Input:

```txt
["Hello","World"]
```

### Encoding

For:

```txt
Hello
```

Append:

```txt
5#Hello
```

For:

```txt
World
```

Append:

```txt
5#World
```

Encoded String:

```txt
5#Hello5#World
```

---

### Decoding

Start:

```txt
5#Hello5#World
```

Find:

```txt
#
```

Length:

```txt
5
```

Extract:

```txt
Hello
```

Move pointer.

Again find:

```txt
#
```

Length:

```txt
5
```

Extract:

```txt
World
```

Result:

```txt
["Hello","World"]
```

---

## Complexity Analysis

Time Complexity:

```txt
O(n)
```

Reason:

Each character is processed once during encoding and decoding.

---

Space Complexity:

```txt
O(n)
```

Reason:

The encoded string and decoded list store all characters.

---

## Data Structure Used

* StringBuilder
* ArrayList

---

## Java Solution

Code available in submission file.

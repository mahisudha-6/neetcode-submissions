# Valid Parentheses

## Problem Statement

You are given a string `s` consisting of the following characters:

```txt
( ) { } [ ]
```

The string is valid if:

1. Every open bracket is closed by the same type of bracket.
2. Open brackets are closed in the correct order.
3. Every closing bracket has a corresponding opening bracket.

Return `true` if the string is valid, otherwise return `false`.

---

## Example 1

Input:

```txt
s = "[]"
```

Output:

```txt
true
```

---

## Example 2

Input:

```txt
s = "([{}])"
```

Output:

```txt
true
```

---

## Example 3

Input:

```txt
s = "[(])"
```

Output:

```txt
false
```

Explanation:

```txt
Brackets are not closed in the correct order.
```

---

## Constraints

```txt
1 <= s.length <= 1000
```

---

## Approach

1. Create a Stack.
2. Traverse each character in the string.
3. If the character is an opening bracket, push it into the stack.
4. If the character is a closing bracket:

   * Check whether the stack is empty.
   * If empty, return false.
   * Otherwise pop the top element.
5. Verify whether the popped bracket matches the current closing bracket.
6. If not matched, return false.
7. After processing all characters, the stack should be empty.
8. Return true if the stack is empty, otherwise false.

---

## Core Idea

The most recently opened bracket must be closed first.

This follows the **Last In First Out (LIFO)** principle.

A Stack naturally supports this behavior.

Example:

```txt
([{}])

Push (
Push [
Push {

Encounter }
Pop {

Encounter ]
Pop [

Encounter )
Pop (
```

All brackets match correctly.

Therefore:

```txt
true
```

---

## Dry Run

Input:

```txt
s = "([{}])"
```

Initial:

```txt
Stack = []
```

---

Character:

```txt
(
```

Action:

```txt
Push (
```

Stack:

```txt
[(]
```

---

Character:

```txt
[
```

Action:

```txt
Push [
```

Stack:

```txt
[(, []
```

---

Character:

```txt
{
```

Action:

```txt
Push {
```

Stack:

```txt
[(, [, {]
```

---

Character:

```txt
}
```

Action:

```txt
Pop {
```

Matched.

Stack:

```txt
[(, []
```

---

Character:

```txt
]
```

Action:

```txt
Pop [
```

Matched.

Stack:

```txt
[(]
```

---

Character:

```txt
)
```

Action:

```txt
Pop (
```

Matched.

Stack:

```txt
[]
```

---

Traversal completed.

Stack is empty.

Return:

```txt
true
```

---

## Complexity Analysis

### Time Complexity

```txt
O(n)
```

Reason:

Each character is pushed and popped at most once.

---

### Space Complexity

```txt
O(n)
```

Reason:

In the worst case, all characters may be opening brackets and stored in the stack.

---

## Data Structure Used

* Stack

---

## Java Solution

Code available in submission file.

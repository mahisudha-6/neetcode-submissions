# Min Stack

## Problem Statement

Design a stack that supports the following operations in **O(1)** time:

* `push(val)` – Push an element onto the stack.
* `pop()` – Remove the top element.
* `top()` – Return the top element.
* `getMin()` – Return the minimum element currently in the stack.

---

## Example

Input:

```txt
push(5)
push(3)
push(7)
getMin()
pop()
getMin()
top()
```

Output:

```txt
3
3
3
```

Explanation:

```txt
Stack after push(5): [5]
Minimum = 5

Stack after push(3): [5,3]
Minimum = 3

Stack after push(7): [5,3,7]
Minimum = 3

getMin() → 3

pop() removes 7

Stack: [5,3]

getMin() → 3

top() → 3
```

---

## Approach

1. Create a stack of integer arrays.
2. Each array stores:

   * Current value.
   * Minimum value up to that point.
3. While pushing:

   * If the stack is empty, current value is the minimum.
   * Otherwise, compare the current value with the previous minimum.
4. Push both the value and current minimum into the stack.
5. For `pop()`, remove the top pair.
6. For `top()`, return the first element of the top pair.
7. For `getMin()`, return the second element of the top pair.

---

## Core Idea

Instead of maintaining a separate stack for minimum values, each stack element stores:

```txt
[value, minimumTillNow]
```

This allows retrieving the minimum element directly from the top of the stack.

Example:

```txt
Push 5

Stack:
[5,5]
```

```txt
Push 3

Minimum = min(3,5) = 3

Stack:
[5,5]
[3,3]
```

```txt
Push 7

Minimum = min(7,3) = 3

Stack:
[5,5]
[3,3]
[7,3]
```

Now:

```txt
top() = 7

getMin() = 3
```

---

## Dry Run

Input:

```txt
push(5)
push(2)
push(4)
getMin()
pop()
getMin()
```

Initial:

```txt
Stack = []
```

---

Operation:

```txt
push(5)
```

Stack:

```txt
[5,5]
```

---

Operation:

```txt
push(2)
```

Minimum:

```txt
min(2,5) = 2
```

Stack:

```txt
[5,5]
[2,2]
```

---

Operation:

```txt
push(4)
```

Minimum:

```txt
min(4,2) = 2
```

Stack:

```txt
[5,5]
[2,2]
[4,2]
```

---

Operation:

```txt
getMin()
```

Output:

```txt
2
```

---

Operation:

```txt
pop()
```

Stack:

```txt
[5,5]
[2,2]
```

---

Operation:

```txt
getMin()
```

Output:

```txt
2
```

---

## Complexity Analysis

### Time Complexity

```txt
push()    : O(1)
pop()     : O(1)
top()     : O(1)
getMin()  : O(1)
```

---

### Space Complexity

```txt
O(n)
```

Reason:

Each element stores two integers:

* Current value
* Minimum value up to that position

---

## Data Structure Used

* Stack
* Integer Array

---

## Java Solution

Code available in submission file.

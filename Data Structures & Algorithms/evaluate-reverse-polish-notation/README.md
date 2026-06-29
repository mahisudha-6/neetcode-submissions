# Evaluate Reverse Polish Notation

## Problem Statement

You are given an array of strings `tokens` representing a valid arithmetic expression in **Reverse Polish Notation (RPN)**.

Return the integer result after evaluating the expression.

The operators supported are:

```txt
+
-
*
/
```

Division between integers always truncates toward zero.

---

## Example

Input:

```txt
tokens = ["1","2","+","3","*","4","-"]
```

Output:

```txt
5
```

Explanation:

```txt
((1 + 2) * 3) - 4

= (3 * 3) - 4

= 9 - 4

= 5
```

---

## Constraints

```txt
1 <= tokens.length <= 1000

tokens[i] is "+", "-", "*", "/", or an integer in the range [-200, 200].
```

---

## Approach

1. Create an empty stack.
2. Traverse each token.
3. If the token is a number, push it onto the stack.
4. If the token is an operator:

   * Pop the required operands.
   * Perform the operation.
   * Push the result back onto the stack.
5. Continue until all tokens are processed.
6. The remaining element in the stack is the final answer.

---

## Core Idea

Reverse Polish Notation evaluates expressions from **left to right**.

* Numbers are pushed onto the stack.
* Whenever an operator is encountered:

  * Pop the top two numbers.
  * Apply the operation.
  * Push the result back.

The stack always stores intermediate results.

---

## Dry Run

Input:

```txt
tokens = ["1","2","+","3","*","4","-"]
```

Initial:

```txt
Stack = []
```

---

Token:

```txt
1
```

Push:

```txt
Stack = [1]
```

---

Token:

```txt
2
```

Push:

```txt
Stack = [1,2]
```

---

Token:

```txt
+
```

Pop:

```txt
2 and 1
```

Calculate:

```txt
1 + 2 = 3
```

Push:

```txt
Stack = [3]
```

---

Token:

```txt
3
```

Push:

```txt
Stack = [3,3]
```

---

Token:

```txt
*
```

Pop:

```txt
3 and 3
```

Calculate:

```txt
3 × 3 = 9
```

Push:

```txt
Stack = [9]
```

---

Token:

```txt
4
```

Push:

```txt
Stack = [9,4]
```

---

Token:

```txt
-
```

Pop:

```txt
4 and 9
```

Calculate:

```txt
9 - 4 = 5
```

Push:

```txt
Stack = [5]
```

---

Final Answer:

```txt
5
```

---

## Complexity Analysis

### Time Complexity

```txt
O(n)
```

Reason:

Each token is processed exactly once.

---

### Space Complexity

```txt
O(n)
```

Reason:

In the worst case, the stack stores all operands.

---

## Data Structure Used

* Stack

---

## Java Solution

Code available in submission file.

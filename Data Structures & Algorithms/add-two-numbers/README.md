# Add Two Numbers

## Problem Statement

Given two **non-empty** linked lists `l1` and `l2`, where each linked list represents a non-negative integer in **reverse order**, add the two numbers and return the sum as a linked list.

Each node contains a single digit.

---

## Example 1

Input:

```txt
l1 = [1,2,3]
l2 = [4,5,6]
```

Output:

```txt
[5,7,9]
```

Explanation:

```txt
321 + 654 = 975
```

Since the digits are stored in reverse order:

```txt
5 → 7 → 9
```

---

## Example 2

Input:

```txt
l1 = [9]
l2 = [9]
```

Output:

```txt
[8,1]
```

Explanation:

```txt
9 + 9 = 18
```

So:

```txt
8 → 1
```

---

## Constraints

```txt
1 <= l1.length, l2.length <= 100
0 <= Node.val <= 9
```

---

## Approach

1. Create a dummy node to simplify the result linked list construction.
2. Initialize a `carry` variable as `0`.
3. Traverse both linked lists while at least one list is not `null`.
4. Take the current digit from `l1` and `l2`. If a list is exhausted, consider its digit as `0`.
5. Add both digits along with the `carry`.
6. Store `sum % 10` as the current result digit.
7. Update `carry` using `sum / 10`.
8. Move the pointers of `l1` and `l2` forward.
9. After both lists are completely processed, if `carry` is greater than `0`, add it as the final node.
10. Return `dummy.next`.

---

## Core Idea

Use the **Linked List Traversal + Carry** technique.

For every pair of digits:

```txt
sum = digit1 + digit2 + carry
```

The current digit is:

```txt
sum % 10
```

The carry for the next position is:

```txt
sum / 10
```

Because the digits are already stored in reverse order, we can directly start addition from the heads of both lists.

---

## Dry Run

Input:

```txt
l1 = [2,4,3]
l2 = [5,6,4]
```

These represent:

```txt
342 + 465 = 807
```

### Step 1

```txt
2 + 5 + 0 = 7
```

Result:

```txt
[7]
```

Carry:

```txt
0
```

### Step 2

```txt
4 + 6 + 0 = 10
```

Result digit:

```txt
0
```

Carry:

```txt
1
```

Result:

```txt
[7,0]
```

### Step 3

```txt
3 + 4 + 1 = 8
```

Result:

```txt
[7,0,8]
```

Final answer:

```txt
[7,0,8]
```

Which represents:

```txt
807
```

---

## Complexity Analysis

### Time Complexity

```txt
O(m + n)
```

where `m` is the length of `l1` and `n` is the length of `l2`.

Each node is visited only once.

### Space Complexity

```txt
O(1)
```

Extra space is constant, excluding the space required for the output linked list.

---

## Data Structure Used

* Linked List

---

## Techniques Used

* Two Pointer Traversal
* Carry Handling
* Dummy Node
* Linked List Manipulation

---

## Java Solution

Code available in submission file.

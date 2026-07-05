# Daily Temperatures

## Problem Statement

You are given an integer array `temperatures` where `temperatures[i]` represents the temperature on the `iᵗʰ` day.

Return an array `result` where `result[i]` is the number of days you have to wait after the `iᵗʰ` day to get a warmer temperature.

If there is no future day with a warmer temperature, return `0` for that day.

---

## Example 1

Input:

```txt
temperatures = [30,38,30,36,35,40,28]
```

Output:

```txt
[1,4,1,2,1,0,0]
```

Explanation:

```txt
30 → wait 1 day to get 38
38 → wait 4 days to get 40
30 → wait 1 day to get 36
36 → wait 2 days to get 40
35 → wait 1 day to get 40
40 → no warmer day
28 → no warmer day
```

---

## Example 2

Input:

```txt
temperatures = [22,21,20]
```

Output:

```txt
[0,0,0]
```

Explanation:

```txt
No future day has a warmer temperature.
```

---

## Constraints

```txt
1 <= temperatures.length <= 1000

1 <= temperatures[i] <= 100
```

---

## Approach

1. Create an empty stack to store indices.
2. Traverse the temperature array from left to right.
3. While the stack is not empty and the current temperature is greater than the temperature at the top index of the stack:

   * Calculate the number of days waited.
   * Store it in the answer array.
   * Pop the index from the stack.
4. Push the current index into the stack.
5. Remaining indices in the stack have no warmer future day, so their values remain `0`.

---

## Core Idea

The stack stores the indices of days whose next warmer temperature has not yet been found.

Whenever a warmer temperature is found:

* Pop the previous index.
* Calculate the difference in indices.
* Store the result.

This is called a **Monotonic Decreasing Stack**, because the temperatures corresponding to the stored indices are maintained in decreasing order.

---

## Dry Run

Input:

```txt
temperatures = [30,38,30,36,35,40,28]
```

Initial:

```txt
Stack = []
Answer = [0,0,0,0,0,0,0]
```

---

Day 0:

```txt
30
```

Push index 0

```txt
Stack = [0]
```

---

Day 1:

```txt
38
```

38 > 30

Pop index 0

```txt
Answer[0] = 1
```

Push index 1

```txt
Stack = [1]
```

Answer:

```txt
[1,0,0,0,0,0,0]
```

---

Day 2:

```txt
30
```

Push index 2

```txt
Stack = [1,2]
```

---

Day 3:

```txt
36
```

36 > 30

Pop index 2

```txt
Answer[2] = 1
```

Push index 3

```txt
Stack = [1,3]
```

Answer:

```txt
[1,0,1,0,0,0,0]
```

---

Day 4:

```txt
35
```

Push index 4

```txt
Stack = [1,3,4]
```

---

Day 5:

```txt
40
```

40 > 35

```txt
Answer[4] = 1
```

40 > 36

```txt
Answer[3] = 2
```

40 > 38

```txt
Answer[1] = 4
```

Push index 5

```txt
Stack = [5]
```

Answer:

```txt
[1,4,1,2,1,0,0]
```

---

Day 6:

```txt
28
```

Push index 6

```txt
Stack = [5,6]
```

No warmer day exists for indices 5 and 6.

Final Answer:

```txt
[1,4,1,2,1,0,0]
```

---

## Complexity Analysis

### Time Complexity

```txt
O(n)
```

Reason:

Each index is pushed and popped from the stack at most once.

---

### Space Complexity

```txt
O(n)
```

Reason:

In the worst case, all indices are stored in the stack.

---

## Data Structure Used

* Stack
* Array

---

## Java Solution

Code available in submission file.

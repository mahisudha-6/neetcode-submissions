# Best Time to Buy and Sell Stock

## Problem Statement

You are given an integer array `prices` where `prices[i]` represents the price of a stock on the `i-th` day.

You may choose a single day to buy one stock and choose a different day in the future to sell it.

Return the maximum profit you can achieve.

If no profit can be made, return `0`.

---

## Example 1

Input:

```txt
prices = [10,1,5,6,7,1]
```

Output:

```txt
6
```

Explanation:

```txt
Buy at price 1 (day 1)
Sell at price 7 (day 4)

Profit = 7 - 1 = 6
```

---

## Example 2

Input:

```txt
prices = [10,8,7,5,2]
```

Output:

```txt
0
```

Explanation:

```txt
Stock price keeps decreasing.

No profitable transaction can be made.
```

---

## Constraints

```txt
1 <= prices.length <= 100
0 <= prices[i] <= 100
```

---

## Approach

1. Initialize:
   - `minPrice` with first day's price
   - `maxProfit` as 0

2. Traverse the array from index 1

3. Update minimum price seen so far

4. Calculate current profit:

```txt
prices[i] - minPrice
```

5. Update maximum profit if current profit is greater

6. Return maximum profit

---

## Core Idea

Keep track of:

- Lowest buying price seen so far
- Maximum profit possible at current day

For every day:

```txt
Profit = Current Price - Minimum Price Seen So Far
```

Update the maximum profit whenever a larger profit is found.

---

## Dry Run

Input:

```txt
prices = [10,1,5,6,7,1]
```

Initial:

```txt
minPrice = 10
maxProfit = 0
```

### Day 1

```txt
price = 1
```

```txt
minPrice = min(10,1) = 1
```

```txt
profit = 1 - 1 = 0
```

```txt
maxProfit = 0
```

---

### Day 2

```txt
price = 5
```

```txt
profit = 5 - 1 = 4
```

```txt
maxProfit = 4
```

---

### Day 3

```txt
price = 6
```

```txt
profit = 6 - 1 = 5
```

```txt
maxProfit = 5
```

---

### Day 4

```txt
price = 7
```

```txt
profit = 7 - 1 = 6
```

```txt
maxProfit = 6
```

---

### Day 5

```txt
price = 1
```

```txt
profit = 1 - 1 = 0
```

```txt
maxProfit = 6
```

---

Final Answer:

```txt
6
```

---

## Complexity Analysis

Time Complexity:

```txt
O(n)
```

Reason:

Traverse the array only once.

---

Space Complexity:

```txt
O(1)
```

Reason:

Only two variables are used.

---

## Data Structure Used

- Array

---

## Java Solution

Code available in submission file.

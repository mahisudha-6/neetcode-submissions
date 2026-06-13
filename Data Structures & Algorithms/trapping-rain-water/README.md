# Trapping Rain Water

## Problem Statement

You are given an array `height` where each element represents the height of a bar in an elevation map.

Each bar has a width of `1`.

Return the maximum amount of water that can be trapped between the bars after raining.

---

## Example 1

Input:

```txt
height = [0,2,0,3,1,0,1,3,2,1]
```

Output:

```txt
9
```

Explanation:

```txt
Water gets trapped between taller bars.

Total trapped water = 9 units.
```

---

## Constraints

```txt
1 <= height.length <= 1000
0 <= height[i] <= 1000
```

---

## Approach

1. Initialize two pointers:
   - `left = 0`
   - `right = height.length - 1`

2. Maintain:
   - `leftMax`
   - `rightMax`

3. Compare `leftMax` and `rightMax`

4. If `leftMax < rightMax`
   - Move left pointer
   - Update leftMax
   - Add trapped water

5. Otherwise
   - Move right pointer
   - Update rightMax
   - Add trapped water

6. Continue until both pointers meet

7. Return total trapped water

---

## Core Idea

The water trapped at a position depends on:

```txt
min(leftMax, rightMax) - currentHeight
```

Instead of calculating left and right maximums for every index, use two pointers and keep track of:

```txt
leftMax
rightMax
```

The smaller side determines the amount of water that can be trapped.

---

## Dry Run

Input:

```txt
height = [0,2,0,3,1,0,1,3,2,1]
```

Initial:

```txt
left = 0
right = 9

leftMax = 0
rightMax = 1

water = 0
```

---

### Step 1

```txt
leftMax < rightMax
```

Move left:

```txt
left = 1
leftMax = 2
water += 2 - 2 = 0
```

```txt
water = 0
```

---

### Step 2

```txt
leftMax > rightMax
```

Move right:

```txt
right = 8
rightMax = 2
water += 2 - 2 = 0
```

```txt
water = 0
```

---

### Step 3

Move right:

```txt
right = 7
rightMax = 3
water += 3 - 3 = 0
```

```txt
water = 0
```

---

### Step 4

```txt
leftMax < rightMax
```

Move left:

```txt
left = 2
leftMax = 2
water += 2 - 0 = 2
```

```txt
water = 2
```

---

### Step 5

Move left:

```txt
left = 3
leftMax = 3
water += 3 - 3 = 0
```

```txt
water = 2
```

---

### Step 6

Move right:

```txt
right = 6
rightMax = 3
water += 3 - 1 = 2
```

```txt
water = 4
```

---

### Step 7

Move right:

```txt
right = 5
rightMax = 3
water += 3 - 0 = 3
```

```txt
water = 7
```

---

### Step 8

Move right:

```txt
right = 4
rightMax = 3
water += 3 - 1 = 2
```

```txt
water = 9
```

Pointers meet.

Final Answer:

```txt
9
```

---

## Complexity Analysis

Time Complexity:

```txt
O(n)
```

Reason:

Each pointer traverses the array at most once.

---

Space Complexity:

```txt
O(1)
```

Reason:

Only a few variables are used.

---

## Data Structure Used

- Array
- Two Pointers

---

## Java Solution

Code available in submission file.

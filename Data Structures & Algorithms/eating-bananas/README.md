# Koko Eating Bananas

## Problem Statement

You are given an integer array `piles` where `piles[i]` represents the number of bananas in the `iᵗʰ` pile. You are also given an integer `h`, which represents the total number of hours available.

Koko chooses an eating speed `k` (bananas per hour). In one hour, she can eat at most `k` bananas from a single pile. If a pile has fewer than `k` bananas, she finishes that pile and cannot start another pile in the same hour.

Return the minimum integer `k` such that Koko can eat all the bananas within `h` hours.

---

## Example 1

Input:

```txt
piles = [1,4,3,2]
h = 9
```

Output:

```txt
2
```

Explanation:

At speed `2`, Koko finishes all bananas within `6` hours.

---

## Example 2

Input:

```txt
piles = [25,10,23,4]
h = 4
```

Output:

```txt
25
```

Explanation:

Koko must eat at a speed of at least `25` bananas per hour to finish within `4` hours.

---

## Constraints

```txt
1 <= piles.length <= 1000

piles.length <= h <= 1000000

1 <= piles[i] <= 1000000000
```

---

## Approach

1. Set the minimum possible eating speed as `1`.
2. Set the maximum possible eating speed as the largest pile.
3. Apply Binary Search on the eating speed.
4. For every middle speed:
   - Calculate the total hours required to finish all piles.
5. If the required hours are less than or equal to `h`:
   - Store the current speed as the answer.
   - Try a smaller speed.
6. Otherwise:
   - Increase the eating speed.
7. Return the minimum valid speed.

---

## Core Idea

The answer lies between `1` and the maximum pile size.

- Smaller eating speed → More hours required.
- Larger eating speed → Fewer hours required.

Since the required hours change monotonically with the eating speed, Binary Search efficiently finds the minimum valid speed.

---

## Dry Run

Input:

```txt
piles = [1,4,3,2]
h = 9
```

Initial:

```txt
low = 1
high = 4
ans = 4
```

---

Iteration 1

```txt
mid = (1 + 4) / 2 = 2
```

Hours required:

```txt
1 -> 1 hour
4 -> 2 hours
3 -> 2 hours
2 -> 1 hour

Total = 6 hours
```

Since

```txt
6 <= 9
```

Update:

```txt
ans = 2
high = 1
```

---

Iteration 2

```txt
mid = (1 + 1) / 2 = 1
```

Hours required:

```txt
1 -> 1 hour
4 -> 4 hours
3 -> 3 hours
2 -> 2 hours

Total = 10 hours
```

Since

```txt
10 > 9
```

Update:

```txt
low = 2
```

Now

```txt
low > high
```

Final Answer:

```txt
2
```

---

## Complexity Analysis

### Time Complexity

```txt
O(n log m)
```

Where:

- `n` = Number of piles
- `m` = Maximum number of bananas in a pile

---

### Space Complexity

```txt
O(1)
```

Reason:

Only a few variables are used regardless of the input size.

---

## Data Structure Used

- Array

---

## Java Solution

Code available in submission file.

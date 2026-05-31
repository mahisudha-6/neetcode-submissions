# Top K Frequent Elements

## Problem Statement

Given an integer array `nums` and an integer `k`, return the `k` most frequent elements in the array.

The answer is guaranteed to be unique.

You may return the result in any order.

---

## Example 1

Input:

```txt
nums = [1,2,2,3,3,3]
k = 2
```

Output:

```txt
[2,3]
```

Explanation:

Frequencies:

```txt
1 → 1 time
2 → 2 times
3 → 3 times
```

The 2 most frequent elements are:

```txt
[2,3]
```

---

## Example 2

Input:

```txt
nums = [7,7]
k = 1
```

Output:

```txt
[7]
```

---

## Constraints

```txt
1 <= nums.length <= 10^4
-1000 <= nums[i] <= 1000
1 <= k <= number of distinct elements in nums
```

---

## Approach

1. Create a HashMap to store frequencies of elements.
2. Traverse the array and count occurrences.
3. Create a Max Heap (Priority Queue).
4. Insert all unique elements into the heap.
5. Heap is ordered based on frequency.
6. Remove the top `k` elements from the heap.
7. Store them in the result array.

---

## Core Idea

Use:

- HashMap → to count frequencies
- Max Heap → to retrieve highest frequency elements efficiently

The element with the highest frequency always remains at the top of the heap.

---

## Dry Run

Input:

```txt
nums = [1,2,2,3,3,3]
k = 2
```

### Step 1: Build Frequency Map

```txt
1 → 1
2 → 2
3 → 3
```

HashMap:

```txt
{1=1, 2=2, 3=3}
```

---

### Step 2: Insert Keys into Max Heap

Heap order by frequency:

```txt
3 (freq = 3)
2 (freq = 2)
1 (freq = 1)
```

---

### Step 3: Remove Top K Elements

First poll:

```txt
3
```

Result:

```txt
[3]
```

Second poll:

```txt
2
```

Result:

```txt
[3,2]
```

---

Final Answer:

```txt
[3,2]
```

or

```txt
[2,3]
```

Both are valid.

---

## Complexity Analysis

Time Complexity:

```txt
O(n log n)
```

Reason:

- Building HashMap → O(n)
- Inserting elements into Priority Queue → O(n log n)
- Removing k elements → O(k log n)

Overall:

```txt
O(n log n)
```

---

Space Complexity:

```txt
O(n)
```

Reason:

- HashMap stores frequencies
- Priority Queue stores unique elements

---

## Data Structure Used

- HashMap
- Priority Queue (Max Heap)

---

## Java Solution

Code available in submission file.

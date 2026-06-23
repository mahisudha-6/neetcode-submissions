# Sliding Window Maximum

## Problem Statement

You are given an integer array `nums` and an integer `k`.

There is a sliding window of size `k` that moves from the left side of the array to the right side one position at a time.

For each window, return the maximum element.

---

## Example 1

Input:

```txt
nums = [1,2,1,0,4,2,6]
k = 3
```

Output:

```txt
[2,2,4,4,6]
```

Explanation:

```txt
Window           Maximum

[1,2,1]          2
[2,1,0]          2
[1,0,4]          4
[0,4,2]          4
[4,2,6]          6
```

---

## Constraints

```txt
1 <= nums.length <= 100000

-10000 <= nums[i] <= 10000

1 <= k <= nums.length
```

---

## Approach (Max Heap / Priority Queue)

1. Create a Max Heap using PriorityQueue.
2. Insert the first `k` elements into the heap.
3. The heap's top element is the maximum of the first window.
4. Slide the window one step at a time.
5. Add the new element entering the window.
6. Remove the element leaving the window.
7. Store the maximum element using `peek()`.
8. Continue until all windows are processed.

---

## Core Idea

At every window:

* Add the new incoming element.
* Remove the outgoing element.
* The largest element is always at the top of the Max Heap.

Therefore:

```txt
pq.peek()
```

gives the maximum element of the current window.

---

## Dry Run

Input:

```txt
nums = [1,2,1,0,4,2,6]
k = 3
```

### First Window

```txt
[1,2,1]
```

Heap:

```txt
[2,1,1]
```

Maximum:

```txt
2
```

Answer:

```txt
[2]
```

---

### Second Window

Remove:

```txt
1
```

Add:

```txt
0
```

Window:

```txt
[2,1,0]
```

Heap Top:

```txt
2
```

Answer:

```txt
[2,2]
```

---

### Third Window

Remove:

```txt
2
```

Add:

```txt
4
```

Window:

```txt
[1,0,4]
```

Heap Top:

```txt
4
```

Answer:

```txt
[2,2,4]
```

---

### Fourth Window

Remove:

```txt
1
```

Add:

```txt
2
```

Window:

```txt
[0,4,2]
```

Heap Top:

```txt
4
```

Answer:

```txt
[2,2,4,4]
```

---

### Fifth Window

Remove:

```txt
0
```

Add:

```txt
6
```

Window:

```txt
[4,2,6]
```

Heap Top:

```txt
6
```

Answer:

```txt
[2,2,4,4,6]
```

---

## Complexity Analysis

### Time Complexity

```txt
O(n × k)
```

Reason:

* Insertion into Priority Queue takes `O(log k)`.
* Removing an arbitrary element using:

```txt
pq.remove(value)
```

takes `O(k)` time.

Since this happens for every window:

```txt
O(n × k)
```

---

### Space Complexity

```txt
O(k)
```

Reason:

The Priority Queue stores at most `k` elements.

---

## Data Structures Used

* Sliding Window
* Priority Queue (Max Heap)
* Array

---

## Important Note

This Priority Queue solution works correctly but is **not optimal**.

For large constraints:

```txt
nums.length <= 100000
```

the preferred solution uses a **Monotonic Deque**.

Deque Solution:

```txt
Time Complexity : O(n)

Space Complexity : O(k)
```

Priority Queue Solution:

```txt
Time Complexity : O(n × k)

Space Complexity : O(k)
```

---

## Java Solution

Code available in submission file.

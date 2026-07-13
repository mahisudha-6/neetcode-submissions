# Time Based Key-Value Store

## Problem Statement

Design a time-based key-value data structure that stores multiple values for the same key at different timestamps.

Implement the following operations:

- `set(key, value, timestamp)` → Stores the key with its value at the given timestamp.
- `get(key, timestamp)` → Returns the value associated with the largest timestamp less than or equal to the given timestamp. If no such timestamp exists, return an empty string `""`.

---

## Example 1

Input:

```txt
TimeMap()

set("alice", "happy", 1)

get("alice", 1)

get("alice", 2)

set("alice", "sad", 3)

get("alice", 3)
```

Output:

```txt
null

null

"happy"

"happy"

null

"sad"
```

Explanation:

```txt
set("alice","happy",1)

Store ("happy",1)

get("alice",1)

Return "happy"

get("alice",2)

No value at timestamp 2.
Return value at timestamp 1.

set("alice","sad",3)

Store ("sad",3)

get("alice",3)

Return "sad"
```

---

## Constraints

```txt
1 <= key.length, value.length <= 100

0 <= timestamp <= 10^7

All timestamps are strictly increasing.
```

---

## Approach

1. Use a HashMap where:
   - Key → String
   - Value → List of (timestamp, value) pairs.
2. For the `set()` operation:
   - If the key does not exist, create a new list.
   - Add the `(timestamp, value)` pair to the list.
3. For the `get()` operation:
   - If the key is not present, return `""`.
   - Perform Binary Search on the timestamp list.
   - Find the largest timestamp less than or equal to the given timestamp.
   - Return the corresponding value.

---

## Core Idea

Each key stores values in increasing timestamp order.

Since timestamps are already sorted, Binary Search can quickly find the latest valid timestamp.

This makes retrieval much faster than checking every timestamp.

---

## Dry Run

Input:

```txt
set("alice","happy",1)

set("alice","sad",3)

get("alice",2)
```

After set operations:

```txt
HashMap

alice →

[(1,"happy"), (3,"sad")]
```

Binary Search:

```txt
timestamp = 2

low = 0
high = 1
ans = ""
```

Iteration 1

```txt
mid = 0

timestamp = 1
```

Since

```txt
1 <= 2
```

Store answer.

```txt
ans = "happy"

low = 1
```

Iteration 2

```txt
mid = 1

timestamp = 3
```

Since

```txt
3 > 2
```

Move left.

```txt
high = 0
```

Loop ends.

Return:

```txt
"happy"
```

---

## Complexity Analysis

### Time Complexity

```txt
set() : O(1)

get() : O(log n)
```

Where `n` is the number of timestamps stored for a key.

---

### Space Complexity

```txt
O(n)
```

Reason:

All key-value pairs are stored in the HashMap.

---

## Data Structure Used

- HashMap
- ArrayList
- Binary Search
- Custom Pair Class

---

## Java Solution

Code available in submission file.

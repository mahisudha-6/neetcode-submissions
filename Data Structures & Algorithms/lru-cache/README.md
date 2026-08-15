### Problem Statement

Implement an LRU (Least Recently Used) Cache that supports the following operations:

* `get(key)` — Return the value associated with the key if it exists, otherwise return `-1`.
* `put(key, value)` — Add or update a key-value pair.
* If the cache exceeds its capacity, remove the least recently used key.

A key is considered recently used when `get()` or `put()` is called on it.

### Example 1

Input:

```text
capacity = 2

put(1, 10)
get(1)
put(2, 20)
put(3, 30)
get(2)
get(1)
```

Output:

```text
10
20
-1
```

Explanation:

```text
put(1,10) → [1=10]

get(1) → 10

put(2,20) → [1=10, 2=20]

put(3,30)

The cache is full, so the least recently used key 1 is removed.

[2=20, 3=30]

get(2) → 20
get(1) → -1
```

### Example 2

Input:

```text
capacity = 2

put(1, 10)
put(2, 20)
get(1)
put(3, 30)
```

Output:

```text
10
```

Explanation:

After `get(1)`, key `1` becomes the most recently used key.

Therefore, when `3` is inserted, key `2` is removed.

Final cache:

```text
[1=10, 3=30]
```

### Constraints

```text
1 <= capacity <= 3000
0 <= key <= 10^4
0 <= value <= 10^5
At most 2 * 10^5 calls will be made to get() and put()
```

### Approach

Use an `ArrayList` to store the key-value pairs.

Each entry is stored as an integer array:

```java
{key, value}
```

Maintain the cache in usage order:

```text
Least Recently Used → Most Recently Used
```

For `get(key)`:

1. Search for the key in the list.
2. If the key is not found, return `-1`.
3. If the key is found, save its value.
4. Remove the key-value pair from its current position.
5. Add it to the end of the list because it is now the most recently used key.
6. Return the value.

For `put(key, value)`:

1. Check whether the key already exists.
2. If it exists:

   * Update its value.
   * Remove it from its current position.
   * Add it to the end of the list.
3. If it does not exist:

   * If the cache is full, remove the first element.
   * Add the new key-value pair to the end.

### Core Idea

Maintain the cache in this order:

```text
Least Recently Used → → → Most Recently Used
```

For example:

```text
[1=10, 2=20, 3=30]
```

Here:

```text
1=10 → Least Recently Used
3=30 → Most Recently Used
```

If `get(1)` is called:

```text
Before:
[1=10, 2=20, 3=30]

After:
[2=20, 3=30, 1=10]
```

Key `1` becomes the most recently used key.

If the cache is full and a new key is inserted, remove the first element.

### Dry Run

Use the following dry run:

```text
capacity = 2
```

#### Step 1: `put(1, 10)`

```text
Cache:
[1=10]
```

Key `1` is the most recently used.

#### Step 2: `put(2, 20)`

```text
Cache:
[1=10, 2=20]
```

```text
LRU                 MRU
 ↓                   ↓
1=10               2=20
```

#### Step 3: `get(1)`

Key `1` is found.

Remove it from its current position and add it to the end.

```text
Before:
[1=10, 2=20]

After:
[2=20, 1=10]
```

Output:

```text
10
```

Now:

```text
LRU                 MRU
 ↓                   ↓
2=20               1=10
```

#### Step 4: `put(3, 30)`

The cache is full.

Current cache:

```text
[2=20, 1=10]
```

The least recently used key is `2`.

Remove `2`:

```text
[1=10]
```

Add `3`:

```text
[1=10, 3=30]
```

Final order:

```text
LRU                 MRU
 ↓                   ↓
1=10               3=30
```

#### Step 5: `get(2)`

Key `2` was removed from the cache.

Output:

```text
-1
```

### Complexity Analysis

For `get()`:

```text
O(n)
```

Because the `ArrayList` may need to be searched from beginning to end.

Removing an element from the middle of an `ArrayList` can also take `O(n)` because remaining elements may need to be shifted.

For `put()`:

```text
O(n)
```

Because finding an existing key requires a linear search, and removing an existing element can also require shifting elements.

Space complexity:

```text
O(n)
```

where `n` is the cache capacity.

### Data Structure Used

Use:

```text
ArrayList
Integer array {key, value}
```

The `ArrayList` maintains the order:

```text
Least Recently Used → Most Recently Used
```

### Java Solution
Code is available in submission file


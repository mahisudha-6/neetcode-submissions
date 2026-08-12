# Copy Linked List with Random Pointer

##  Problem Statement
Given the head of a linked list where each node contains:
- `next` pointer
- `random` pointer (can point to any node or `null`)

Create a **deep copy** of the entire linked list and return the head of the copied list.

A deep copy means:
- Every node is newly created.
- `next` and `random` pointers in the copied list should point only to copied nodes.
- No pointer in the copied list should reference an original node.

---

##  Approach (HashMap)

This solution uses a **HashMap** to store the mapping between original nodes and copied nodes.

### Step 1
Traverse the original linked list.

- Create a new node for every original node.
- Store the mapping:

```
Original Node  →  Copied Node
```

### Step 2
Traverse the list again.

Using the HashMap:

- Connect the copied node's `next` pointer.
- Connect the copied node's `random` pointer.

Since every original node already has its copy stored in the HashMap, both pointers can be assigned easily.

Finally, return the copied head.

---

## Algorithm

1. Create a `HashMap<OriginalNode, CopyNode>`.
2. Traverse the original list.
3. Create a copy of every node.
4. Store original → copy mapping.
5. Traverse again.
6. Set:
   - `copy.next`
   - `copy.random`
7. Return copied head.

---

##  Key Idea

The HashMap acts as a lookup table.

Instead of searching for copied nodes repeatedly, we directly obtain them in **O(1)** time.

---

##  Time Complexity

| Operation | Complexity |
|-----------|------------|
| Creating copied nodes | O(n) |
| Connecting pointers | O(n) |
| **Overall** | **O(n)** |

---

##  Space Complexity

| Extra Space | Complexity |
|-------------|------------|
| HashMap | O(n) |

---

##  Concepts Used

- Linked List
- HashMap
- Deep Copy
- Pointer Manipulation

---

##  Key Takeaways

- HashMap stores the relationship between original and copied nodes.
- First pass creates all copied nodes.
- Second pass connects `next` and `random` pointers.
- Efficient solution with **O(n)** time complexity.
- One of the most common Linked List interview problems.

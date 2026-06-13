# Product of Array Except Self

## Problem Statement
Given an integer array `nums`, return an array `answer` such that `answer[i]` is equal to the product of all the elements of `nums` except `nums[i]`. Solve this without using division and in O(n) time.

## Approach
Use prefix products and a running suffix product. First compute prefix product for each index, then multiply by the suffix product computed in reverse.

## Algorithm
1. Create an output array `prefix` of length `n`.
2. Set `prefix[0] = 1`.
3. For `i` from `1` to `n-1`, set `prefix[i] = prefix[i-1] * nums[i-1]`.
4. Initialize `suffixMult = 1`.
5. Iterate `i` from `n-1` down to `0`:
   - Multiply `prefix[i]` by `suffixMult`.
   - Update `suffixMult *= nums[i]`.
6. Return `prefix`.

## Time Complexity
- Time: O(n), where `n` is the number of elements in `nums`.
- Space: O(1) extra space beyond the output array.


## Key Concepts
- Arrays
- Prefix/Suffix products
- Dynamic Programming (space optimization)

## Learning Notes
- Build the result in two passes to avoid division.
- Use the output array to store prefix products, then incorporate suffix products inline.
- This is a useful technique when each output element depends on all other elements in the array.

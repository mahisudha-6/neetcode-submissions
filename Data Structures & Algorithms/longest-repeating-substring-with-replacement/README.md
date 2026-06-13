# Longest Repeating Character Replacement

## Problem Statement
Given a string `s` and an integer `k`, find the length of the longest substring that can be obtained by replacing at most `k` characters so that all characters in the substring are the same.

## Approach
Use a sliding window and maintain the count of each character in the window. Track the highest frequency character count seen so far. If the window size minus the max frequency exceeds `k`, shrink the window from the left.

## Algorithm
1. Initialize an array `count[26]` for letter frequencies, `left = 0`, `maxFreq = 0`, and `res = 0`.
2. Expand the window with `right` from `0` to `s.length()-1`.
3. Update the count for `s[right]` and update `maxFreq`.
4. If the window length minus `maxFreq` is greater than `k`, decrement the count of `s[left]` and increment `left`.
5. Update `res` as the maximum window length.
6. Return `res`.

## Time Complexity
- Time: O(n), where `n` is the length of `s`.
- Space: O(1), because the count array size is fixed at 26.

## Key Concepts
- Sliding Window
- Arrays
- Frequency Counting
- Two Pointers

## Learning Notes
- Keep the largest frequency in the current window; it determines how many replacements are needed.
- The window may remain valid even if the exact `maxFreq` changes due to lazy updating.
- This is a common technique for substring problems with allowed modifications.

# Longest Substring Without Repeating Characters

## Problem Statement
Given a string `s`, find the length of the longest substring without repeating characters.

## Approach
Use a sliding window with a hash set to maintain unique characters. Expand the window until a duplicate is found, then shrink it from the left until the duplicate is removed.

## Algorithm
1. Initialize `left = 0`, `max = 0`, and an empty `HashSet<Character>`.
2. For each `right` index from `0` to `s.length()-1`:
   - While the character at `right` is already in the set, remove `s.charAt(left)` and increment `left`.
   - Add `s.charAt(right)` to the set.
   - Update `max` to the size of the current window.
3. Return `max`.

## Time Complexity
- Time: O(n), where `n` is the length of `s`.
- Space: O(min(n, m)), where `m` is the character set size.

## Key Concepts
- Sliding Window
- HashSet
- Two Pointers
- Strings

## Learning Notes
- Shrink the window only when duplicates appear.
- Use the set to maintain the current window's uniqueness.
- This problem is a classic sliding-window pattern for substring constraints.

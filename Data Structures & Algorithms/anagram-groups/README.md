# Group Anagrams

## Problem Statement
Given an array of strings, group the strings that are anagrams of each other. Return the grouped anagrams in any order.

## Approach
Use a hash map to collect strings by their sorted character signature. For each string, sort its characters to create a canonical key, then add the original string to the list for that key.

## Algorithm
1. Initialize a `HashMap<String, List<String>>`.
2. For each string in `strs`:
   - Convert the string to a char array.
   - Sort the char array.
   - Convert the sorted array back to a string key.
   - If the key is not present, add a new list.
   - Append the original string to the list for the key.
3. Return the values of the hash map as a list of lists.

## Time Complexity
- Time: O(n * k log k),
- where `n` is the number of strings and `k` is the maximum string length.
- Space: O(n * k),
- used by the hash map and the grouped output.


## Key Concepts
- HashMap
- Sorting
- Strings
- Arrays

## Learning Notes
- Use a stable canonical key for each anagram group.
- Sorting each word converts anagrams into equal keys.
- Be mindful of time complexity when string lengths are large.

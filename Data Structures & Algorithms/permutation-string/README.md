# Permutation in String

## Problem Statement
Given two strings `s1` and `s2`, determine if `s2` contains a permutation of `s1`. Return `true` if any substring of `s2` is an anagram of `s1`.

## Approach
Use a sliding window over `s2` and maintain character frequency arrays for `s1` and the current window. Compare the counts to determine whether the window is a permutation.

## Algorithm
1. If `s2` is shorter than `s1`, return `false`.
2. Build a frequency array `freq` for `s1`.
3. Build an initial frequency array `freq1` for the first `s1.length()` characters of `s2`.
4. Count how many character frequencies match between `freq` and `freq1`.
5. If all 26 frequencies match, return `true`.
6. Slide the window through `s2`:
   - Decrement the frequency for the leftmost character leaving the window.
   - Increment the frequency for the new rightmost character.
   - Recompute matching frequency count.
   - If all frequencies match, return `true`.
7. Return `false` if no window matches.

## Time Complexity
- Time: O(n * 26) = O(n), where `n` is the length of `s2`.
- Space: O(1), using fixed-size arrays of length 26.

## Java Solution
```java
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()) return false;
        int[] freq = new int[26];
        for(int i=0; i<s1.length(); i++){
            freq[s1.charAt(i) - 'a']++;
        }
        int freq1[] = new int[26];
        int l=0, count = 0;
        for(int r = 0; r < s1.length(); r++){
            freq1[s2.charAt(r) - 'a'] ++;
        }
        for(int i=0; i<26; i++){
            if(freq[i] == freq1[i]){
                count++;
            }
        }
        if(count == 26){
            return true;
        }
        for(int r=s1.length(); r < s2.length(); r++){
            count = 0;
            freq1[s2.charAt(l) - 'a'] --;
            l++;
            freq1[s2.charAt(r) - 'a'] ++;
            for(int i=0; i<26; i++){
                if(freq[i] == freq1[i]){
                    count++;
                }
            }
            if(count == 26){
                return true;
            }
        }
        return false;
    }
}
```

## Key Concepts
- Sliding Window
- Arrays
- HashMap (frequency arrays)
- Strings

## Learning Notes
- Fixed-size frequency arrays are faster than hash maps for lowercase letters.
- Comparing entire alphabet counts per window is straightforward when alphabet size is constant.
- This algorithm is a classic "permutation in substring" pattern.

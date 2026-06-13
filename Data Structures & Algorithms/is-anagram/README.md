# Valid Anagram

## Problem Statement
Given two strings `s` and `t`, determine if `t` is an anagram of `s`. Return `true` if both strings contain the same characters with the same frequencies.

## Approach
Count character frequencies in `s` and decrement them while scanning `t`. If all counts return to zero and the lengths match, the strings are anagrams.

## Algorithm
1. Convert both strings to lowercase.
2. If lengths differ, return `false`.
3. Use a `HashMap<Character, Integer>` to count characters in `s`.
4. Iterate through characters in `t` and decrement the corresponding counts.
5. Check the map values. If any value is not zero, return `false`.
6. Otherwise, return `true`.

## Time Complexity
- Time: O(n), where `n` is the length of the strings.
- Space: O(1) if the alphabet is fixed, otherwise O(k) for character counts.

## Java Solution
```java
class Solution {
    public boolean isAnagram(String s, String t) {
        s=s.toLowerCase();
        t=t.toLowerCase();
        if(s.length()!=t.length())
        return false;
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char ch:s.toCharArray()){
          hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
          hm.put(ch,hm.getOrDefault(ch,0)-1);
        }
        for(int value:hm.values()){
            if(value!=0)
            return false;
        }
        return true;
    }
}
```

## Key Concepts
- HashMap
- Strings
- Frequency counting

## Learning Notes
- Normalizing casing avoids false negatives when letter case differs.
- Early length check is a useful optimization.
- Use counts instead of sorting to achieve linear time.

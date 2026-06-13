# Encode and Decode Strings

## Problem Statement
Design an algorithm to encode a list of strings to a single string and decode the single string back into the original list of strings.

## Approach
Encode each string with its length followed by a separator character, then append the string content. Decode by reading the length, locating the separator, and extracting the exact substring.

## Algorithm
1. For encoding:
   - For each string, append its length, a `#` delimiter, then the string itself.
   - Return the built string.
2. For decoding:
   - Initialize an empty result list.
   - While there is remaining data, read digits until `#` to parse the length.
   - Extract the substring of that length after `#`.
   - Add the substring to the result list.
   - Continue from the next unread position.
3. Return the result list.

## Time Complexity
- Time: O(n), where `n` is the total length of all strings.
- Space: O(n), for the encoded string and decoded list.

```

## Key Concepts
- Strings
- Encoding/Decoding
- Data serialization

## Learning Notes
- Use a delimiter and explicit length to handle strings containing arbitrary characters.
- Avoid ambiguous separators by parsing the length first.
- This pattern is useful for encoding sequences for transmission or storage.

## Input & Output
Input: s1 = "ABABAB"; s2="AB";
Output: "AB"

## Algorithm

1. Start with two input strings, s1 and s2.
2. If the length of s2 is greater than the length of s1, swap s1 and s2.
3. Check if s1 is equal to s2. If it is, return s1.
4. If s2 is a prefix of s1, recursively call the function gcdOfString with the remaining part of s1 after removing s2 and s2.
5. If none of the above conditions match, return an empty string.

## Time Complexity - O(n)

- The time complexity of this algorithm depends on the length of the strings s1 and s2.
- In the worst case, if s2 is a substring of s1, the algorithm will recursively call gcdOfString until s1 becomes equal to s2, or until s2 becomes empty.
- Each recursive call reduces the length of s1 or s2 by at least one character.
- Therefore, the time complexity can be expressed as O(n), where n is the length of the longest string among s1 and s2

## Space Complexity - O(min(m,n))

- The space complexity is determined by the space used on the call stack due to recursive calls.
- In the worst case, the depth of the recursive calls will be equal to the length of the shorter string between s1 and s2.
- Therefore, the space complexity can be expressed as O(min(m, n)), where m and n are the lengths of s1 and s2, respectively.

## Take Away From the Problem:

### String Manipulation

| Function  | Usage | 
| -------- | -------- |
| length()   | Used to get the length of the String   |
| equals()   | Used to check if two Strings are equal   |
| startsWith()   | Used to check if one String starts with another   |
| substring()   | Used to extract a substring from a String   |

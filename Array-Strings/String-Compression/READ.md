## Input & Output
Input: chars = \["a","a","b","b","c","c","c"\]
Output: 6

## Algorithm

1. Initialize a StringBuilder sb to store the compressed characters.
2. Initialize variables i and count to 1.
3. Append the first character of the input array chars to sb.
4. Iterate over the characters of chars starting from the second character.
    - If the current character is equal to the previous character, increment the count.
    - If the current character is not equal to the previous character:
        - If count is greater than 1 
            - append count to sb.
    - Append the current character to sb.
    - Reset count to 1.
    - Increment i.
5. After the loop, if count is greater than 1, append count to sb.
6. Copy the characters from sb back to the input array chars.
7. Return the length of the compressed string represented by sb.

## Time Complexity - O(n)

- The while loop iterates through each character of the input array chars, so its time complexity is O(n).

## Space Complexity - O(n)

- The space complexity is dominated by the space used by the StringBuilder sb, which grows as characters are appended to it.
- In the worst case scenario, where there are no consecutive repeated characters (e.g., "abcdef"), the length of the compressed string sb would be equal to the length of the input array chars.
- So, the space complexity is O(n)
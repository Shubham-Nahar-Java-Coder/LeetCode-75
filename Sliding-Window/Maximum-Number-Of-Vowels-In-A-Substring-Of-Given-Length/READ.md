## Input & Output
Input: s = "abciiidef", k = 3
Output: 3

## Algorithm

1. Initialize variables count and ans to 0.
2. Iterate through the first k characters of the string s.
    -For each character:
        - Check if it's a vowel using the isVowel function.
        - If it's a vowel, increment count.
3. Set ans equal to count.
4. Iterate through the remaining characters of the string s.
    - For each character starting from index k:
        - Retrieve the character that enters the window (enteredElement) and the character that exits the window (exitElement).
        - Check if enteredElement is a vowel, if yes, increment count.
        - Check if exitElement is a vowel, if yes, decrement count.
    - Update ans to the maximum of count and the current value of ans.
5. Return the final value of ans.

## Time Complexity - O(n)

- The first loop iterates over the first k characters of the input string s. This loop has a time complexity of O(k).
- The second loop iterates over the remaining characters of the string s, from index k to the end. This loop has a time complexity of O(n-k).
- So, the time complexity of the algorithm is O(k + (n-k)) = O(n)

## Space Complexity - O(1)

- The space complexity does not depend on the length of the input string s, making it constant space complexity.
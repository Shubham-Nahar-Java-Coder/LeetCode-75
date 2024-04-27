## Input & Output
Input: s1 = "leetcode";
Output: "leotcede"

## Algorithm

1. Convert the input string s into a character array sArr.
2. Initialize two pointers, start pointing to the beginning of the array (0), and end pointing to the end of the array (s.length() - 1).
3. Create a string vowels containing all lowercase and uppercase vowels ("aeiouAEIOU").
4. While start is less than end:
    - Within the loop, advance start until it points to a vowel character in the array sArr.(while loop start > end)
    - Within the loop, decrement end until it points to a vowel character in the array sArr.(while loop start > end)
    - If start is still less than end, swap the characters at positions start and end in the array sArr, then move start forward by one position and move end backward by one position.
4. Return the string representation of the modified character array sArr.

## Time Complexity - O(n)

- Converting the input string s into a character array sArr takes O(n) time.
- The while loop iterates until the start pointer crosses the end pointer. So, the while loop has a time complexity of O(n).
- Overall, the time complexity of the algorithm is O(n)

## Space Complexity - O(n)

-The space complexity primarily depends on the space used by the character array sArr, which requires O(n) space to store the characters of the input string.
- Also, a constant amount of extra space is used for variables like start, end, and vowels.
- So, the space complexity of the algorithm is O(n).

## Take Away From the Problem:

### Two Pointer Technique:
The program utilizes two pointers (start and end) that move towards each other to identify and swap vowel characters. The two pointer technique is commonly used in programs that involve **searching** or **manipulating** elements in an array or a string.

### String Manipulation

| Function  | Usage | 
| -------- | -------- |
| toCharArray()   | Used for converting String to Character Array  |
| indexOf()  | Used for searching a specific character or Substring within a String    |

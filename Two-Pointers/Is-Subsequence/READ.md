## Input & Output
Input: s1= "ahbgdc" s2 = "abc"
Output: True

## Algorithm

1.Define a function isSubsequence that takes two strings s1 and s2 as input and returns a boolean value.
2. Check if the length of s2 is greater than the length of s1. If it is, swap s1 and s2 and call isSubsequence again.
3. Initialize two pointers, i and j, to 0.
4. Iterate through s1 and s2 simultaneously using the pointers i and j until either pointer reaches the end of its respective string.
    - Compare the characters at the current positions i and j. If they are equal, increment both i and j.
    - If the characters are not equal, increment only i.
5. After the iteration, check if j has reached the end of s2. If it has, return true, indicating that s2 is a subsequence of s1. Else, return false

## Time Complexity - O(n)

- The algorithm iterates through both strings s1 and s2 once, each time advancing one character at a time until either the end of s1 or s2 is reached.
- So, the time complexity is O(n).

## Space Complexity - O(1)

- The algorithm uses only a constant amount of extra space, regardless of the input size.
- It doesn't utilize any data structures that grow with the size of the input strings.
- So, the space complexity is O(1).
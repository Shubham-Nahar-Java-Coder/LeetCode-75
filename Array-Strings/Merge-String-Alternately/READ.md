## Algorithm

mergeAlternately(String word1, String word2):
   Input: Two strings, word1 and word2
   Output: A string merged alternately from word1 and word2

   1. Initialize an empty character array merge with a length equal to the sum of the lengths of word1 and word2.
   2. Initialize two pointers, i and j, both starting at 0.
   3. While i is less than the length of word1 and j is less than the length of word2, do the following:
      a. Assign the character at index i of word1 to merge\[i+j\].
      b. Increment i by 1.
      c. Assign the character at index j of word2 to merge\[i+j\].
      d. Increment j by 1.
   4. After the loop, if there are remaining characters in word1, do the following:
      a. Append the remaining characters of word1 to merge, starting from the current value of i+j.
      b. Increment i until it reaches the length of word1.
   5. After the loop, if there are remaining characters in word2, do the following:
      a. Append the remaining characters of word2 to merge, starting from the current value of i+j.
      b. Increment j until it reaches the length of word2.
   6. Convert the character array merge to a string.
   7. Return the merged string.

## Time Complexity - O(n)

- Iterating through both word1 and word2 takes linear time, O(n), where n is the total number of characters in both strings.
- The time complexity of appending characters to the merge array is also O(n).
- Therefore, the overall time complexity of the mergeAlternately method is O(n).

## Space Complexity - O(n)

- We create a character array merge of size word1.length() + word2.length() to store the merged string. This operation takes O(n) space, where n is the total number of characters in both input strings.

## Take Away From the Problem:

### String Manipulation

| Function  | Usage | 
| -------- | -------- |
| length()   | Used to get the length of the String   |
| chatAt()   | Used to check character at Index   |

### Object Instantiation 
- Array is converted to a string using the String constructor **"new String(merge)"**

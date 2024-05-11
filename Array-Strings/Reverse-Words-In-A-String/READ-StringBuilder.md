## Input & Output
Input: s = "a good   example";
Output: "example good a"

## Algorithm (StringBuilder)

1. Take a string s as input.
2. Split the string into words based on spaces using the split(" +") method. This creates an array of words.
3. Create a StringBuilder named sb to build the reversed string.
4. Start a loop from the last word in the array (words.length - 1) to the first word (0).
5. In each iteration of the loop:
    - Append the current word to the StringBuilder (sb.append(words\[i\])).
    - Append a space after the word (sb.append(" ")), to separate words in the reversed string.
6. After the loop, return the reversed string by converting the StringBuilder to a string using sb.toString(), and then trimming any leading or trailing spaces using trim().

## Time Complexity - O(n+m)

- Splitting the string s into words using the split(" +") method takes O(n).
- The loop that reverses the words iterates through each word in the array once. Since there are m words in the array, the loop has a time complexity of O(m).
- So, the time complexity of the algorithm is O(n + m), where n is the length of the input string and m is the number of words in the string.

## Space Complexity - O(n+m)

- The space complexity of splitting the string into words using split(" +") is O(n).
- The space complexity of the StringBuilder (sb) is O(n).
- Additional space is used for the array of words, which is O(m)
- So, the space complexity of the algorithm is O(n + m), where n is the length of the input string and m is the number of words in the string.

## Take Away From the Problem:

### String Builder

- A StringBuilder is a class in Java used to create mutable sequences of characters. 
- It's particularly useful when you need to concatenate multiple strings or modify a string multiple times without creating new string objects

| Method  | Description | Example  | Usage | 
| -------- | -------- | -------- | -------- |
| StringBuilder()   | Constructs an empty StringBuilder with initial capacity   | StringBuilder sb = new StringBuilder();   | Creating a new empty StringBuilder object   |
| append(String str)  | Appends the specified String to the end of the sequence   | sb.append("Hello")   | Adding a string to the end of the StringBuilder Sequence   |
| insert(int offset, String str)   | Inserts the specified string into the sequence at the specified position   | sb.insert(0, "Welcome");   | Inserting a string at the specified position in the StringBuilder   |
| reverse()   | Reverses the characters in the sequence   | sb.reverse();   | Reversing the character in the StringBuilder sequence   |
| toString()   | Convert the contents of the StringBuilder to a String   | String result = sb.toString();   | Getting the final string from the StringBuilder   |

### Note:

**It's commonly used in situations where string manipulation is involved, such as building SQL queries, constructing XML/JSON responses, or formatting complex messages dynamically.**
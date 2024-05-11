## Input & Output
Input: s = "a good   example";
Output: "example good a"

## Algorithm (Swapping)

1. Take a string s as input.
2. Split the string into words based on spaces using the split(" +") method. This creates an array of words.
3. Initialize two pointers: start pointing to the first word in the array and end pointing to the last word in the array.
4. While start is less than end, do the following:
    - Swap the words at positions start and end in the array.
    - Move start pointer forward by one position and end pointer backward by one position.
5. After the loop, join the words in the array with spaces in between using String.join(" ", words). This creates a single string with words in reversed order.
6. Trim any leading or trailing spaces from the resulting string.
7. Return the reversed string.

## Time Complexity - O(n+m)

## Space Complexity - O(n+m)

## Take Away From the Problem:

### String.join()

- It is a method in java that joins together multiple strings using a specific delimiter. 

``` 
public static String join(CharSequence delimiter, charSequence.. elements) 
    //example 
    return String.join(" ", words);
```
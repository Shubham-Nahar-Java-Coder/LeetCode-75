# LeetCode-75

This repository contains array/string problems categorized into two levels: Easy and Medium.

## Easy: 
1. [Merge Strings Alternately](https://github.com/Shubham-Nahar-Java-Coder/Leetcode-75/tree/master/Array-Strings/Merge-String-Alternately)
2. [Greatest Common Divisor of Strings](https://github.com/Shubham-Nahar-Java-Coder/Leetcode-75/tree/master/Array-Strings/Greatest-Common-Divisor-Of-String) 
3. [Kids With the Greatest Number of Candies](https://github.com/Shubham-Nahar-Java-Coder/Leetcode-75/tree/master/Array-Strings/Kids-With-Greatest-Number-Of-Candies) 
4. [Can Place Flowers](https://github.com/Shubham-Nahar-Java-Coder/Leetcode-75/tree/master/Array-Strings/Can-Place-Flowers)
5. Reverse Vowels of a String
 
## Medium: 
1. Reverse Words in a String 
2. Product of Array Except Self 
3. Increasing Triplet Subsequence 
4. String Compression

## Notes:

I've prepared some notes on arrays and strings. It's beneficial to review them before diving into the problem statements and solutions. This understanding will facilitate easier issue resolution and clearer comprehension.

## Arrays:
- It is a collection of elements of **Same Type** stored in **Contiguous Memory**.

### Declaration and Initialization: 
1. Declaration: DataType\[\] arrayName;
2. Static Initialization: DataType\[\] arrayName = {Values};
3. Dynamic Initialization: DataType\[\] arrayName = new DataType\[Size_of_the_array\]

### Useful Methods:
1. arrayName.length;
    - It gives us the length of the array

2. System.arraycopy(SourceArrayName, SourcePositon, DestinationArrayName, DestinationPosition, length);
    - This copies elements from one array to another at specified positions.

3. Arrays.sort(arrayName);
    - Sorts the elements of the array in ascending order.

4. Arrays.binarySearch(arrayName, element-to-search);
    - Seaches for the specified element in the sorted array using Binary Search.

5. Arrays.equals(arrayName1, arrayName2);
    - Compares 2 arrays if they are equal

6. Arrays.fill(arrayName, value-to-fill);
    - Assigns the specified value to each element of the array

7. Arrays.toString(arrayName);
    - Returns the String represntation of the Array.

8. Arrays.parallelSort(arrayName);
    - Sorts the elements of the array in parallel for improved performance with large arrays on multi-core CPU.

All of these methods are part of **java.until.Arrays**.

## Strings:
- represent a Sequence of Characters.

### Declaration and Initialization:
1. String str = "hello";
2. String str = new String("Hello");

**Note**: When we use the **new** keyword to create a String object, Java explicitly creates a new string in the heap memory. But, when we create a String using **String Literal** java automatically handles by reusing the existing instance instead of creating a new one.

### Useful Methods:
1. str.length();
    - It gives us the length of the string.

2. str.charAt(Index);
    - Returns the character at the specified index within the string.

3. str.subString(beginIndex);
    - Returns a new string that is a substring of the original string, starting from the specified index.

4. str.IndexOf(subString/element);
    - Returns the index of the first occurrence of the specified substring/element within the string, or -1 if not found.

5. str.concat(subString/element);
    -  Concatenates the specified string to the end of the original string, returning a new string.

6. str.toLowerCase();
    - Returns a new string with all characters converted to lowercase

7. str.toUpperCase();
    - Returns a new string with all characters converted to uppercase.

8. str.isEmpty();
    - Returns true if the length of this string is 0, otherwise false

9. str.compareTo(anotherString);
    - Compares two strings.

10. str.trim();
    - Returns a copy of the string, with leading and trailing whitespace omitted.

### Searching & Comparison Methods:

1. str1.equals(str2);
    - Compares two Strings/ String Objects;

2. str1.equalsIgnoreCase(str2);
    - Compares 2 string ignoring the case.

3. str.indexOf(element);
    - Returns the index within this string of the first occurrence of the specfied element ie. character, substring.

4. str.contains(character);
    - Returns true if and only if this string contains the character.

### String Split and Join

1. str1.split(expression);
    - Splits this string around matches of the given expression. (eg. " " -> Blank Space or "\\s+" -> Multiple spaces)

2. str1.join(delimiter, element);
    - Returns a new String composed of elements (eg: st1.charAt(i)) joined together with specified delimiter (eg: " " -> Blank Space).

### String Representation Methods:

1. toString();
    - Converts the array/other data collections to String.

2. str1.toCharArray();
    - Converts this string to a new character array.

## ArrayList:
- Dynamic Array Implementation (ie. Resizable Array).

### Useful Menthods:
1. add();
    - Appends the element to the list.

2. remove();
    - Removes the element from the list.

3. clear();
    - Removes all the elements from the list.

4. get();
    - Returns the element at the specified position.

5. set();
    - Replace the element at the specified position.

6. size();
    - Returns the size of the list.

7. isEmpty();
    - Returns true if list contains no elements.

8. contains();
    - Returns true if list contains the specified element.

9. toArray();
    - Returns an array containing all the elements in the list.


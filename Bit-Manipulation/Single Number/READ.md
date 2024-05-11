## Input & Output
Input: nums = \[4,1,2,1,2\];
Output: 4

## Algorithm

1. Start with the first element of the input array nums and assign it to a variable named single.
2. Iterate through the array starting from the second element (index 1) to the last element.
3. For each element in the array, perform a bitwise XOR (^) operation between the current value of single and the element at the current index (nums\[i\]), and update the value of single with the result.
4. After iterating through all elements of the array, the value of single will hold the element that appears only once in the array.
5. Return the value of single.

## Time Complexity - O(n)

## Space Complexity - O(1)

## Take Away From the Problem:

| Operator  | Description | Example  | Use Case  | 
| -------- | -------- | -------- | -------- |
| &   | Bitwise AND   | ``` int result = 5 & 3; // result = 1 ```   | Setting or clearing specific bits in a bitmask extracting specific bits from a bit pattern   |
| \|   | Bitwise OR   | ``` int result = 5 \| 3; // result = 7 ```   | Combining or merging bit patterns, setting specific bits in a bitmask   |
| ^   | Bitwise XOR   | ``` int result = 5 ^ 3; // result = 6 ```   | Toggling specific bits, swapping values without a temporary variable   |
| ~   | Bitwise Complement   | ``` int result = ~5; // result = -6 ```   | Inverting all bits in a number, creating bitmasks with all bits set except certain positions   |
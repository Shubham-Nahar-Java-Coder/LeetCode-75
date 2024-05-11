## Input & Output
Input: n = 5;
Output: \[0,1,1,2,1,2\]

## Algorithm

1. Create an array ans of integers with a size of n + 1 to store the count of set bits for each number from 0 to n.
2. Set ans\[0\] to 0 since there are no set bits in the binary representation of 0.
3. Iterate from 1 to n:
    - Convert the current number i to its binary representation and store it in a string convertToBinary.
    - Call the countOne method to count the number of set bits in the binary representation of i.
    - Store the count in the ans array at index i.
4. Return the ans array containing the count of set bits for each number from 0 to n.

**countOne(String num):**
1. Initialize a variable count to 0 to keep track of the count of set bits.
2. Iterate through each character of the input binary string num.
    - If the current character is '1', increment the count.
3. Return the final count, which represents the total count of set bits in the binary string num.

## Time Complexity - O(n)

## Space Complexity - O(n)

## Take Away From the Problem:

| Function  | Description | 
| -------- | -------- |
| Integer.toBinaryString(i)   | Returns the binary representation of an Integer as a String   |

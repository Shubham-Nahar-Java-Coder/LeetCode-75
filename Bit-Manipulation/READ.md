# LeetCode-75

This repository contains Bit Manipulation problems categorized into two levels: Easy and Medium.

## Easy: 
1. Counting Bits
2. Single Number
 
## Medium: 
1. Minimum Flips to Make a OR b Equal to c

## Notes:

I've prepared some notes on Bit manipulation. It's beneficial to review them before diving into the problem statements and solutions. This understanding will facilitate easier issue resolution and clearer comprehension.

## Bit Manipulation:
- Bit manipulation in Java involves **performing operations** directly on individual bits within **binary representations** of data. 
- This **technique** is often **used** in scenarios where **performance or memory efficiency** is critical, such as in **low-level programming, cryptography, or optimizing algorithms.**

## Important Notes:

### Power of 2:

- Many operations in bit manipulation revolve around powers of 2. 
- For example, left shifting a number by 1 is equivalent to multiplying it by 2, and right shifting by 1 is equivalent to dividing by 2 (for positive integers). 

### Funtions:

- **Integer.bitCount(int i):** Returns the number of one-bits. 
    ```
    int count = Integer.bitCount(5); // Returns 2, as 5 in binary is 101
    ```

- **Integer.highestOneBit(int i):**  Returns an integer with the same sign bit as the specified integer, and with all the lower-order bits cleared.
    ```
    int highestBit = Integer.highestOneBit(12); // Returns 8, as 12 in binary is 1100
    ```

- **Integer.rotateLeft(int i, int distance) and Integer.rotateRight(int i, int distance):** Rotate the bits of the specified integer to the left or right by a specified distance.
    ```
    int rotatedLeft = Integer.rotateLeft(5, 1); 
    // Returns 10, as rotating 5 by 1 bit to the left results in 1010
    int rotatedRight = Integer.rotateRight(5, 1); 
    // Returns 1073741824, as rotating 5 by 1 bit to the right results in 0010
    ```



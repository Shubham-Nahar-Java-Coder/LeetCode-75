## Input & Output
Input: n = 25;
Output: 1389537

## Algorithm

1. Start with a function tribonacci that takes an integer n as input.
2. Check if n is equal to 0. If it is, return 0.
3. Check if n is less than or equal to 2. If it is, return 1.
4. Create an array dp of size 40 to store the tribonacci sequence.
5. Initialize the first three elements of dp as 0, 1, and 1 respectively.
6. Iterate from index 3 to n:
    - Set dp\[i\] as the sum of the previous three elements in the sequence: dp\[i-1\], dp\[i-2\], and dp\[i-3\].
7. Return the value of dp\[n\], which represents the tribonacci number at index n

## Time Complexity - O(n)

- The time complexity of the code is O(n), because the code iterates through the loop from 3 to n, and for each iteration, it computes the next tribonacci number by summing the previous three tribonacci numbers. 

## Space Complexity - O(1)

- The space complexity of the code is O(n), because of the array dp which has a size of 40 constant size, regardless of the input n.
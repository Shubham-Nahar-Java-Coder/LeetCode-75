## Input & Output
Input: nums = \[0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1\], k = 3
Output: 10

## Algorithm

1. Initialize variables:
    - i as the end of the sliding window.
    - j as the start of the sliding window (initialized to -1).
    - ans to store the maximum length of continuous ones found.
    - countOfZero to keep track of the count of zeros encountered within the sliding window.
2. Iterate through the nums array:
    - If the current element (nums\[i\]) is 0, increment countOfZero and move i to the next position.
    - If the current element is 1, simply move i to the next position.
    - While countOfZero exceeds the given threshold k, 
        - move j to the next position and decrement countOfZero if the element at nums\[j\] is 0.
    - Calculate the size of the current window (sizeOfWindow) by subtracting j from i - 1.
    - Update ans with the maximum value between the current ans and sizeOfWindow.
3. Return the final value of ans which represents the length of the longest subarray containing at most k zeros.

## Time Complexity - O(n)

- The Code iterates through the entire nums array once.
- So, the time complexity of the Code is O(n).

## Space Complexity - O(1)

- The Code uses a constant amount of extra space for variables such as i, j, ans, and countOfZero, regardless of the size of the input array.
- So, the space complexity of the Code is O(1).
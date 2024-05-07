## Input & Output
Input: n = 10, pick = 6
Output: 6

## Algorithm

1. Initialize the start and end variables to 1 and n respectively.
2. While the start index is less than or equal to the end index:
    - Calculate the midpoint index as the average of start and end.
    - Call the guess method with the midpoint index.
        - If the guess result is 0, meaning the midpoint is the picked number, return the midpoint.
        - If the guess result is 1, meaning the picked number is greater than the midpoint, update the start index to be one greater than the midpoint.
        - If the guess result is -1, meaning the picked number is less than the midpoint, update the end index to be one less than the midpoint.
3. If the loop exits without finding the picked number, return -1 to indicate that the picked number is not within the given range.

## Time Complexity - O(log n)

- The time complexity of the binary search algorithm is O(log n).

## Space Complexity - O(1)

- The space complexity of the algorithm is O(1) because it uses a constant amount of additional space regardless of the size of the input.
## Input & Output
Input: nums = \[0,1,1,1,0,1,1,0,1\]
Output: 5

## Algorithm

1. Initialize three variables:
    - ans to store the length of the longest subarray with at most one zero.
    - count to keep track of the number of zeros encountered so far in the current subarray.
    - i to iterate through the array nums.
    - j to mark the starting index of the current subarray.
2. Iterate through the array nums using a while loop with the condition i < nums.length.
    - If the current element nums\[i\] is equal to 1 
        - increment i to move to the next element.
    - If the current element nums\[i\] is equal to 0 
        - increment both count and i to move to the next element.
3. While the count of zeros (count) is greater than 1 and j is less than i, execute a nested while loop:
    - Increment j to move the starting index of the subarray forward.
    - If the element at index j (nums\[j\]) is equal to 0 
        - decrement count to maintain the constraint of at most one zero in the subarray.
4. Update ans to be the maximum value between ans and the length of the current subarray (i - j - 1), where i - j - 1 represents the length of the subarray from index j to i excluding both j and i.
5. Return ans - 1, subtracting 1 from ans to represent the length of the longest subarray.

## Time Complexity - O(n)

- The code iterates through the array nums once with two pointers i and j
- So, the time complexity of the Code is O(n).

## Space Complexity - O(1)

- The space complexity is O(1) because the algorithm only uses a constant amount of extra space for storing variables regardless of the size of the input array.
- So, the space complexity of the Code is O(1).
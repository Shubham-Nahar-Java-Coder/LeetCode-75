## Input & Output
Input: nums = {1,7,4,1,1,15}; 
Output: 3;

## Understanding the Problem Statement

- To find the index of a pivot element in an array

**What is Pivot Element?**
- A pivot element is defined as an element whose sum of the elements to its left is equal to the sum of the elements to its right.

## Algorithm

1. Create an array preSum of the same length as nums to store the prefix sums.
2. Initialize a variable total with the value of the first element of nums.
3. Set the first element of preSum to 0.
4. Iterate over the elements of nums starting from the second element:
    - Add the current element of nums to the total.
    - Set the current element of preSum to the sum of the previous element of preSum and the previous element of nums.
5. Iterate over the elements of nums:
    - If the current prefix sum (preSum[i]) is equal to the total sum of nums minus the current element of nums minus the current prefix sum (total - nums[i] - preSum[i]), return the index i.
6. If pivot index is not found, return -1.


## Time Complexity - O(n)

- The first loop iterates through the entire array nums once to calculate the prefix sums and total. This loop has a time complexity of O(n).
- The second loop also iterates through the entire array nums once to check each element for the pivot condition. This loop also has a time complexity of O(n).
- So, the overall time complexity is O(n) + O(n) = O(n).

## Space Complexity - O(n)

- The additional space complexity is primarily due to the preSum array, which is created to store the prefix sums. It has the same length as the input array nums, resulting in **O(n)** space complexity.
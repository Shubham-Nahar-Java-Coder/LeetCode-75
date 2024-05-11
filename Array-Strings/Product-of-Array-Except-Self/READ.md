## Input & Output
Input: nums = \[-1,1,0,-3,3\];
Output: \[0,0,9,0,0\]

## Algorithm

1. Initialize two arrays, left and right, both of length equal to the length of the input array nums.
2. Set the first element of left to 1.
3. Iterate over nums starting from index 1:
    - For each element at index i, set the corresponding element in left to the product of all elements to the left of i in nums.
4. Set the last element of right to 1.
5. Iterate over nums starting from the second last element:
    - For each element at index i, set the corresponding element in right to the product of all elements to the right of i in nums.
6. Initialize a new array ans with the same length as nums.
7. Iterate over nums:
    - For each element at index i, set the corresponding element in ans to the product of the corresponding elements in left and right arrays.
8. Return the ans array.

## Time Complexity - O(n)

- The first loop iterates over the nums array once, performing constant time operations within each iteration. This loop contributes O(n) time complexity.
- The second loop also iterates over the nums array once, performing constant time operations within each iteration. This loop also contributes O(n) time complexity.
- The third loop iterates over the nums array once, performing constant time operations within each iteration. This loop contributes O(n) time complexity.
- So, the overall time complexity of the algorithm is O(n).

## Space Complexity - O(n)

- The algorithm utilizes three additional arrays:
        - left array of size n.
        - right array of size n.
        - ans array of size n.
- So, the space complexity of the algorithm is O(n).
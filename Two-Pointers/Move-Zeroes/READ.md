## Input & Output
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

## Algorithm

1. Create a function called moveZero that takes an integer array arr as input and returns an integer array.
2. Initialize a variable insertPosition to 0.
3. Iterate over the elements of the input array arr using a loop, starting from index 0 and ending at the last index.
4. For each element in the array:
    - If the element is not equal to 0, copy it to the position indicated by insertPosition in the array, then increment insertPosition by 1.
5. After the loop, check if insertPosition is less than the length of the array.
    - If insertPosition is less than the length of the array, it means there are remaining positions to be filled with zeros.
    - Fill the remaining positions in the array with zeros starting from insertPosition until the end of the array.
6. Return the modified array

## Time Complexity - O(n)

- The program iterates through each element of the input array once in the for loop.
- Inside the loop, there are constant operations of assignments and comparisons performed for each element.
- So, the time complexity is O(n)

## Space Complexity - O(1)

- The algorithm operates in-place, modifying the input array arr without using any additional space.
- So, the space complexity is O(1)

## Input & Output
Input: nums = \[1,2,3,4,5\];
Output: true

## Algorithm

1. Start by checking if the input array is null or has fewer than three elements. If so, return false because we need at least three elements to find an increasing triplet.
2. Initialize two variables, first and second, with the maximum possible integer value. These variables will represent the smallest and second smallest elements found so far.
3. Iterate through each element in the input array:
    - If the current element is less than or equal to the value of first, update the value of first to the current element.
    - else, if the current element is less than or equal to the value of second, update the value of second to the current element.
    - If neither of the above conditions is met, it means we have found an element greater than both first and second, indicating the presence of an increasing triplet. In this case, return true.
4. If the loop completes without finding an increasing triplet, return false, indicating that no such triplet exists in the array.

## Time Complexity - O(n)

- The code iterates through each element in the input array once in a single loop.
- Within the loop, there are a constant number of comparisons and assignments.
- So, the time complexity is O(n).

## Space Complexity - O(1)

- The code uses a constant amount of extra space regardless of the size of the input array.
- It only requires a few integer variables (first, second) to keep track of the smallest and second smallest elements found so far.
- So, the space complexity is O(1)
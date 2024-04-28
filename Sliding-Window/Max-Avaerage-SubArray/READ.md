## Input & Output
Input: nums = {1,12,-5,-6,50,3}, k =4; 
Output: 12.75;

## Algorithm

1. The function findMaxAverage takes an array of integers nums and an integer k as input adn return max average double as output.
2. Checking if the length of the input array nums is smaller than the window size k. If it is, throw an IllegalArgumentException indicating that the window size is too small to calculate the average.
3. Initialize a variable sum to 0, which will store the sum of elements within each window.
4. Iterate through the first k elements of the array nums and calculate their sum, storing it in the variable sum.
5. Set maxSum equal to the current sum, as this will be the initial maximum sum within the first window.
6. Initialize two pointers, startIndex and endIndex, to 0 and k respectively. These pointers will mark the beginning and end of the current window.
7. Enter a loop that continues until the endIndex reaches the end of the array nums.
8. Within the loop:
    - Subtract the element at startIndex from the sum, as it is no longer within the current window.
    - Increment startIndex to move the window forward.
    - Add the element at endIndex to the sum, as it becomes part of the current window.
    - Increment endIndex to expand the window.
    - Update maxSum to be the maximum between the current maxSum and the sum.
9. Once the loop completes, return the maxSum divided by the window size k.

## Time Complexity - O(n)

- Calculating the sum of the first k elements of the array takes O(k) time.
- The loop iterates through the remaining elements of the array, each time performing constant-time operations. Since the loop runs n - k times, the time complexity of this loop is O(n - k).
- So, the time complexity of the algorithm is O(n).

## Space Complexity - O(1)

- The algorithm uses a constant amount of extra space regardless of the input size. It only requires a few integer variables (sum, maxSum, startIndex, endIndex) to keep track of the current state.
- Also, no additional data structures or arrays are used.
- So, the space complexity of the algorithm is O(1).

## Take Away From the Problem:

### Type Casting
- In the return statement, type casting is used to convert the maxSum to a double before dividing it by the window size k (ie. **(double) maxSum/4**).

### Exception Handling
- An **IllegalArgumentException** is thrown if the input array's length is smaller than the window size, demonstrating the use of exception handling in Java.

### Mathematical Operation

| Function  | Usage | 
| -------- | -------- |
| Math.max(a,b)   |  It takes two parameters and returns the larger of the two values.  |

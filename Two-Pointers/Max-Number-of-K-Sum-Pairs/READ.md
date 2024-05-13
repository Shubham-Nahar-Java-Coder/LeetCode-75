## Input & Output
Input: height = \[1,2,3,4\]; k= 5
Output: 2

## Algorithm

1.Start with initializing a variable ans to zero, which will count the number of pairs that sum up to the given value k.
2. Sort the input array nums in non-decreasing order.
3. Initialize two pointers, left pointing to the beginning of the sorted array and right pointing to the end of the sorted array.
4. While the left pointer is less than the right pointer:
    - Check if the sum of the elements at nums\[left\] and nums\[right\] is less than the target value k.
        - If so, increment the left pointer.
    - If the sum is greater than k 
        - decrement the right pointer.
    - If the sum is equal to k, 
        - increment left, 
        - decrement right 
        - increment the ans counter.
5. Once the left pointer is no longer less than the right pointer, return the value stored in ans, which represents the total number of pairs that sum up to k in the given array.

## Time Complexity - O(n log n)

- Sorting the array nums takes O(n log n) time complexity.
- Since the while loop runs until left is less than right, in the worst-case scenario, it will take O(n)
- As, the overall time complexity is dominated by the sorting step, so the time complexity is O(n log n).

## Space Complexity - O(log n)

- The code only uses a few integer variables (ans, left, right) regardless of the size of the input array. These variables occupy constant space.
- Additionally, the space complexity of sorting depends on the sorting algorithm used. The space complexity of the sorting algorithm used in Java's Arrays.sort() is O(log n).
- So, the overall space complexity is O(log n).
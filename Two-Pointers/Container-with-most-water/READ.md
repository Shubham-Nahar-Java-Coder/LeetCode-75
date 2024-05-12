## Input & Output
Input: height = \[1,8,6,2,5,4,8,3,7\]
Output: 49

## Algorithm

1.Initialize two pointers, left and right, at the beginning and end of the array, respectively, and set maxArea to 0. These pointers will represent the current positions of the two vertical lines.
2. While the left pointer is less than the right pointer:
    - Calculate the area between the two vertical lines at positions left and right. This is done by taking the minimum of the heights of the two lines and multiplying it by the distance between them (which is right - left).
    - Update maxArea to be the maximum of the current calculated area and the previous maximum area.
3. Move the pointer that corresponds to the shorter vertical line inward. If the height at left is less than the height at right, move the left pointer to the right (increment left); Else, move the right pointer to the left (decrement right).
4. Continue steps 2-3 until the left pointer is no longer less than the right pointer.
5. Return maxArea, which will contain the maximum area of water that can be trapped by any two vertical lines in the array.

## Time Complexity - O(n)

- Since the algorithm traverses the array only once and the movement of pointers happens in constant time, the time complexity is O(n).

## Space Complexity - O(1)

- The algorithm uses a constant amount of extra space regardless of the size of the input array.
- So, the space complexity is O(1).
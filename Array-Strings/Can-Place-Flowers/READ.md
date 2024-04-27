## Input & Output
Input: flowerbed = [1,0,0,0,1]; n=1;
Output: true

## Algorithm

1. Create a method canPlaceFlowers that takes an array flowerbed and an integer n representing the number of flowers to place.
2. If n is 0, return true immediately since there are no flowers to place.
3. Initialize a integer variable count to keep track of the number of flowers placed.
4. Iterate through each element of the flowerbed array using a loop:
    - If the current element is 0 and there is space available for planting a flower (checked using the isAvailable method)  
        - increment the count, mark the current element as planted (set it to 1). 
    - If the count of planted flowers equals n, return true as the requirement is fulfilled.
5. create a method isAvailable that takes the flowerbed array and an index as arguments:
    - Check if the left adjacent element and right adjacent element of the index are both 0 or not within the array bounds. If either adjacent element is 1, return false. 
    - If both adjacent elements are 0 and within array bounds, return true.
 
6. If the loop completes without placing n flowers, return false indicating that it's not possible to place all the flowers.

## Time Complexity - O(n)

- Program iterates through the loop each element of the flowerbed array, which has a length of n, n is the length of the flowerbed array.
- Inside the loop, we perform checking the value of the current element, calling the isAvailable method, and updating the count variable.
- So, the time complexity of the algorithm is O(n), where n is the length of the flowerbed array.

## Space Complexity - O(1)

- The algorithm uses a constant amount of extra space regardless of the input size. We have only a few variables (count, i, index) and do not use any additional data structures that grow with the input size.
- So, the space complexity of the algorithm is O(1)

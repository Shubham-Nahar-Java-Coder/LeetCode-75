## Input & Output
Input: candies = [1,3,5,2,1]; extraCandies = 3;
Output: [false, true, true, true, false]

## Algorithm

1. Define a method named "kidsWithMaxCandies" which takes two parameters: an integer array named "candies" and an integer named "extraCandies". This method returns a list of booleans.
2. Initialize an ArrayList named "candyList" to store the boolean result.
3. Initialize an integer variable named "max" and set it to 0.
4. Iterate through the "candies" array using a for loop:
    - Inside the loop, retrieve the value of the current element in the "candies" array and store it in a variable named "val".
    - If "val" is greater than "max", update "max" to be equal to "val".
5. Iterate through the "candies" array again using a for loop:
    - Inside the loop, check if the sum of the current element in the "candies" array and "extraCandies" is greater than or equal to "max".
    - If true, add "true" to the "candyList", indicating that this kid can have the greatest number of candies by adding the extra candies.
    - If false, add "false" to the "candyList".
6. Return the "candyList" containing the boolean values indicating whether each kid can have the greatest number of candies.

## Time Complexity - O(n)

- The algorithm iterates through the "candies" array twice, each time with a single loop. Therefore, the time complexity for iterating through the "candies" array is O(n), where n is the number of elements in the "candies" array.
- Within each iteration, there are only operations (comparisons and assignments), so they do not affect the overall time complexity.
- So, the overall time complexity of the algorithm is **O(n)**.

## Space Complexity - O(n)

- The algorithm uses space to store the output in an ArrayList named "candyList", which can contain up to n elements, where n is the number of elements in the "candies" array.
- So, the overall space complexity of the algorithm is O(n).

## Important Terminologies 

1. ArrayList: 
    - ArrayList is a class in Java that implements the **List interface** and provides dynamic array-like functionality. It used for the **addition, removal, and retrieval of elements**. 

## Input & Output
Input: cost = \[**1**,100,**1**,1,**1**,100,**1**,**1**,100,**1**\];
Output: 6

## Algorithm

1. Begin the algorithm by defining a function minCost that takes an array cost as input.
2. Check if the length of the cost array is 0 or 1. If so, return 0 as there are no steps to climb or only one step.
3. Check if the length of the cost array is 2. If so, return the minimum cost of either the first or second step.
4. Create an array dp of the same length as the cost array to store the minimum cost to reach each step.
5. Initialize the first two elements of the dp array with the costs of the first and second steps, respectively.
6. Iterate over the cost array starting from the third element:
    - For each step i, compute the minimum cost of reaching that step by either coming from the previous step (i-1) or the step before the previous step (i-2), adding the cost of the current step.
    - Store the minimum cost in the dp array at index i.
7. After completing the iteration, return the minimum cost of reaching the last step, which is the minimum of the cost of reaching the last two steps in the dp array.

## Time Complexity - O(n)

- The algorithm iterates through the cost array once in a single loop, which takes O(n).
- Inside the loop, each iteration involves constant time operations, such as array accesses and mathematical computations.
- So, the overall time complexity of the algorithm is O(n).

## Space Complexity - O(n)

- The algorithm uses an additional array dp of the same length as the cost array to store the minimum cost to reach each step. So, the space complexity is O(n).
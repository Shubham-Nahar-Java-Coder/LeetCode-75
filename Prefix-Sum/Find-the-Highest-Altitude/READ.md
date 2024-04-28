## Input & Output
Input: gain = [-5,1,5,0,-7]; 
Output:1;

## Algorithm (Easy Solution)

1. Create a function called largestAltitude that takes an integer array (int[]) named gain as its argument and returns an integer (int).
2. Initialize two variables: currentAltitude and maxAltitude to 0. These variables will keep track of the current altitude and the maximum altitude reached during the journey.
3. Iterate over each element using for each altitude in the gain array.
4. Within each iteration:
    - Add the current altitude change (altitude) to the currentAltitude.
    - Update maxAltitude to the maximum value between the current altitude and the maximum altitude using Math.max().
5. Once all altitude changes are processed, return maxAltitude, which holds the maximum altitude reached during the journey.

## Time Complexity for Easy Solution - O(n)

- The algorithm iterates over each element in the gain array exactly once.
- Inside the loop, the algorithm performs constant-time operations of addition and comparison.
- So, the time complexity of the algorithm is O(n). 

## Space Complexity for Easy Solution - O(1)

- The algorithm uses a constant amount of space regardless of the size of the input gain array.
- It only uses two integer variables (currentAltitude and maxAltitude), which occupy a constant amount of space.
- So, the space complexity of the algorithm is O(1) 

## Take Away From Easy Solution:

### For Each Loop

- Is a convenient way to iterate through arrays or collections in Java. 

**SYNTAX FOR EACH LOOP**
- for (dataType variableName : arrayOrCollection) {
    // code block to execute for each element
    }


## Algorithm (Using Prefix Sum)

1. Initialize an empty list called prefixList.
2. Initialize two integer variables: max and altitude both set to 0.
3. Add 0 to the prefixList.
4. Iterate over each element gain[i] in the gain array:
    - Add the value of gain[i] to the altitude.
    - Append the new altitude to the prefixList.
5. Iterate over each element in the prefixList:
    - Compare each element with the current max.
    - If the element is greater than max, update max with the value of the element.
6. After iterating through the prefixList, max will contain the largest altitude reached.
7. Return max.

## Time Complexity for Easy Solution - O(n)

- The algorithm iterates through the gain array once to calculate the altitudes and store them in the prefixList. This takes O(n) time.
- Then, it iterates through the prefixList once to find the maximum altitude. This also takes O(n) time.
- So, the overall time complexity of the algorithm is O(n).

## Space Complexity for Easy Solution - O(n)

- The algorithm uses additional space to store the altitudes in the prefixList. The size of the prefixList is equal to the length of the gain array plus one (due to the initial 0 altitude). 
- So, the overall space complexity of the algorithm is O(n).

## Take Away From Prefix Sum Solution:

### List

- List is an **interface** that represents an **ordered collection** of elements. 
- It allows elements to be **added, removed, and accessed by their index**.
- The List interface provides several **implementations**, such as **ArrayList & LinkedList** each with its own characteristics regarding **performance, memory usage, and functionality**.

### List Methods/Funtions

| Function  | Usage | 
| -------- | -------- |
| list.add()   | Used to insert an element into the list at a specified position    |
| list.get()   |  used to retrieve an element from the list at a specified index   |

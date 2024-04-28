## Problem Statement

- You are given two arrays of integers, nums1 and nums2. Your task is to write a function findDifference that finds the difference between the elements of these arrays.

## Input & Output
Input:  nums1 = \[1,2,3\], nums2 = \[2,4,6\]
Output: \[\[1,3\],\[4,6\]\]

## Algorithm

1. Define a method called findDifference that takes two integer arrays, nums1 and nums2, as input and returns a list of lists of integers.
2. Create an empty HashSet called set1.
3. Iterate through each element (values) in nums1:
    - Add each element to set1.
4. Create an empty HashSet called set2.
5. Iterate through each element (values) in nums2:
    - Add each element to set2.
6. Create an empty HashSet called differenceSet1.
7. Iterate through each element (values) in nums1:
    - If values is not present in set2, add values to differenceSet1.
8. Create an empty HashSet called differenceSet2.
9. Iterate through each element (values) in nums2:
    - If values is not present in set1, add values to differenceSet2.
10. Convert differenceSet1 and differenceSet2 to ArrayLists.
11. Return a list containing differenceSet1 converted to an ArrayList and differenceSet2 converted to an ArrayList.

## Time Complexity - O(n)

1. Building set1 and set2:
    - Both nums1 and nums2 contain n elements, and adding each element to the HashSet takes O(1) time.
    - So, building set1 and set2 each has a time complexity of O(n).

2. Building differenceSet1:
    - We iterate through each element of nums1, which has n elements.
    - Checking if an element exists in set2 (using contains method) takes O(1) time on average in a HashSet.
    - Same steps on differenceSet2
So, building differenceSet1, differenceSet2 has a time complexity of O(n).
    
## Space Complexity - O(n)

- The space used is primarily for the HashSet objects (set1, set2, differenceSet1, and differenceSet2), which can each potentially store up to n elements.
- So, the space complexity is O(n).

## Take Away From the Problem:

### Data Structure Selection:

The program utilizes **HashSet**, for efficiently storing unique elements and performing set and contains operations.

### List Manipulation & Returning Multiple Values

- The program returns multiple lists of differences using a **list of lists**. This demonstrates how to **return multiple values**. Lists containing the differences found between nums1 and nums2 using the **Arrays.asList method and ArrayList constructors**. This showcases how to **manipulate lists** and create new ones to organize and return data.
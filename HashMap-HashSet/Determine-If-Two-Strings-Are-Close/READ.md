## Input & Output
Input:  s1 = "cabbba"; s2 = "abbccc"
Output: true

## Algorithm

1. Begin the function closeStrings which takes two strings, word1 and word2, as input.
2. Check if the lengths of word1 and word2 are not equal. If they are not equal, return false.
3. Create two arrays, word1Frequency and word2Frequency, each of length 26 (representing the 26 lowercase English letters).
4. Iterate through each character in word1 and word2 simultaneously.
    - For each character, increment the corresponding index in word1Frequency and word2Frequency.
5. Iterate through each index from 0 to 25 (representing the 26 lowercase English letters).
    - If the frequency of a letter is 0 in one word and not 0 in the other word, return false.
6. Sort both word1Frequency and word2Frequency arrays.
7. Check if the sorted arrays are equal. If they are equal, return true; otherwise, return false.

## Time Complexity - O(n)

1. Building set1 and set2:
    - Both nums1 and nums2 contain n elements, and adding each element to the HashSet takes O(1) time.
    - So, building set1 and set2 each has a time complexity of O(n).

2. Building differenceSet1:
    - We iterate through each element of nums1, which has n elements.
    - Checking if an element exists in set2 (using contains method) takes O(1) time on average in a HashSet.
    - Same steps on differenceSet2
So, building differenceSet1, differenceSet2 has a time complexity of O(n).
    
## Space Complexity - O(1)

- The space used is primarily for the HashSet objects (set1, set2, differenceSet1, and differenceSet2), which can each potentially store up to n elements.
- So, the space complexity is O(n).

## Take Away From the Problem:

### Data Structure Selection:

The program utilizes **HashSet**, for efficiently storing unique elements and performing set and contains operations.

### List Manipulation & Returning Multiple Values

- The program returns multiple lists of differences using a **list of lists**. This demonstrates how to **return multiple values**. Lists containing the differences found between nums1 and nums2 using the **Arrays.asList method and ArrayList constructors**. This showcases how to **manipulate lists** and create new ones to organize and return data.

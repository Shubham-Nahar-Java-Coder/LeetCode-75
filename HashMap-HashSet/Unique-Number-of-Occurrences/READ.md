## Problem Statement

- Given an integer array. We need to determine whether the number of occurrences of each element in the array is unique. 
- In other words, we need to check if no two different elements in the array have the same count of occurrences.

## Input & Output
- Input: arr = \[1,2,2,1,1,3\];
Output: true;
-  Input: arr = \[1,2\];
Output: false;

## Algorithm

1. Create a HashMap to store the frequency of each element in the input array.
2. Iterate through each element in the input array:
    - If the element is already present in the HashMap, increment its frequency count.
    - If the element is not present, add it to the HashMap with a frequency count of 1.
3. Create a HashSet to keep track of unique frequencies encountered.
4. Iterate through the values (frequencies) in the HashMap:
    - If the current frequency is already present in the HashSet, return false, indicating that there are duplicate frequencies.
    - If the current frequency is not present, add it to the HashSet.
5. If the loop completes without finding any duplicate frequencies, return true, indicating that all frequencies are unique.

## Time Complexity - O(n)

1. Counting Frequencies (HashMap):
    - Iterating through the input array to count the frequencies of each element takes O(n) time.
2. Checking Unique Frequencies (HashSet):
    - Iterating through the values (frequencies) in the HashMap and checking for uniqueness takes O(m) time.

**So, the time complexity of the code is O(n) + O(m), which simplifies to O(n) since O(m) is bounded by O(n) if all the elements are unique.** 
    
## Space Complexity - O(n)

1. HashMap:
    - The space required to store the frequencies of elements in the HashMap depends on the number of unique elements in the input array.  In the worst case, where all elements are unique, the HashMap would require O(n) space.
2. HashSet:
    - The HashSet is used to keep track of unique frequencies encountered. In the worst case, where all frequencies are unique, the HashSet would also require O(n) space.

## Take Away From the Problem:

### About getOrDefault Method:

- Increment the count of an element in a map, handling both existing and non-existing keys, can achieved through **map.put(element, map.getOrDefault(element, 0) + 1);** or, in **expanded form, by checking if the key exists, then either adding 1 or updating its value.**

    - In short and quick way: 
        - map.put(element, map.getOrDefault(element,0)+1);

    - Extracted Code for the same is
        - if(map.containsKey(element) == false){
            map.put(element, 1);
        }
        else{
        int increaseValue = map.get(element);
        map.put(element, increaseValue+1);
        }
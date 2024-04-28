# LeetCode-75

This repository contains HashMap and HashSet problems categorized into two levels: Easy and Medium.

## Easy: 
1. Find the Difference of Two Arrays
2. Unique Number of Occurrences

## Medium: 
1. Determine if Two Strings Are Close 
2. Equal Row and Column Pairs

## Notes:

I've prepared some notes on HashSet. It's beneficial to review them before diving into the problem statements and solutions. This understanding will facilitate easier issue resolution and clearer comprehension.

## HashSet
- It implements the **Set** interface, which represents a collection of **unique elements**.

- HashSet does not allow duplicate elements. If you attempt to add an element that is already present in the set, the add() method will return false, and the element will not be added.

- HashSet does not guarantee any specific order of the elements. If you need a **specific order**, you can use **LinkedHashSet**.

### Declaration and Initialization: 
HashSet<String> set1 = new HashSet<>();

### Useful Methods/Functions in HashMap:

| Method | Definition | Usage Example |
| -------- | -------- | -------- |
| add(E e)  | Adds the specified element to the set if it is not already present.  | HashSet<String> set = new HashSet<>(); boolean added = set.add("Apple");  |
| addAll(Collection<? extends E> c)  | Adds all elements from the specified collection to the set if they are not already present.   | HashSet<String> set = new HashSet<>(); set.addAll(Arrays.asList("Apple", "Banana"));  |
| remove(Object o) | Removes the specified element from the set if it is present.   | HashSet<String> set = new HashSet<>(); boolean removed = set.remove("Apple"); |
| clear()  | Removes all elements from the set.   | HashSet<String> set = new HashSet<>(); set.clear(); |
| contains(Object o) | Returns true if the set contains the specified element.   | HashSet<String> set = new HashSet<>(); boolean contains = set.contains("Apple"); |
| isEmpty() | Returns true if the set is empty.   | boolean empty = set.isEmpty(); |
| size() | 	Returns the number of elements in the set.   | int size = set.size(); |
| iterator() | 	Returns an iterator over the elements in the set.   | HashSet<String> set = new HashSet<>(); Iterator<String> iterator = set.iterator(); while (iterator.hasNext()) { String element = iterator.next(); } |
| toArray() | 	Returns an array containing all elements in the set.   | Object[] array = set.toArray(); |
| equals(Object o) | 	Compares the specified object with the set for equality.  | boolean isEqual = set1.equals(set2); |
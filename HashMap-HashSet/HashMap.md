# LeetCode-75

This repository contains HashMap and HashSet problems categorized into two levels: Easy and Medium.

## Easy: 
1. Find the Difference of Two Arrays - Not a HashMap Problem
2. Unique Number of Occurrences

## Medium: 
1. Determine if Two Strings Are Close 
2. Equal Row and Column Pairs

## Notes:

I've prepared some notes on HashMap. It's beneficial to review them before diving into the problem statements and solutions. This understanding will facilitate easier issue resolution and clearer comprehension.

## HashMap
- It implements the **Map interface**. It stores **key-value pairs** and allows **fast retrieval** of values based on their associated keys.

- HashMap does not guarantee any specific order of the elements. If you need a **specific order**, you can use **LinkedHashMap**, which maintains **insertion order**, or **TreeMap**, which sorts the elements based on their keys.

- Basic operations that can be performmed on HashMap are **adding, accessing, iterating, checking existence, and removing elements**.

### Declaration and Initialization: 
HashMap<DataType, DataType> map = new HashMap<>();

### Useful Methods/Functions in HashMap:

| Method | Definition | Usage Example |
| -------- | -------- | -------- |
| put(key, value)   | Associates the specified value with the specified key in the map.   | HashMap<String, Integer> map = new HashMap<>(); map.put("apple", 10);  |
| get(key)  | Returns the value to which the specified key is mapped.   | int value = map.get("apple");  |
| size() | Returns the number of key-value mappings in the map.   | int size = map.size(); |
| containsKey(key)  | Returns true if the map contains a mapping for the specified key.   | if (map.containsKey("banana")) { // Do something } |
| containsValue(value) | Returns true if the map maps one or more keys to the specified value.   | if (map.containsValue(20)) { // Do something } |
| isEmpty() | Returns true if the map contains no key-value mappings.   | if (map.isEmpty()) { // Do something } |
| keySet() | 	Returns a set containing all the keys in the map.   | Set<String> keys = map.keySet(); |
| values() | 	Returns a collection containing all the values in the map.   | Collection<Integer> values = map.values(); |
| entrySet() | 	Returns a set containing all the key-value mappings in the map.   | Set<Map.Entry<String, Integer>> entries = map.entrySet(); |
| clear() | 	Removes all the key-value mappings from the map.	  | map.clear(); |
| getOrDefault(key, defaultValue) | 	Returns the value to which the specified key is mapped, or defaultValue if the key is not present.	  | int value = map.getOrDefault("orange", 0); |

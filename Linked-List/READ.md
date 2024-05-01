# LeetCode-75

This repository contains Linked List problems categorized into two levels: Easy and Medium.

## Easy: 
1. [Reverse Linked List](https://github.com/Shubham-Nahar-Java-Coder/Leetcode-75/tree/master/Linked-List/Reverse-Linked-List)

## Medium: 
1. Delete the Middle Node of a Linked List
2. Odd Even Linked List
3. Maximum Twin Sum of a Linked List

## Notes:

I've prepared some notes on Linked List. It's beneficial to review them before diving into the problem statements and solutions. This understanding will facilitate easier issue resolution and clearer comprehension.

## Linked List

- A linked list is a data structure that consists of a sequence of elements, where each element points to the next one in the sequence.
- There are three main types of Linked List:
    1. Singly Linked List 
        - In a singly linked list, each element (node) contains two parts: the data and a reference (or pointer) to the next node in the sequence. The last node typically points to null, indicating the end of the list.
    2. Doubly Linked List
        - In a doubly linked list, each node contains an additional reference to the previous node, allowing traversal in both directions. 
    3. Circular Linked List 
        - In a circular linked list, the last node points back to the first node instead of null, forming a circular structure.  

### Useful Methods/Functions in Linked List:

| Method | Definition | Usage Example |
| -------- | -------- | -------- |
| append(data)   |Adds a new node containing the given data to the end of the linked list. If the list is empty, the new node becomes the head.   | list.append("New Task");  |
| prepend(data)  | Adds a new node containing the given data to the beginning of the linked list.   | list.prepend("New Message"); |
| insert(index, data) | Inserts a new node containing the given data at the specified index in the linked list. If the index is out of bounds, the operation fails.   |list.insert(2, "New Song"); |
| delete(data)  | Removes the first occurrence of a node containing the specified data from the linked list. If the data is not found, the list remains unchanged.   | list.delete("Email Subject"); |
| deleteAtIndex(index) | Removes the node at the specified index from the linked list. If the index is out of bounds, the operation fails.   | list.deleteAtIndex(3); |
| search(data) | Searches for the first occurrence of the given data in the linked list. Returns true if found, false otherwise.  | boolean found = list.search("Book Title"); |
| get(index)   |Returns the data stored in the node at the specified index in the linked list. If the index is out of bounds, returns null   | String value = list.get(2);  |
| size()  | Returns the number of nodes (elements) in the linked list.   |int count = list.size(); |
| isEmpty() | Returns true if the linked list is empty, false otherwise.   | boolean empty = list.isEmpty(); |
| reverse()  | Reverses the order of elements in the linked list, making the last node the new head and the head node the new tail.   | list.reverse(); |
| display() | Prints the data stored in each node of the linked list, typically used for debugging or visualization purposes.   | list.display(); |

# LeetCode-75

This repository contains Queue problems categorized into two levels: Easy and Medium.

## Easy: 
1. [Number of Recent Calls](https://github.com/Shubham-Nahar-Java-Coder/Leetcode-75/tree/master/Queue/Number-Of-Recent-Calls)

## Medium: 
1. Dota2 Senate

## Notes:

I've prepared some notes on Queue. It's beneficial to review them before diving into the problem statements and solutions. This understanding will facilitate easier issue resolution and clearer comprehension.

## Queue

- A queue is a data structure that follows the **FIFO** (First-In-First-Out) principle.
- It's typically used when you need to maintain the **order of elements** and process them in the order they were added.
- Queue provide efficient operations for **adding, removing, and inspecting elements** according to the FIFO principle.

### Implementations Available:

1. LinkedList
    - A linear data structure where elements are stored as nodes with references to the next and previous nodes, providing efficient **insertion and removal operations at both ends**.
2. ArrayQueue
    - A resizable array-based double-ended queue that allows efficient insertion and removal operations at both ends, providing better performance than LinkedList in most cases.
3. PriorityQueue
    - A queue data structure where elements are ordered based on their natural ordering or a specified comparator, with the highest-priority element accessible first.

### Declaration and Initialization: 

1. LinkedList as Queue:
    ```java
    Queue<Integer> queue = new LinkedList<>();

2. ArrayDeque as Queue:
    ```java
    Queue<Integer> queue = new ArrayDeque<>();

3. PriorityQueue as Queue:
    ```java
    Queue<Integer> queue = new PriorityQueue<>();

### Useful Methods/Functions in Queue:

| Method | Definition | Usage Example |
| -------- | -------- | -------- |
| add(E e)   |Adds the specified element to the end of the queue if possible. Throws an exception otherwise.   | queue.add(1);  |
| offer(E e)  | Adds the specified element to the end of the queue if possible. Returns true if successful.   | boolean success = queue.offer(1); |
| remove() | Retrieves and removes the head of the queue if possible. Throws an exception otherwise.   |int head = queue.remove(); |
| poll()  | Retrieves and removes the head of the queue if possible. Returns null if the queue is empty.   | Integer head = queue.poll(); |
| element() | Retrieves, but does not remove, the head of the queue if possible. Throws an exception otherwise.   | int head = queue.element(); |
| peek() | Retrieves, but does not remove, the head of the queue if possible. Returns null if the queue is empty.   | Integer head = queue.peek(); |
| isEmpty()   |Returns true if the queue contains no elements.   | boolean isEmpty = queue.isEmpty();  |
| size()  | Returns the number of elements in the queue.   | int size = queue.size(); |
| clear() | Removes all elements from the queue.	   |queue.clear(); |
| contains(Object o)  | Returns true if the queue contains the specified element.   | boolean contains = queue.contains(2); |
| toArray() | Returns an array containing all of the elements in the queue.   | Object[] array = queue.toArray(); |

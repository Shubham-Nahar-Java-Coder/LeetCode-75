## Problem Statement

- We need to write a program that counts how many requests happened in the last 3000 milliseconds. We're given a function called ping, which we'll use to record each request's time.

- ping(t): This function takes a time t when a request happened and returns the count of requests that occurred in the last 3000 milliseconds 


## Input & Output
- Input: 
    - RecentCounter: \["RecentCounter", "ping", "ping", "ping", "ping", "ping"\]
    - Ping: \[\[\], \[1\], \[100\], \[3001\], \[3002\], \[6003\]\]
- Output:
    - Queue: \[null, 1, 2, 3, 3, 1\]

## Algorithm

1. Create a constructor method for RecentCounter.
    - Create a new empty queue using the LinkedList implementation and assign it to the queue variable.

2. Start:
    - Begin the ping method. Receive a timestamp t as argument.

3. Check if the queue is empty:
    - If the queue is empty:
        - Add the current timestamp t to the queue using the offer method.
        - Return 1, indicating that there is now one request in the queue.

4. If the queue is not empty:
    - If the current timestamp t is within the last 3000 milliseconds:
        - Add the current timestamp t to the queue using the offer method.
    - If the current timestamp t is beyond the last 3000 milliseconds:
        - Calculate the margin by subtracting 3000 milliseconds from t.
        - Remove all timestamps from the queue that are older than the margin by repeatedly using the poll method until the queue is empty or the first timestamp is not older than the margin.
        - Add the current timestamp t to the queue using the offer method.

5. Return the size of the queue:
    - Return the size of the queue, which represents the count of requests within the last 3000 milliseconds


## Time Complexity - O(1)

- The operations like queue.size(), queue.offer(t), and queue.peek() all have constant time complexity.
    
## Space Complexity - O(n)

- The space required by the queue grows linearly with the number of timestamps stored in it. Since timestamps are added to the queue and removed from it, the space complexity remains linear with respect to the number of method calls (n).

## Take Away From the Problem:

### Constructor:

1. Same Name Convention: 
- The constructor method has the same name as the class.

2. Automatically Invoked:
- When you create an object of a class using the new keyword, Java automatically looks for a method with the same name as the class to invoke as the constructor. 


## Important

- We need to create an object of a class to use its fields and methods. 
- The object encapsulates the state and behavior defined by the class. 
- In the Code, an object of the RecentCounter class is created to manage and track recent requests. 
- Without creating an object, we wouldn't be able to use the queue field or any other methods defined within the class.
## Input & Output
Input: root = \[3,9,20,null,null,15,7\];
Output: 3

## Algorithm

1. If the input root node is null, return 0 as the maximum depth of the tree.
2. Otherwise, initialize a queue named elementQueue to perform level-order traversal of the binary tree.
3. Add the root node to the elementQueue.
4. Initialize a variable numberOfLevels to 0, which will be used to count the levels of the tree.
5. Enter an infinite loop (terminated by a return statement):
    - Get the number of nodes at the current level by querying the size of the elementQueue.
    - If there are no nodes at the current level (nodeCountAtLevel == 0), return numberOfLevels as the maximum depth of the tree.
    - Otherwise, enter a loop to process each node at the current level:
        - Dequeue a node from the elementQueue.
        - Decrement nodeCountAtLevel.
        - If the dequeued node has a left child, enqueue it.
        - If the dequeued node has a right child, enqueue it.
    - Increment numberOfLevels to move to the next level of the tree.
6. Repeat steps 5 until all levels of the tree have been traversed and the maximum depth has been calculated.

## Time Complexity - O(n)

- Traversal: The algorithm performs a level-order traversal of the binary tree, visiting each node once.
- Queue Operations: Within the traversal loop, each node is added to the queue once and removed from the queue once.
- So, the time complexity of the algorithm is O(n).

## Space Complexity - O(n)

- The space complexity of the algorithm is O(n/2) in the worst case, which simplifies to O(n). This is because the queue will store at most half of the nodes in the tree, considering a completely unbalanced tree where each node only has a left child.

## Take Away From the Problem:

### Level Order Traversal:

- Level Order Traversal explores the tree level by level, starting from the root and moving to the next level only after visiting all nodes at the current level. 

 - How level order traversal works:
 
        - Initialization: Begin with an empty queue and enqueue the root node of the binary tree.
        - Traversal Loop: Enter a loop that continues until the queue is empty. Within the loop:
            - Dequeue a node from the front of the queue.
            - Process the dequeued node.
            - Enqueue the left child of the dequeued node if it exists.
            - Enqueue the right child of the dequeued node if it exists.
        - Termination: Exit the loop when the queue becomes empty, indicating that all nodes have been visited.

- Level order traversal is commonly used in algorithms that require examining nodes in a hierarchical manner, such as finding the maximum depth of a binary tree, finding the minimum depth of a binary tree, or finding the level order traversal of a binary tree. It's also useful in scenarios where you need to process nodes level by level, such as in certain tree-based searches or optimizations.
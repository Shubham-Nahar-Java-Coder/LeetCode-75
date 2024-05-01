## Input & Output
Input: head = \[1,2,3,4,5\]
Output: \[5,4,3,2,1\]

## Algorithm

1. Start with two pointers, prevNode and currNode. Initialize prevNode as null and currNode as the head of the linked list.
2. Traverse the linked list with the currNode pointer.
    - Store the reference to the next node of currNode in a temporary variable called nextNode.
    - Reverse the currNode's next pointer to point to the prevNode, effectively reversing the direction of the link.
    - Move prevNode to currNode.
    - Move currNode to nextNode.
3. Continue this process until currNode becomes null, indicating the end of the original linked list.
4. After the loop, prevNode will be pointing to the last node of the original linked list, which will be the new head of the reversed linked list.
5. Set the head pointer of the original linked list to prevNode.
6. Return the new head of the reversed linked list.

## Time Complexity - O(n)

- The algorithm traverses the entire linked list once, performing constant-time operations in each iteration of the loop.
- So, the time complexity is O(n).

## Space Complexity - O(1)

- The algorithm uses only a constant amount of extra space regardless of the size of the input linked list.
- It uses a few pointers (prevNode, currNode, nextNode) and does not create any additional data structures.
- So, the space complexity is O(1).

## Take Away From the Problem:

### Pointer Manipulation:

- The key to efficiently reversing a linked list lies in manipulating pointers. By changing the direction of pointers, we can reverse the order of the elements without requiring extra space for storing the elements themselves.

### Iterative Approach:

- The iterative approach used in this program is often preferred over the recursive approach for reversing linked lists.


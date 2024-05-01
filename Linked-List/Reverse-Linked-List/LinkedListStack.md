## Input & Output
Input: head = \[1,2,3,4,5\]
Output: \[5,4,3,2,1\]

## Algorithm

1. Initialize a stack: Create an empty stack to store the values of the linked list nodes.
2. Traverse the original linked list:
    - Start from the head of the linked list.
    - While the current node is not null:
        - Push the value of the current node onto the stack.
        - Move to the next node in the linked list.
3. Create a new linked list to store the reversed values:
    - Initialize a dummy node as the head of the reversed linked list.
4. Traverse the stack to build the reversed linked list:
    - While the stack is not empty:
        - Pop a value from the stack.
        - Create a new node with this value.
        - Append this node to the end of the reversed linked list.
5. Return the reversed linked list:
    - Return the next node of the dummy node, which is the actual head of the reversed linked list.

## Time Complexity - O(n)

- Traversal to Push Values onto Stack: O(n). Because we traverse the entire linked list once to push each node's value onto the stack.

## Space Complexity - O(n)

- We use a stack to store the values of all nodes in the linked list, which requires additional space proportional to the number of nodes. So, the space complexity is O(n).

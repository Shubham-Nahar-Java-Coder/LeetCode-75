## Input & Output
Input: root = \[4,2,7,1,3\]; VAL = 2
Output: \[2,1,3\]

## Algorithm

1. Start with the root of the binary search tree (BST) as the current node.
2. While the current node is not null:
    - If the value of the current node is equal to the target value:
        - Return the current node, as it matches the search value.
    - If the value of the current node is greater than the target value:
        - Move to the left child of the current node.
    - If the value of the current node is less than or equal to the target value:
        - Move to the right child of the current node.
3. If the current node becomes null (i.e., the entire tree has been traversed and the value is not found):
    - Return null, indicating that the target value is not present in the BST.

## Time Complexity - O(h) - h is Height of Binary Tree

- In the worst-case scenario, the algorithm will traverse from the root to a leaf node in the BST.
- At each step of the traversal, the algorithm compares the value of the current node with the target value and moves either left or right accordingly.
- The time complexity is O(h).

## Space Complexity - O(n)

- The space complexity of the algorithm is O(1).
- It uses only a constant amount of extra space for variables such as curr to keep track of the current node during traversal.
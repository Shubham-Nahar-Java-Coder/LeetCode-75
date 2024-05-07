## Input & Output
Input: root1 = \[1,2,3\]; root2 = \[1,3,2\]
Output: false

## Algorithm

1. Initialize two empty lists, l1 and l2, to store the leaf values of the respective trees.
2. Call the addLeaf function for both root1 and root2, passing the root nodes and their corresponding lists (l1 and l2).
3. In the addLeaf function:
    - If the current node is null, return.
    - If the current node has no children (i.e., it's a leaf node), add its value to the list.
    - Recursively call addLeaf for the left and right children of the current node.
4. After populating the leaf value lists l1 and l2, check if they have the same size.
    - If not, return false as the trees cannot be leaf-similar.
5. Iterate through both lists simultaneously:
    - If any corresponding leaf values are not equal, return false.
    - If all leaf values are equal, return true.

## Time Complexity - O(n)

- Traversal: Both addLeaf functions perform a depth-first traversal of the binary trees. In the worst-case scenario, they visit each node once.
- Comparison: After constructing the leaf value lists l1 and l2, the code iterates through both lists once to compare their elements.
- So, the overall time complexity is O(n).

## Space Complexity - O(n)

- Recursive Call Stack: The addLeaf function is implemented recursively. Each recursive call consumes space on the call stack. The maximum depth of the call stack is determined by the height of the binary tree.
- Leaf Value Lists: Two lists, l1 and l2, are used to store leaf values from the respective binary trees.
- So, the overall space complexity is O(n).

## Take Away From the Problem:

### Depth First Traversal:
- This traversal technique allows us to visit all nodes in the tree, starting from the root and exploring as far as possible along each branch before backtracking.

**Depth-first traversal is essential for various tree-related algorithms, including searching, insertion, deletion, and traversal-based operations.**

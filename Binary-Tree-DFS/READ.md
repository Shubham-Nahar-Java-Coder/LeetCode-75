# LeetCode-75

This repository contains Binary Tree DFS problems categorized into two levels: Easy and Medium.

## Easy: 
1. [Maximum Depth of Binary Tree](https://github.com/Shubham-Nahar-Java-Coder/Leetcode-75/tree/master/Binary-Tree-DFS/Maximum-Depth-of-Binary-Tree)
2. Leaf-Similar Trees
 
## Medium: 
1. Count Good Nodes in Binary Tree
2. Path Sum III
3. Longest ZigZag Path in a Binary Tree
4. Lowest Common Ancestor of a Binary Tree


## Notes:

I've prepared some notes on Binary Tree and DFS. It's beneficial to review them before diving into the problem statements and solutions. This understanding will facilitate easier issue resolution and clearer comprehension.

## Binary Tree:

- A binary tree is a **hierarchical data structure** composed of **nodes**, where each node has at most two children, referred to as the **left child** and the **right child**.

- **Node Structure:** Each node in a binary tree consists of three components:
    - **Data:** Holds the value associated with the node.
    - **Left Child Pointer:** Points to the left child node, or NULL if there's no left child.
    - **Right Child Pointer:** Points to the right child node, or NULL if there's no right child.

- **Root Node:** The topmost node in a binary tree is called the root node.

- Types of Binary Trees:
    - **Full Binary Tree:** Every node in the tree has either 0 or 2 children.
    - **Complete Binary Tree:** All levels of the tree are completely filled except possibly for the last level, which is filled from left to right.
    - **Perfect Binary Tree:** A binary tree in which all internal nodes have exactly two children, and all leaf nodes are at the same level.
    - **Balanced Binary Tree:** A binary tree in which the height of the left and right subtrees of any node differ by at most one.

- Traversal Techniques: 
    - **Pre-order Traversal:** Visit the current node, then recursively visit the left subtree, and finally recursively visit the right subtree.
    - **In-order Traversal:** Recursively visit the left subtree, visit the current node, and finally recursively visit the right subtree.
    - **Post-order Traversal:** Recursively visit the left subtree, recursively visit the right subtree, and finally visit the current node.

**Binary trees are used in many applications, including expression evaluation, representing hierarchical data structures like file systems, binary search trees for efficient searching, and more.**

## Depth First Search \[DFS\]:

- DFS is a **tree traversal algorithm** used to explore deeper into a tree structure before backtracking. In binary trees, DFS **starts at the root node and explores as far as possible along each branch** before backtracking.

- There are three main types of DFS traversal: 
    - **Pre-order:** Visit the root node first, then recursively do a pre-order traversal of the left subtree followed by the right subtree.
    - **In-order:** Recursively do an in-order traversal of the left subtree, visit the root node, and finally do an in-order traversal of the right subtree.
    - **Post-order:** Recursively do a post-order traversal of the left subtree, then the right subtree, and finally visit the root node.

**DFS is commonly used for various tree-related problems such as finding paths, searching for elements, determining connectivity, and solving puzzles like mazes.**


### Useful Methods:
1. arrayName.length;
    - It gives us the length of the array

2. System.arraycopy(SourceArrayName, SourcePositon, DestinationArrayName, DestinationPosition, length);
    - This copies elements from one array to another at specified positions.

3. Arrays.sort(arrayName);
    - Sorts the elements of the array in ascending order.

4. Arrays.binarySearch(arrayName, element-to-search);
    - Seaches for the specified element in the sorted array using Binary Search.

5. Arrays.equals(arrayName1, arrayName2);
    - Compares 2 arrays if they are equal

6. Arrays.fill(arrayName, value-to-fill);
    - Assigns the specified value to each element of the array

7. Arrays.toString(arrayName);
    - Returns the String represntation of the Array.

8. Arrays.parallelSort(arrayName);
    - Sorts the elements of the array in parallel for improved performance with large arrays on multi-core CPU.

All of these methods are part of **java.until.Arrays**.

## Strings:
- represent a Sequence of Characters.

### Declaration and Initialization:
1. String str = "hello";
2. String str = new String("Hello");

**Note**: When we use the **new** keyword to create a String object, Java explicitly creates a new string in the heap memory. But, when we create a String using **String Literal** java automatically handles by reusing the existing instance instead of creating a new one.

### Useful Methods/Functions in Binary Tree/DFS:

| Method | Definition | Usage Example |
| -------- | -------- | -------- |
| Binary Tree Insertion  | Insert a new node into the binary tree while maintaining the binary search tree property   | binaryTree.insert(5);  |
| Binary Tree Deletion  | Delete a node from the binary tree while preserving the tree's integrity and structure.   | binaryTree.delete(3);  |
| Binary Tree Search | Search for a specific value or node within the binary tree.   | TreeNode node = binaryTree.search(7); |
| Binary Tree Height/Depth  | Calculate the height or depth of the binary tree.   | int height = binaryTree.getHeight(); |
| Binary Tree Size | Count the number of nodes in the binary tree.   | int size = binaryTree.getSize(); |

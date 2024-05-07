import java.util.LinkedList;
import java.util.Queue;

class MaximumDepthOfBinaryTree {
  public static int maxDepth(TreeNode root) {
    // If the root is null, the depth is 0
    if (root == null) {
      return 0;
    }
    // Queue to perform level-order traversal
    Queue<TreeNode> elementQueue = new LinkedList<>();
    // Add the root node to the queue
    elementQueue.add(root);
    // Initialize the number of levels to 0
    int numberOfLevels = 0;

    // Loop until all nodes are processed
    while (true) {
      // Get the number of nodes at the current level
      int nodeCountAtLevel = elementQueue.size();
      // If there are no nodes at the current level, return the number of levels
      if (nodeCountAtLevel == 0) {
        return numberOfLevels;
      }
      // Process all nodes at the current level
      while (nodeCountAtLevel > 0) {
        // Remove the current node from the queue
        TreeNode element = elementQueue.poll();

        // Add left child to the queue if it exists
        if (element.left != null) {
          elementQueue.offer(element.left);
        }
        // Add right child to the queue if it exists
        if (element.right != null) {
          elementQueue.offer(element.right);
        }
        // Decrement the node count at the current level
        nodeCountAtLevel--;
      }
      // Increment the number of levels after processing all nodes at the current
      // level
      numberOfLevels++;
    }
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.left.right = new TreeNode(15);
    root.right.right = new TreeNode(7);

    System.out.println(maxDepth(root));
  }
}

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  public TreeNode() {
  }

  public TreeNode(int val) {
    this.val = val;
  }

  public TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

}
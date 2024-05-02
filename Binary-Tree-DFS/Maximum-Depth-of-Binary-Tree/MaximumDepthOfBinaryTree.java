import java.util.LinkedList;
import java.util.Queue;

class MaximumDepthOfBinaryTree {
  public static int maxDepth(TreeNode root) {

    if (root == null) {
      return 0;
    }

    Queue<TreeNode> elementQueue = new LinkedList<>();

    elementQueue.add(root);
    int numberOfLevels = 0;

    while (true) {
      int nodeCountAtLevel = elementQueue.size();
      if (nodeCountAtLevel == 0) {
        return numberOfLevels;
      }
      while (nodeCountAtLevel > 0) {
        TreeNode element = elementQueue.poll();

        if (element.left != null) {
          elementQueue.offer(element.left);
        }
        if (element.right != null) {
          elementQueue.offer(element.right);
        }
        nodeCountAtLevel--;
      }
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
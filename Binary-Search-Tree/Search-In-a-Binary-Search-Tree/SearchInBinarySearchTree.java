class SearchInBinarySearchTree {
    public static TreeNode searchBST(TreeNode root, int val){
      TreeNode curr = root;
      while(curr != null){
        if(curr.val == val){
          return curr;
        }
        if(curr.val > val){
          curr = curr.left;
        }
        else{
          curr = curr.right;
        }
      }
      return curr;
    }
    public static void main(String[] args) {
      TreeNode root = new TreeNode(4);
      root.left = new TreeNode(2);
      root.right = new TreeNode(7);
      root.left.left = new TreeNode(1);
      root.left.right = new TreeNode(3);
  
      TreeNode result = searchBST(root, 2);
      
      if(result != null){
        System.out.print("[");
        printInOrder(result);
        System.out.print("]");
      }
      else{
        System.out.println("[]");
      }
  
    }
  private static void printInOrder(TreeNode result) {
    if(result == null){
      return;
    }
    System.out.print(result.val+ (" "));
    printInOrder(result.left);
    printInOrder(result.right);
  }
    }    
  class TreeNode{
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
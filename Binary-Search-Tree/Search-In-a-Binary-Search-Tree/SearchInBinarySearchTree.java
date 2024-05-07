class SearchInBinarySearchTree {
    public static TreeNode searchBST(TreeNode root, int val) {
        // Start the search from the root node
        TreeNode curr = root;
        // Traverse the tree until the current node is not null
        while (curr != null) {
            // If the current node's value matches the target value, return the current node
            if (curr.val == val) {
                return curr;
            }
            // If the target value is less than the current node's value, move to the left
            // child
            if (curr.val > val) {
                curr = curr.left;
            }
            // If the target value is greater than the current node's value, move to the
            // right child
            else {
                curr = curr.right;
            }
        } // If the target value is not found in the tree, return null
        return curr;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        TreeNode result = searchBST(root, 2);

        if (result != null) {
            System.out.print("[");
            printInOrder(result);
            System.out.print("]");
        } else {
            System.out.println("[]");
        }

    }

    private static void printInOrder(TreeNode result) {
        if (result == null) {
            return;
        }
        System.out.print(result.val + (" "));
        printInOrder(result.left);
        printInOrder(result.right);
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
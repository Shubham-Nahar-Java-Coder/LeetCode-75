import java.util.ArrayList;
import java.util.List;

class LeafSimilarTrees {
    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        // Lists to store leaf node values of the two trees
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        // Populate lists with leaf node values of each tree
        addLeaf(root1, l1);
        addLeaf(root2, l2);

        // Check if the sizes of the lists are different
        if (l1.size() != l2.size()) {
            return false;
        }
        // Check if corresponding leaf values in the lists are equal
        for (int i = 0; i < l1.size(); i++) {
            if (!l1.get(i).equals(l2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static void addLeaf(TreeNode root, List<Integer> list) {
        // If the node is null, return
        if (root == null) {
            return;
        }
        // If the node is a leaf node, add its value to the list
        if (root.left == null && root.right == null) {
            list.add(root.val);
            return;
        }
        // Recursively add leaf node values of left and right subtrees
        addLeaf(root.left, list);
        addLeaf(root.right, list);
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(3);
        root2.right = new TreeNode(2);

        System.out.println(leafSimilar(root1, root2));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }
}
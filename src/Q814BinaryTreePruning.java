public class Q814BinaryTreePruning {
    public TreeNode pruneTree(TreeNode root) {
        if (root == null) return null;
        TreeNode left = pruneTree(root.left);
        TreeNode right = pruneTree(root.right);
        if (left == null) root.left = null;
        if (right == null) root.right = null;
        if (left == null && right == null && root.val == 0) return null;
        return root;
    }
}
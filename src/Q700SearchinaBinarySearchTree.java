public class Q700SearchinaBinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return root;
        if (root.val == val) return root;
        TreeNode left = null;
        TreeNode right = null;
        if (root.val > val) left = searchBST(root.left, val);
        if (root.val < val) right = searchBST(root.right, val);
        if (left != null) return left;
        if (right != null) return right;
        return null;
    }
}
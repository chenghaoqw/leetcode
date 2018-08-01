public class Q543DiameterofBinaryTree {
    int max;

    public int diameterOfBinaryTree(TreeNode root) {
        getDeep(root);

        return max;
    }

    public int getDeep(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = getDeep(root.left) + 1;
        int right = getDeep(root.right) + 1;
        max = Math.max((left + right) - 2, max);

        return Math.max(left, right);
    }
}

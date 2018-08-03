public class Q563BinaryTreeTilt {
    int sum = 0;

    public int findTilt(TreeNode root) {
        get(root);

        return sum;
    }

    public int get(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = get(root.left);
        int right = get(root.right);
        sum += Math.abs(left - right);

        return left + right + root.val;
    }
}

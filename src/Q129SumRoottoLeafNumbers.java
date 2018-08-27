public class Q129SumRoottoLeafNumbers {
    int result = 0;

    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        ref(root, 0);
        return result;
    }

    public void ref(TreeNode root, int sum) {
        if (root.left == null && root.right == null) result += sum * 10 + root.val;
        if (root.left != null) ref(root.left, sum * 10 + root.val);
        if (root.right != null) ref(root.right, sum * 10 + root.val);
    }
}
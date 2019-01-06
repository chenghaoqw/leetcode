public class Q513FindBottomLeftTreeValue {
    int ret = 0;
    int max = 0;

    public int findBottomLeftValue(TreeNode root) {
        ref(root, 0);
        return ret;
    }

    public void ref(TreeNode root, int deep) {
        if (root == null) return;
        if (deep >= max) {
            ret = root.val;
            max = deep;
        }
        ref(root.right, deep + 1);
        ref(root.left, deep + 1);
    }
}
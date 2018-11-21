public class Q337HouseRobberIII {
    public int rob(TreeNode root) {
        if (root == null) return 0;
        return ref(root, false);

    }

    public int ref(TreeNode root, boolean is) {
        if (root == null) return 0;
        int f = ref(root.left, false) + ref(root.right, false);
        if (is) return f;
        else return Math.max(f, ref(root.left, true) + ref(root.right, true) + root.val);
    }
}
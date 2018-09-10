public class Q687LongestUnivaluePath {
    int ans = 0;

    public int longestUnivaluePath(TreeNode root) {
        if (root == null) return 0;
        ref(root);
        return ans - 1;
    }

    public int ref(TreeNode root) {
        if (root == null) return 0;
        int r1 = 0;
        int r2 = 0;
        int left = 0;
        int right = 0;
        left = ref(root.left);
        right = ref(root.right);
        if (root.left != null && root.val == root.left.val) {
            r1 = Math.max(r1, left);
            r2 += left;
        }
        if (root.right != null && root.val == root.right.val) {
            r1 = Math.max(r1, right);
            r2 += right;
        }
        ans = Math.max(ans, r2 + 1);
        return r1 + 1;
    }
}
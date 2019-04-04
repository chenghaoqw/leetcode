public class Q865SmallestSubtreewithalltheDeepestNodes {
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return dfs(root).n;
    }

    public t dfs(TreeNode node) {
        if (node == null) return new t(null, 0);
        t left = dfs(node.left);
        t right = dfs(node.right);
        if (left.d > right.d) return new t(left.n, left.d + 1);
        else if (left.d < right.d) return new t(right.n, right.d + 1);
        else return new t(node, left.d + 1);
    }

    class t {
        TreeNode n;
        int d;

        public t(TreeNode node, int dist) {
            this.n = node;
            this.d = dist;
        }
    }
}
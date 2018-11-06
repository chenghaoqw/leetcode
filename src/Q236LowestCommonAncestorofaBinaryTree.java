public class Q236LowestCommonAncestorofaBinaryTree {
    TreeNode node = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ref(root, p, q);
        return node;
    }

    public int[] ref(TreeNode root, TreeNode p, TreeNode q) {
        int[] ret = new int[2];
        if (root == null) return ret;
        int[] left = ref(root.left, p, q);
        int[] right = ref(root.right, p, q);
        if (left[0] == 1 || right[0] == 1) ret[0] = 1;
        if (left[1] == 1 || right[1] == 1) ret[1] = 1;
        if (root.val == p.val) ret[0] = 1;
        if (root.val == q.val) ret[1] = 1;
        if (ret[0] == 1 && ret[1] == 1) {
            ret[0] = 0;
            ret[1] = 0;
            node = root;
        }
        return ret;
    }
}
public class Q623AddOneRowtoTree {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        return addOneRow(root, v, d, true);
    }

    public TreeNode addOneRow(TreeNode root, int v, int d, boolean isLeft) {
        if (d < 1) return root;
        if (d == 1) {
            TreeNode node = new TreeNode(v);
            if (isLeft) node.left = addOneRow(root, v, d - 1, true);
            else node.right = addOneRow(root, v, d - 1, false);
            return node;
        }
        if (root == null) return root;
        root.left = addOneRow(root.left, v, d - 1, true);
        root.right = addOneRow(root.right, v, d - 1, false);
        return root;
    }
}
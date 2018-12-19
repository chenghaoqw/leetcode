public class Q450DeleteNodeinaBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (root.val == key) {
            if (root.right == null) return root.left;
            else {
                TreeNode cur = root.right;
                while (cur.left != null) cur = cur.left;
                int cval = cur.val;
                cur.val = root.val;
                root.val = cval;
            }
        }
        root.left = deleteNode(root.left, key);
        root.right = deleteNode(root.right, key);
        return root;
    }
}

import javax.swing.tree.TreeNode;

public class Q105ConstructBinaryTreefromPreorderandInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) return null;
        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, preorder.length - 1);
    }

    public TreeNode buildTree(int[] p, int ps, int pe, int[] i, int is, int ie) {
        TreeNode t = new TreeNode(p[ps]);
        if (ps == pe) return t;
        int mid = 0;
        for (int j = 0; j < p.length; j++) {
            if (i[j] == p[ps]) mid = j;
        }
        if (is < mid) t.left = buildTree(p, ps + 1, ps + mid - is, i, is, mid - 1);
        if (mid < ie) t.right = buildTree(p, ps + mid - is + 1, pe, i, mid + 1, ie);
        return t;
    }


    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}

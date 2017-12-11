public class Q106ConstructBinaryTreefromInorderandPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0) return null;
        return buildTree(inorder, 0, inorder.length - 1, postorder, 0, inorder.length - 1);
    }

    public TreeNode buildTree(int[] in, int ins, int ine, int[] post, int postb, int poste) {
        TreeNode t = new TreeNode(post[poste]);
        if (poste == postb) return t;
        int mid = 0;
        for (int i = 0; i < post.length; i++) {
            if (in[i] == post[poste]) {
                mid = i;
            }
        }
        if (ins < mid) t.left = buildTree(in, ins, mid - 1, post, postb, poste - ine + mid - 1);
        if (mid < ine) t.right = buildTree(in, mid + 1, ine, post, poste - ine + mid, poste - 1);
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

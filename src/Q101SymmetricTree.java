public class Q101SymmetricTree {
    public boolean isSymmetric(Q94BinaryTreeInorderTraversal.TreeNode root) {
        return isSymmetric(root,root);
    }

    public boolean isSymmetric(Q94BinaryTreeInorderTraversal.TreeNode r1, Q94BinaryTreeInorderTraversal.TreeNode r2) {
        if(r1==null && r2==null) return true;
        if(r1==null || r2==null) return false;
        if(r1.val!=r2.val) return false;
        return isSymmetric(r1.left,r2.right) && isSymmetric(r1.right,r2.left);
    }
}

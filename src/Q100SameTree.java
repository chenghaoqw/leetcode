public class Q100SameTree {
    public boolean isSameTree(Q94BinaryTreeInorderTraversal.TreeNode p, Q94BinaryTreeInorderTraversal.TreeNode q) {
        if(p==null && q==null) return true;
        if((p==null && q!=null) || (p!=null && q==null)) return false;
        if(p.val!=q.val) return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}

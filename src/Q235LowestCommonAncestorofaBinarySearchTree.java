public class Q235LowestCommonAncestorofaBinarySearchTree {
    public Q105ConstructBinaryTreefromPreorderandInorderTraversal.TreeNode lowestCommonAncestor(Q105ConstructBinaryTreefromPreorderandInorderTraversal.TreeNode root, Q105ConstructBinaryTreefromPreorderandInorderTraversal.TreeNode p, Q105ConstructBinaryTreefromPreorderandInorderTraversal.TreeNode q) {
        if(root==null || p==root || q==root) return root;
        Q105ConstructBinaryTreefromPreorderandInorderTraversal.TreeNode left=lowestCommonAncestor(root.left,p,q);
        Q105ConstructBinaryTreefromPreorderandInorderTraversal.TreeNode right=lowestCommonAncestor(root.right,p,q);
        if(left!=null && right!=null) return root;
        return left!=null ? left :right;
    }
}

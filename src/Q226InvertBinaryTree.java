public class Q226InvertBinaryTree {
    public Q105ConstructBinaryTreefromPreorderandInorderTraversal.TreeNode invertTree(Q105ConstructBinaryTreefromPreorderandInorderTraversal.TreeNode root) {
        if(root==null) return null;
        if(root.left!=null) invertTree(root.left);
        if(root.right!=null) invertTree(root.right);
        Q105ConstructBinaryTreefromPreorderandInorderTraversal.TreeNode t=root.left;
        root.left=root.right;
        root.right=t;
        return root;
    }
}

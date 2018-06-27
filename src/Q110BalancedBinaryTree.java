public class Q110BalancedBinaryTree {
    public boolean isBalanced(Q105ConstructBinaryTreefromPreorderandInorderTraversal.TreeNode root) {
        return depth(root)!=-1;

    }

    int depth(Q105ConstructBinaryTreefromPreorderandInorderTraversal.TreeNode n){
        if(n==null) return 0;
        int left=depth(n.left);
        int right=depth(n.right);
        if(left==-1 || right==-1 || Math.abs(left-right)>1){
            return -1;
        }
        return Math.max(left,right)+1;
    }
}

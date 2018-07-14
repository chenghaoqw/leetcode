public class Q404SumofLeftLeaves {
    int result=0;
    public int sumOfLeftLeaves(Q105ConstructBinaryTreefromPreorderandInorderTraversal.TreeNode root) {
        if(root==null) return 0;
        return sumOfLeftLeaves(root.left,true)+sumOfLeftLeaves(root.right,false);
    }
    public int sumOfLeftLeaves(Q105ConstructBinaryTreefromPreorderandInorderTraversal.TreeNode root, boolean left) {
        if(root==null) return 0;
        int result=0;
        if(root.left!=null) result+=sumOfLeftLeaves(root.left,true);
        if(root.right!=null) result+=sumOfLeftLeaves(root.right,false);
        if(root.left==null && root.right==null && left) return root.val;
        return result;
    }
}

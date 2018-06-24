public class Q104MaximumDepthofBinaryTree {
    public int maxDepth(Q94BinaryTreeInorderTraversal.TreeNode root) {
        if(root==null) return 0;
        return maxDepth(root,1);
    }

    public int maxDepth(Q94BinaryTreeInorderTraversal.TreeNode root, int depth){
        if(root==null) return depth;
        int max=depth;
        if(root.left!=null) max=Math.max(max,maxDepth(root.left,depth+1));
        if(root.right!=null)  max=Math.max(max,maxDepth(root.right,depth+1));
        return max;
    }
}

public class Q606ConstructStringfromBinaryTree {
    public String tree2str(Q106ConstructBinaryTreefromInorderandPostorderTraversal.TreeNode t) {
        String r="";
        if(t==null) return "";
        else r=String.valueOf(t.val);
        if(t.left!=null){
            r+="("+tree2str(t.left)+")";
            if(t.right!=null){
                r+="("+tree2str(t.right)+")";
            }
        }else{
            if(t.right!=null) r+="()"+"("+tree2str(t.right)+")";
        }
        return r;
    }
}

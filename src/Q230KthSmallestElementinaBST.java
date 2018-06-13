import java.util.Stack;

public class Q230KthSmallestElementinaBST {
    public int kthSmallest(Q94BinaryTreeInorderTraversal.TreeNode root, int k) {
        Stack<Q94BinaryTreeInorderTraversal.TreeNode> s=new Stack();
        s.add(root);
        while(!s.empty()){
            Q94BinaryTreeInorderTraversal.TreeNode cur=s.peek();
            if(cur.left!=null) {
                s.push(cur.left);
                cur.left=null;
            }else{
                cur=s.pop();
                k--;
                if(k==0) return cur.val;
                if(cur.right!=null) s.push(cur.right);
            }
        }
        return 0;
    }
}

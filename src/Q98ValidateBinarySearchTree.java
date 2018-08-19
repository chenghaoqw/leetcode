import java.util.ArrayList;
import java.util.List;

public class Q98ValidateBinarySearchTree {
    List<Integer> list=new ArrayList();
    public boolean isValidBST(TreeNode root) {
        ref(root);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i+1)<=list.get(i)) return false;
        }
        return true;
    }

    public void ref(TreeNode root){
        if(root==null) return;
        ref(root.left);
        list.add(root.val);
        ref(root.right);
    }
}

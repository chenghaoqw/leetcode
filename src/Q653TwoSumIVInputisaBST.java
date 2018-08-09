import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q653TwoSumIVInputisaBST {
    List<Integer> list=new ArrayList();
    public boolean findTarget(TreeNode root, int k) {
        ref(root);
        Collections.sort(list);
        int i=0,j=list.size()-1;
        while(j>i){
            if(list.get(i)+list.get(j)==k) return true;
            else if(list.get(i)+list.get(j)>k) j--;
            else i++;
        }
        return false;
    }

    public void ref(TreeNode root){
        if(root==null) return;
        list.add(root.val);
        ref(root.left);
        ref(root.right);
    }
}
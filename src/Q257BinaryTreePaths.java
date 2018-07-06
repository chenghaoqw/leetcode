import java.util.ArrayList;
import java.util.List;

public class Q257BinaryTreePaths {
    public List<String> binaryTreePaths(Q105ConstructBinaryTreefromPreorderandInorderTraversal.TreeNode root) {
        List<String> list=new ArrayList<>();
        if(root==null) return list;
        if(root.left==null && root.right==null){
            list.add(root.val+"");
            return list;
        }
        if(root.left!=null){
            List<String> l=binaryTreePaths(root.left);
            for(int i=0;i<l.size();i++){
                list.add(root.val+"->"+l.get(i));
            }
        }
        if(root.right!=null){
            List<String> l=binaryTreePaths(root.right);
            for(int i=0;i<l.size();i++){
                list.add(root.val+"->"+l.get(i));
            }
        }
        return list;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Q107BinaryTreeLevelOrderTraversalII {
    List<List<Integer>> r = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrderBottom(Q94BinaryTreeInorderTraversal.TreeNode root) {
        levelOrderBottom(root,0);
        return r;
    }

    void levelOrderBottom(Q94BinaryTreeInorderTraversal.TreeNode root, int level){
        if(root==null) return;
        List<Integer> list;
        if(level==r.size()){
            list=new ArrayList<>();
            r.add(0,list);
        }else list=r.get(r.size()-level-1);
        list.add(root.val);
        levelOrderBottom(root.left,level+1);
        levelOrderBottom(root.right,level+1);
    }
}

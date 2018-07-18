import java.util.ArrayList;
import java.util.List;

public class Q437PathSumIII {
    public int pathSum(TreeNode root, int sum) {
        return pathSum(root,sum,new ArrayList<Integer>());
    }

    public int pathSum(TreeNode root, int sum, List<Integer> list) {
        if(root==null) return 0;
        int result=0;
        list.add(0);
        for(int i=0;i<list.size();i++){
            list.set(i,list.get(i)+root.val);
            if(list.get(i)==sum) result+=1;
        }
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        list1.addAll(list);
        list2.addAll(list);
        result+=pathSum(root.left,sum,list1);
        result+=pathSum(root.right,sum,list2);
        return result;
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q78Subsets {
    List<List<Integer>> result=new ArrayList<List<Integer>>();
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        result.add(new ArrayList<Integer>());
        rfs(nums,new ArrayList<Integer>(),-1);
        return result;
    }

    public void rfs(int[] nums,List<Integer> l1,int r){
        for(int i=r+1;i<nums.length;i++){
            List<Integer> l=new ArrayList<Integer>();
            l.addAll(l1);
            l.add(nums[i]);
            result.add(l);
            rfs(nums,l,i);
        }
    }
}

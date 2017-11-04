import java.util.HashMap;

public class Q217ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> d=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(d.containsKey(nums[i])){
                return true;
            }else{
                d.put(nums[i],1);
            }
        }
        return false;
    }
}

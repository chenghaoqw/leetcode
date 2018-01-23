import java.util.HashMap;

public class Q594LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        int r=0;
        HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(!data.containsKey(nums[i])) data.put(nums[i],1);
            else data.put(nums[i],data.get(nums[i])+1);
        }
        for(int i:data.keySet()){
            if(data.containsKey(i+1)) r=Math.max(r,data.get(i)+data.get(i+1));
        }
        return r;
    }
}

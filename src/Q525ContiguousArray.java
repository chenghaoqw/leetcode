import java.util.HashMap;

public class Q525ContiguousArray {
    public int findMaxLength(int[] nums){
        int l=nums.length;
        int r=0;
        if(l<0) return 0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap();
        map.put(0,0);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) count++;
            else count--;
            if(map.containsKey(count)) r=Math.max(r,i+1-map.get(count));
            else map.put(count,i+1);
        }
        return r;
    }
}

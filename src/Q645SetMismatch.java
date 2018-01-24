import java.util.HashMap;

public class Q645SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int[] r=new int[2];
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])) r[0]=nums[i];
            else map.put(nums[i],1);
        }
        for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(i)) r[1]=i;
        }
        return r;
    }
}

import java.util.HashMap;
import java.util.Map;

public class Q532KdiffPairsinanArray {
    public int findPairs(int[] nums, int k) {
        if(nums==null || nums.length ==0 || k<0) return 0;
        int r=0;
        int l=nums.length;
        HashMap<Integer,Integer> d=new HashMap<>();
        for(int i=0;i<l;i++){
            if(d.containsKey(nums[i])){
                d.put(nums[i],d.get(nums[i])+1);
            }else{
                d.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> e:d.entrySet()){
            if(k==0){
                if(e.getValue()>1){
                    r++;
                }
            }else{
                if(d.containsKey(e.getKey()+k)){
                    r++;
                }
            }
        }
        return r;
    }
}

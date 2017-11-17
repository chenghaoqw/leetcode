import java.util.Collections;
import java.util.HashMap;

public class Q697DegreeofanArray {
    public int findShortestSubArray(int[] nums) {
        int l=nums.length;
        HashMap<Integer,Integer> d=new HashMap();
        HashMap<Integer,Integer> left=new HashMap();
        HashMap<Integer,Integer> right=new HashMap();
        for(int i=0;i<l;i++){
            int j=nums[i];
            if(!left.containsKey(j)) left.put(j,i);
            right.put(j,i);
            d.put(j,d.getOrDefault(j,0)+1);
        }
        int r=l;
        int t= Collections.max(d.values());
        for(int x:d.keySet()){
            if(d.get(x)==t){
                r=Math.min(r,right.get(x) - left.get(x) +1);
            }
        }
        return r;
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q368LargestDivisibleSubset {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> result=new ArrayList<>();
        if(nums.length==0) return result;
        Arrays.sort(nums);
        int[] r=new int[nums.length];
        int max=0;
        int index=0;
        HashMap<Integer,Integer> map=new HashMap();
        for(int i=0;i<nums.length;i++) r[i]=1;
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i==j) continue;
                if(nums[i] % nums[j] ==0){
                    if(r[j]+1>r[i]){
                        r[i]=r[j]+1;
                        map.put(i,j);
                    }
                    if(r[i]>max){
                        index=i;
                        max=r[i];
                    }
                }
            }
        }
        result.add(nums[index]);
        while(map.containsKey(index)){
            index=map.get(index);
            result.add(nums[index]);
        }
        return result;
    }
}

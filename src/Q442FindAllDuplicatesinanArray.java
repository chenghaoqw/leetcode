import java.util.ArrayList;
import java.util.List;

public class Q442FindAllDuplicatesinanArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> data=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[Math.abs(nums[i])-1]<0) data.add(Math.abs(nums[i]));
            nums[Math.abs(nums[i])-1]=-nums[Math.abs(nums[i])-1];
        }
        return data;
    }
}

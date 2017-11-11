import java.util.Arrays;

public class Q561ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        int r=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i=i+2){
            r+=nums[i];
        }
        return r;
    }
}

import java.util.Arrays;

public class Q453MinimumMovestoEqualArrayElements {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int min=nums[0];
        int sum=0;
        for(int i=1;i<nums.length;i++) sum=sum+nums[i]-min;
        return sum;
    }
}

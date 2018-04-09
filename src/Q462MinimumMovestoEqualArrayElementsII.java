import java.util.Arrays;

public class Q462MinimumMovestoEqualArrayElementsII {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1,r=0;
        while(i<j){
            r+=nums[j--]-nums[i++];
        }
        return r;
    }
}

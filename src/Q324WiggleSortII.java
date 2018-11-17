import java.util.Arrays;

public class Q324WiggleSortII {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int[] ret = new int[nums.length];
        if (nums.length <= 2) return;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) ret[i] = nums[(nums.length + 1) / 2 - i / 2 - 1];
            else ret[i] = nums[nums.length - 1 - i / 2];
        }
        for (int i = 0; i < nums.length; i++) nums[i] = ret[i];
    }
}
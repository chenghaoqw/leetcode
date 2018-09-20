import java.util.Arrays;

public class Q747LargestNumberAtLeastTwiceofOthers {
    public int dominantIndex(int[] nums) {
        int l = nums.length;
        if (l == 0) return -1;
        if (l <= 1) return 0;
        int[] nums1 = new int[l];
        for (int i = 0; i < l; i++) {
            nums1[i] = nums[i];
        }
        Arrays.sort(nums1);
        if (nums1[l - 1] / 2 < nums1[l - 2]) return -1;
        for (int i = 0; i < l; i++) {
            if (nums1[l - 1] == nums[i])
                return i;
        }
        return -1;
    }
}
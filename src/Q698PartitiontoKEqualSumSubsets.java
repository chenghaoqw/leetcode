import java.util.Arrays;

public class Q698PartitiontoKEqualSumSubsets {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = Arrays.stream(nums).sum();
        if (sum % k != 0) return false;
        int target = sum / k;
        Arrays.sort(nums);
        int row = nums.length - 1;
        if (nums[row] > target) return false;
        while (nums[row] == target) {
            row--;
            k--;
        }
        return helper(nums, row, target, new int[k]);
    }

    public boolean helper(int[] nums, int row, int target, int[] groups) {
        if (row < 0) return true;
        int v = nums[row--];
        for (int i = 0; i < groups.length; i++) {
            if (groups[i] + v <= target) {
                groups[i] += v;
                if (helper(nums, row, target, groups)) return true;
                groups[i] -= v;
            }
            if (groups[i] == 0) break;
        }
        return false;
    }
}
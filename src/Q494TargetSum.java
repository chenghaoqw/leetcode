public class Q494TargetSum {
    public int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        for (int i : nums) sum += i;
        if (S > sum || S < -sum || nums.length == 0) return 0;
        int dp[] = new int[2 * sum + 1];
        dp[sum] = 1;
        for (int i = 0; i < nums.length; i++) {
            int dp1[] = new int[2 * sum + 1];
            for (int j = 0; j < 2 * sum + 1; j++) {
                if (dp[j] > 0) {
                    dp1[j + nums[i]] += dp[j];
                    dp1[j - nums[i]] += dp[j];
                }
            }
            dp = dp1;
        }
        return dp[sum + S];
    }
}
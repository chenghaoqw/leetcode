public class Q486PredicttheWinner {
    public boolean PredictTheWinner(int[] nums) {
        int l = nums.length;
        int dp[][] = new int[l][l];
        for (int i = l - 2; i >= 0; --i) {
            for (int j = i + 1; j < l; j++) {
                dp[i][j] = Math.max(nums[j] - dp[i][j - 1], nums[i] - dp[i + 1][j]);
            }
        }
        return dp[0][l - 1] >= 0;
    }
}
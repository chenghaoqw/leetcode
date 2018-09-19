public class Q746MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int l = cost.length;
        int[] dp = new int[l + 2];
        if (l == 1) return cost[0];
        dp[1] = 0;
        dp[2] = 0;
        for (int i = 3; i <= l + 1; i++) {
            dp[i] = dp[i - 1] + cost[i - 2];
            dp[i] = Math.min(dp[i], dp[i - 2] + cost[i - 3]);
        }
        return dp[l + 1];
    }
}
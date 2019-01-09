public class Q518CoinChange2 {
    public int change(int amount, int[] coins) {
        int dp[] = new int[amount + 1];
        dp[0] = 1;
        for (int j : coins) {
            for (int i = 1; i <= amount; i++) {
                if (i >= j) dp[i] += dp[i - j];
            }
        }
        return dp[amount];
    }
}
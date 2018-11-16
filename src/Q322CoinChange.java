public class Q322CoinChange {
    public int coinChange(int[] coins, int amount) {
        int l = coins.length;
        int dp[] = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            int min = amount + 1;
            for (int j = 0; j < l; j++) {
                if (i == coins[j]) {
                    min = 1;
                    break;
                } else if (i > coins[j]) {
                    min = Math.min(min, dp[i - coins[j]] + 1);
                }
            }
            dp[i] = min;
        }
        return dp[amount] <= amount ? dp[amount] : -1;
    }
}
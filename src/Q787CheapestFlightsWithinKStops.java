public class Q787CheapestFlightsWithinKStops {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        int dp[][] = new int[K + 2][101];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) dp[i][j] = 1000000000;
        }
        dp[0][src] = 0;
        for (int i = 1; i <= 1 + K; i++) {
            dp[i][src] = 0;
            for (int[] flight : flights) {
                dp[i][flight[1]] = Math.min(dp[i][flight[1]], dp[i - 1][flight[0]] + flight[2]);
            }
        }
        return dp[K + 1][dst] >= 1000000000 ? -1 : dp[K + 1][dst];
    }
}
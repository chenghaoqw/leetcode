public class Q375GuessNumberHigherorLowerII {
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n + 2][n + 2];
        return ref(dp, 1, n);
    }

    public int ref(int[][] dp, int left, int right) {
        if (left >= right) return 0;
        if (dp[left][right] != 0) return dp[left][right];
        int result = Integer.MAX_VALUE;
        for (int i = left; i <= right; i++) {
            result = Math.min(Math.max(ref(dp, left, i - 1), ref(dp, i + 1, right)) + i, result);
        }
        dp[left][right] = result;
        return dp[left][right];
    }
}
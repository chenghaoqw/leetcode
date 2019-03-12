public class Q808SoupServings {
    public double soupServings(int N) {
        N = N / 25 + (N % 25 > 0 ? 1 : 0);
        if (N >= 500) return 1.0;
        double[][] dp = new double[N + 1][N + 1];
        for (int i = 0; i <= N; ++i) {
            for (int j = 0; j <= N; ++j) {
                double ans = 0.0;
                if (i == 0) ans = 1.0;
                if (i == 0 && j == 0) ans = 0.5;
                if (i > 0 && j > 0) {
                    ans = 0.25 * (dp[m(i - 4)][j] + dp[m(i - 3)][m(j - 1)] +
                            dp[m(i - 2)][m(j - 2)] + dp[m(i - 1)][m(j - 3)]);
                }
                dp[i][j] = ans;
            }
        }
        return dp[N][N];
    }

    public int m(int x) {
        return Math.max(0, x);
    }
}
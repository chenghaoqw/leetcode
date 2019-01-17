public class Q576OutofBoundaryPaths {
    public int findPaths(int m, int n, int N, int x, int y) {
        if (m <= 0 || n <= 0) return 0;
        int mod = 1000000000 + 7;
        int dp[][] = new int[m][n];
        int count = 0;
        dp[x][y] = 1;
        for (int moves = 0; moves < N; moves++) {
            int[][] t = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0) count = (dp[i][j] + count) % mod;
                    if (i == m - 1) count = (dp[i][j] + count) % mod;
                    if (j == 0) count = (dp[i][j] + count) % mod;
                    if (j == n - 1) count = (dp[i][j] + count) % mod;
                    int cur = i > 0 ? dp[i - 1][j] : 0;
                    cur = cur % mod;
                    cur += i < m - 1 ? dp[i + 1][j] : 0;
                    cur = cur % mod;
                    cur += j > 0 ? dp[i][j - 1] : 0;
                    cur = cur % mod;
                    cur += j < n - 1 ? dp[i][j + 1] : 0;
                    t[i][j] = cur % mod;
                }
            }
            dp = t;
        }
        return count;
    }
}
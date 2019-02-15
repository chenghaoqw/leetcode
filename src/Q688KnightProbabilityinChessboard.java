public class Q688KnightProbabilityinChessboard {
    public double knightProbability(int N, int K, int r, int c) {
        double[][] dp = new double[N][N];
        int[] dr = new int[]{2, 2, 1, 1, -1, -1, -2, -2};
        int[] dc = new int[]{1, -1, 2, -2, 2, -2, 1, -1};
        dp[r][c] = 1;
        for (; K > 0; K--) {
            double[][] dp2 = new double[N][N];
            for (r = 0; r < N; r++) {
                for (c = 0; c < N; c++) {
                    for (int i = 0; i < 8; i++) {
                        int nr = r + dr[i];
                        int nc = c + dc[i];
                        if (0 <= nr && nr < N && 0 <= nc && nc < N) {
                            dp2[nr][nc] += dp[r][c] / 8.0;
                        }
                    }
                }
            }
            dp = dp2;
        }
        double ans = 0.0;
        for (double[] row : dp) {
            for (double x : row) ans += x;
        }
        return ans;
    }
}
public class Q813LargestSumofAverages {
    public double largestSumOfAverages(int[] A, int K) {
        int l = A.length;
        double[] sum = new double[l + 1];
        for (int i = 1; i <= l; i++)
            sum[i] = sum[i - 1] + (double) A[i - 1];
        double[][] dp = new double[K + 1][l + 1];
        for (int k = 1; k <= K; k++) {
            for (int i = 1; i <= l; i++) {
                for (int j = 0; j < i; j++) {
                    if (k == 1 && j != 0) continue;
                    dp[k][i] = Math.max(dp[k][i], dp[k - 1][j] + (sum[i] - sum[j]) / (double) (i - j));
                }
            }
        }
        return dp[K][l];
    }
}
public class Q845LongestMountaininArray {
    public int longestMountain(int[] A) {
        if (A.length < 3) return 0;
        int l = A.length;
        int[] dp = new int[l];
        int ret = 0;
        dp[0] = -1;
        for (int i = 1; i < l; i++) {
            if (A[i] < A[i - 1]) {
                if (dp[i - 1] > 0) dp[i] = dp[i - 1] + 1;
                else if (dp[i - 1] < -1) dp[i] = -dp[i - 1] + 1;
                else dp[i] = -1;
            } else if (A[i] > A[i - 1]) {
                if (dp[i - 1] > 0) dp[i] = -2;
                else if (dp[i - 1] < 0) dp[i] = dp[i - 1] - 1;
            } else {
                dp[i] = -1;
            }
            System.out.printf(dp[i] + "");
            ret = Math.max(ret, dp[i]);
        }
        return ret >= 3 ? ret : 0;
    }
}
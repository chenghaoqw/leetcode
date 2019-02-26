import java.util.TreeSet;

public class Q764LargestPlusSign {
    public int orderOfLargestPlusSign(int N, int[][] mines) {
        int ret = 0;
        int[][] dp = new int[N][N];
        TreeSet<Integer> set = new TreeSet();
        for (int[] a : mines) {
            set.add(a[0] * N + a[1]);
        }
        for (int j = 0; j < N; j++) {
            int cnt = 0;
            for (int i = 0; i < N; i++) {
                cnt = set.contains(i * N + j) ? 0 : cnt + 1;
                dp[i][j] = cnt;
            }
            cnt = 0;
            for (int i = N - 1; i >= 0; i--) {
                cnt = set.contains(i * N + j) ? 0 : cnt + 1;
                dp[i][j] = Math.min(dp[i][j], cnt);
            }
        }
        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                cnt = set.contains(i * N + j) ? 0 : cnt + 1;
                dp[i][j] = Math.min(dp[i][j], cnt);
            }
            cnt = 0;
            for (int j = N - 1; j >= 0; j--) {
                cnt = set.contains(i * N + j) ? 0 : cnt + 1;
                dp[i][j] = Math.min(dp[i][j], cnt);
                ret = Math.max(ret, dp[i][j]);
            }
        }
        return ret;
    }
}
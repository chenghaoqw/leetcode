public class Q790DominoandTrominoTiling {
    public int numTilings(int N) {
        long dp[] = new long[N + 1];
        if (N <= 0) return 0;
        if (N == 1) return 1;
        if (N == 2) return 2;
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        long M = 1000000007;
        for (int i = 3; i <= N; i++) {
            dp[i] = (dp[i - 1] * 2 + dp[i - 3]) % M;
        }
        return (int) dp[N];
    }
}
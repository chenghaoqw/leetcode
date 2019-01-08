public class Q516LongestPalindromicSubsequence {
    public int longestPalindromeSubseq(String s) {
        String reverse = new StringBuilder(s).reverse().toString();
        char[] a1 = s.toCharArray();
        char[] a2 = reverse.toCharArray();
        int dp[][] = new int[a1.length + 1][a1.length + 1];
        for (int i = 1; i <= a1.length; i++) {
            for (int j = 1; j <= a2.length; j++) {
                if (a1[i - 1] == a2[j - 1]) dp[i][j] = Math.max(dp[i - 1][j - 1] + 1, dp[i][j]);
                else {
                    dp[i][j] = Math.max(dp[i][j], Math.max(dp[i - 1][j], dp[i][j - 1]));
                }
            }
        }
        return dp[a1.length][a1.length];
    }
}
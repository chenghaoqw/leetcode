public class Q279PerfectSquares {
    public int numSquares(int n) {
        int[] dp=new int[n+1];
        for(int i=0;i<=n;i++){
            for(int j=1;i+ j* j<=n;j++){
                if(dp[i+j*j]==0) dp[i+j*j]=dp[i]+1;
                else dp[i+j*j]=Math.min(dp[i]+1,dp[i+j*j]);
            }
        }
        return dp[n];
    }
}

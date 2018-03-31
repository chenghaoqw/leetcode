public class Q343IntegerBreak {
    public int integerBreak(int n) {
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=1;i<=n;i++){
            for(int j=1;i+j<=n;j++){
                dp[i+j]=Math.max(dp[i+j],Math.max(dp[i],i)*j);
            }
        }
        return dp[n];
    }
}

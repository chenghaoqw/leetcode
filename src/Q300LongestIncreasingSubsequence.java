public class Q300LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        if(nums.length<1) return 0;
        int r=1;
        int dp[]=new int[nums.length];
        dp[0]=1;
        for(int i=1;i<nums.length;i++){
            int val=0;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    val=Math.max(val,dp[j]);
                }
            }
            dp[i]=val+1;
            r=Math.max(dp[i],r);
        }
        return r;
    }
}

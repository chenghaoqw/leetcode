public class Q674LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        int l=nums.length;
        if(l<1){
            return 0;
        }
        int r1=1;
        int r2=1;
        int temp=nums[0];
        for(int i=1;i<l;i++){
            if(nums[i] > temp){
                r1++;
            }else{
                r2=Math.max(r1,r2);
                r1=1;
            }
            temp=nums[i];
        }
        r2=Math.max(r1,r2);
        return r2;
    }
}

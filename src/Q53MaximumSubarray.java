public class Q53MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int n=nums[0];
        int m=nums[0];
        for(int i=1;i<nums.length;i++){
            if(m<0){
                m=0;
            }
            m+=nums[i];
            if(n<m){
                n=m;
            }
        }
        return n;
    }
}

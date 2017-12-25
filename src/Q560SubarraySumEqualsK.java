public class Q560SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int r=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k) r+=1;
            }
        }
        return r;
    }
}

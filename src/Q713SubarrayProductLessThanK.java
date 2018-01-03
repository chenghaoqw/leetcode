public class Q713SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int left=0,sum=1,result=0;
        for(int right=0;right<nums.length;right++){
            sum *= nums[right];
            while(sum>=k) sum/=nums[left++];
            result=result+right -left+1;
        }
        return result;
    }
}

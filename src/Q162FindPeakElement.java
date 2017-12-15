public class Q162FindPeakElement {
    public int findPeakElement(int[] nums) {
        int l=nums.length;
        if(l==0 || l==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[l-1]>nums[l-2]) return l-1;
        for(int i=1;i<l-1;i++){
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1]) return i;
        }
        return 0;
    }
}

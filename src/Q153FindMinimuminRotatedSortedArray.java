public class Q153FindMinimuminRotatedSortedArray {
    private int r=0;
    public int findMin(int[] nums) {
        ref(nums,0,nums.length-1);
        return r;
    }

    public void ref(int[] nums,int b,int e){
        if(b==e) {
            r=nums[b];
            return;
        }else if(b==e-1){
            r=Math.min(nums[b],nums[e]);
            return;
        }
        int mid=(e+b)/2;
        if(nums[mid]>nums[e]) ref(nums,mid,e);
        else if(nums[mid] <nums[e]) ref(nums,b,mid);
    }
}

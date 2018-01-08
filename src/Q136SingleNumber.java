public class Q136SingleNumber {
    public int singleNumber(int[] nums) {
        int l=nums.length;
        if(l<=0) return 0;
        int r=nums[0];
        for(int i=1;i<l;i++){
            r^=nums[i];
        }
        return r;
    }
}

public class Q238ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int isZero=0;
        int sum=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                isZero++;
                continue;
            }
            sum*=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(isZero==0) nums[i]=sum/nums[i];
            else if(isZero==1){
                if(nums[i]==0) nums[i]=sum;
                else nums[i]=0;
            }else{
                nums[i]=0;
            }
        }
        return nums;
    }
}

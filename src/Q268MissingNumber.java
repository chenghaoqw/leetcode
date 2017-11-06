public class Q268MissingNumber {
    public int missingNumber(int[] nums) {
        int l=nums.length;
        int sum=0;
        for(int i=0;i<l;i++){
            sum+=nums[i];
        }
        int total=(0+l)*(l+1)/2;
        return total-sum;
    }
}

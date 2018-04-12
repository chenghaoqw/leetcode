public class Q553OptimalDivision {
    public String optimalDivision(int[] nums) {
        if(nums.length<1) return "";
        if(nums.length<2) return nums[0]+"";
        if(nums.length==2) return nums[0]+"/"+nums[1];
        String r=nums[0]+"/(";
        for(int i=1;i<nums.length-1;i++){
            r+=nums[i]+"/";
        }
        return r+nums[nums.length-1]+")";
    }
}

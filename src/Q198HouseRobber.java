public class Q198HouseRobber {
    public int rob(int[] nums) {
        int l=nums.length;
        int[] r=new int[l+2];
        for(int i=0;i<l;i++){
            r[i+2]=Math.max(r[i]+nums[i],r[i+1]);
        }
        return r[l+1];
    }
}

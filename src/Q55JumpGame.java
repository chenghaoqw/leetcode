public class Q55JumpGame {
    public boolean canJump(int[] nums) {
        int l=nums.length;
        if(l==0){
            return true;
        }
        int m=nums[0];
        for(int i=0;i<=m;i++){
            m=Math.max(m,i+nums[i]);
            if(m>=l-1){
                return true;
            }
        }
        return false;
    }
}

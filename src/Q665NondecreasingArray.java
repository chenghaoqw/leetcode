public class Q665NondecreasingArray {
    public boolean checkPossibility(int[] nums) {;
        int l=nums.length;
        if(l<=1){
            return true;
        }
        int time=0;
        int m1=Integer.MIN_VALUE;
        int m2=nums[0];
        for(int i=1;i<l;i++){
            if(nums[i]>=m2){
                m1=m2;
                m2=nums[i];
            }else{
                if(nums[i] >m1){
                    m1=nums[i];
                }else{
                    m1=m2;
                }
                m2=m1;
                time++;
                if(time >1){
                    return false;
                }
            }
        }
        return true;
    }
}

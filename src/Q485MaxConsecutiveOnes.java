public class Q485MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        boolean s=false;
        int r=0;
        int r1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                if(!s){
                    r=1;
                }else{
                    r++;
                }
                s=true;
            }else{
                s=false;
                if(r>r1){
                    r1=r;
                    r=0;
                }
            }
        }
        if(r>r1){
            r1=r;
        }
        return r1;
    }
}

public class Q217RotateArray {
    public int rotateArray(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int temp=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] !=temp){
                count--;
                if(count<=0){
                    temp=nums[i];
                    count=1;
                }
            }else{
                count++;
            }

        }
        return temp;
    }
}

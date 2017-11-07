public class Q283MoveZeroes {
    public void moveZeroes(int[] nums) {
        int l=nums.length;
        int z=0;
        for(int i=0;i<l;i++){
            if(nums[i]==0){
                z++;
            }else{
                nums[i-z]=nums[i];
            }
        }
        for(int i=l-z;i<l;i++){
            nums[i]=0;
        }
    }
}

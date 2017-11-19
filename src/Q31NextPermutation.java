import java.util.Arrays;

public class Q31NextPermutation {
    public void nextPermutation(int[] nums) {
        if(ref(nums,0,nums.length)!=10000){
            Arrays.sort(nums);
        }
    }

    public int ref(int[] nums,int index,int l){
        if(index==l-1){
            return nums[index];
        }
        int after=ref(nums,index+1,l);
        if(after==10000){
            return 10000;
        }
        if(after > nums[index]){
            for(int i=l-1;i>=index+1;i--){
                if(nums[i] > nums[index]){
                    int t=nums[i];
                    nums[i]=nums[index];
                    nums[index]=t;
                    break;
                }
            }
            Arrays.sort(nums,index+1,l);
            return 10000;
        }else{
            return nums[index];
        }
    }
}

import java.util.Arrays;

public class Q34SearchforaRange {
    public int[] searchRange(int[] nums, int target) {
        int[] r=new int[2];
        int index= Arrays.binarySearch(nums,target);
        if(index<0){
            r[0]=-1;
            r[1]=-1;
        }else{
            r[0]=index;
            r[1]=index;
            for(int i=index-1;i>=0;i--){
                if(nums[i]!=target){
                    r[0]=i+1;
                    break;
                }
                if(i==0){
                    r[0]=0;
                }
            }
            for(int i=index+1;i<nums.length;i++){
                if(nums[i] !=target){
                    r[1]=i-1;
                    break;
                }
                if(i==nums.length-1){
                    r[1]=nums.length-1;
                }
            }
        }
        return r;
    }
}

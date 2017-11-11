import java.util.Arrays;

public class Q581ShortestUnsortedContinuousSubarray {
    public int findUnsortedSubarray(int[] nums) {
        int l=nums.length;
        int a1=-1;
        int a2=-1;
        int[] d=new int[l];
        for(int i=0;i<l;i++){
            d[i]=nums[i];
        }
        Arrays.sort(nums);
        for(int i=0;i<l;i++){
            if(d[i]!=nums[i]){
                a1=i;
                break;
            }
        }
        for(int i=l-1;i>=0;i--){
            if(d[i]!=nums[i]){
                a2=i;
                break;
            }
        }
        if(a1 == -1){
            return 0;
        }else{
            return a2 -a1 +1;
        }
    }
}

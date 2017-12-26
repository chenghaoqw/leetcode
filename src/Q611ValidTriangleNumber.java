import java.util.Arrays;

public class Q611ValidTriangleNumber {
    public int triangleNumber(int[] nums) {
        int r=0;
        Arrays.sort(nums);
        int l=nums.length;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                int k=j+1;
                while(k<l && nums[k]<nums[i]+nums[j]){
                    r++;
                    k++;
                }
            }
        }
        return r;
    }
}

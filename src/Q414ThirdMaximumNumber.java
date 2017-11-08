import java.util.Arrays;

public class Q414ThirdMaximumNumber{
        public int thirdMax(int[] nums) {
            Arrays.sort(nums);
            int l=nums.length;
            if(l<1){
                return 0;
            }
            int t=nums[l-1];
            int c=1;
            for(int i=l-2;i>=0;i--){
                if(t!=nums[i]){
                    c++;
                    if(c==3){
                        return nums[i];
                    }
                    t=nums[i];
                }
            }
            return nums[l-1];
        }
}

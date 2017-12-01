public class Q75SortColors {
    public void sortColors(int[] nums) {
        int t1=0,t2=0,t3=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) t1++;
            if(nums[i]==1) t2++;
            if(nums[i]==2) t3++;
        }
        for(int i=0;i<t1;i++){
            nums[i]=0;
        }
        for(int i=t1;i<t1+t2;i++){
            nums[i]=1;
        }
        for(int i=t1+t2;i<t1+t2+t3;i++){
            nums[i]=2;
        }
    }
}

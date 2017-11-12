public class Q643MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int l=nums.length;
        int r1=0;
        int r2=0;
        if(l < k){
            return 0d;
        }
        for(int i=0;i<k;i++){
            r1+=nums[i];
        }
        r2=r1;
        for(int i=1;i+k-1<l;i++){
            int t=0;
            if(k==1){
                t=nums[i];
            }else{
                t=-nums[i-1]+nums[i+k-1]+r1;
            }
            r2=Math.max(r2,t);
            r1=t;
        }
        return (double)r2/k;
    }
}

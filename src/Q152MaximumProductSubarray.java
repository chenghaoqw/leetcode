public class Q152MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int left=0;
        boolean is=false;
        for(int i=0;i<nums.length;i++){
            if(is){
                if(nums[i]==0){
                    max=Math.max(max,0);
                    max=Math.max(max,subMax(nums,left,i-1));
                    is=false;
                }
                else if(i==nums.length-1) {
                    max=Math.max(max,subMax(nums,left,i));
                }
            }else{
                if(nums[i]!=0){
                    is=true;
                    left=i;
                    if(i==nums.length-1) {
                        max=Math.max(max,subMax(nums,left,i));
                    }
                }
            }
        }
        return max;
    }

    public int subMax(int[] nums,int b,int e){
        if(b==e) return nums[b];
        boolean l=false;
        boolean r=false;
        int result=1;
        int result1=1;
        int result2=1;
        for(int i=b,j=e;i<=e && j>=b;i++,j--){
            result*=nums[i];
            if(l) result1*=nums[i];
            if(r) result2*=nums[j];
            if(nums[i]<0) l=true;
            if(nums[j]<0) r=true;
        }
        if(result>0) return result;
        else return Math.max(result1,result2);
    }
}

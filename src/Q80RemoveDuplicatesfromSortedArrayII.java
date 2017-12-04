public class Q80RemoveDuplicatesfromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int l=nums.length;
        if(l<=0) return 0;
        int t=nums[0];
        int y=1;
        int s=0;
        for(int i=1;i<l;i++){
            if(t==nums[i]){
                y++;
            }else{
                if(y>2){
                    s+=y-2;
                }
                y=1;
                t=nums[i];
            }
            nums[i-s]=nums[i];
        }
        if(y>2){
            s+=y-2;
        }
        return l-s;
    }
}

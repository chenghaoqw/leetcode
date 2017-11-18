public class Q724FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int l=nums.length;
        int index=1;
        int s1=0,s2=0;;
        for(int i=1;i<l;i++){
            s2+=nums[i];
        }
        for(int i=0;i<l-1;i++){
            if(s2==s1){
                return i;
            }
            s1+=nums[i];
            s2-=nums[i+1];
        }
        if(s2==s1){
            return l-1;
        }
        return -1;
    }
}

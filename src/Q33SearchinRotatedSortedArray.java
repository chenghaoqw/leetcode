public class Q33SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
        int l=nums.length;
        int index=0;
        for(int i=1;i<l;i++){
            if(nums[i] < nums[i-1]){
                index=i;
            }
        }
        int b=0;
        int e=l-1;
        int m=(b+e)/2;
        while(e>=b){
            if(nums[getIndex(m,l,index)] <target){
                b=m+1;
            }else if(nums[getIndex(m,l,index)] > target){
                e=m-1;
            }else{
                return getIndex(m,l,index);
            }
            m=(b+e)/2;
        }
        return -1;
    }

    public int getIndex(int x,int l,int index){
        if(x+index>=l){
            return x+index-l;
        }
        return x+index;
    }
}

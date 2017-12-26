public class Q565ArrayNesting {
    public int arrayNesting(int[] nums) {
        int l=nums.length;
        int r=0;
        boolean[] is=new boolean[l];
        for(int i=0;i<l;i++){
            if(!is[i]){
                boolean[] is1=new boolean[l];
                int j=i;
                int sub=0;
                while(!is1[j]){
                    is1[j]=true;
                    is[j]=true;
                    j=nums[j];
                    sub++;
                }
                r=Math.max(r,sub);
            }
        }
        return r;
    }
}

import java.util.HashMap;

public class Q350IntersectionofTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] r=new int[Math.max(nums1.length,nums2.length)];
        HashMap<Integer,Integer> data=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            if(data.containsKey(nums1[i])) data.put(nums1[i],data.get(nums1[i])+1);
            else data.put(nums1[i],1);
        }
        int index=0;
        for(int i=0;i<nums2.length;i++){
            if(data.containsKey(nums2[i])) {
                r[index]=nums2[i];
                index++;
                if(data.get(nums2[i])>1){
                    data.put(nums2[i],data.get(nums2[i])-1);
                }else{
                    data.remove(nums2[i]);
                }
            }
        }
        int[] result=new int[index];
        for(int i=0;i<index;i++) result[i]=r[i];
        return result;
    }
}

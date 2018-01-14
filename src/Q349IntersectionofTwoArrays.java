import java.util.Iterator;
import java.util.TreeSet;

public class Q349IntersectionofTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        TreeSet<Integer> r=new TreeSet<Integer>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]) r.add(nums1[i]);
            }
        }
        int[] array=new int[r.size()];
        Iterator<Integer> it = r.iterator();
        int i=0;
        while(it.hasNext()) {
            array[i]=it.next();
            i++;
        }
        return array;
    }
}

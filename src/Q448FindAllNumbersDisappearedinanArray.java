import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Q448FindAllNumbersDisappearedinanArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int l = nums.length;
        TreeSet<Integer> d=new TreeSet<Integer>();
        List<Integer> r=new ArrayList<Integer>();
        for(int i=0;i<l;i++){
            d.add(i+1);
        }
        for(int i=0;i<l;i++){
            if(d.contains(nums[i])){
                d.remove(nums[i]);
            }
        }
        Iterator<Integer> it=d.iterator();
        while(it.hasNext()){
            r.add(it.next());
        }
        return r;
    }
}

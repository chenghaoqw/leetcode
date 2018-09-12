import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q703KthLargestElementinaStream {
    List<Integer> list = new ArrayList();
    int index = 1;

    public Q703KthLargestElementinaStream(int k, int[] nums) {
        index = k;
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
    }

    public int add(int val) {
        list.add(val);
        Collections.sort(list);
        return list.get(list.size() - index);

    }
}
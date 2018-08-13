import java.util.ArrayList;
import java.util.List;

public class Q46Permutations {
    List<List<Integer>> result = new ArrayList();

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList();
        ref(nums, list);
        return result;
    }

    public void ref(int[] nums, List<Integer> list) {
        if (list.size() == nums.length) {
            result.add(list);
            return;
        }
        for (int i : nums) {
            List<Integer> list1 = new ArrayList();
            list1.addAll(list);
            if (!list1.contains(i)) {
                list1.add(i);
                ref(nums, list1);
            }
        }
    }
}

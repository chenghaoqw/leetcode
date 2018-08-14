import java.util.ArrayList;
import java.util.List;

public class Q47PermutationsII {
    List<List<Integer>> result = new ArrayList();

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> list = new ArrayList();
        List<Integer> list1 = new ArrayList();
        ref(nums, list, list1);
        return result;
    }

    public void ref(int[] nums, List<Integer> list, List<Integer> use1) {
        if (list.size() == nums.length) {
            result.add(list);
            return;
        }
        List<Integer> dupli = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> use = new ArrayList();
            use.addAll(use1);
            if (use.contains(i) || dupli.contains(nums[i])) continue;
            List<Integer> list1 = new ArrayList();
            list1.addAll(list);
            use.add(i);
            list1.add(nums[i]);
            ref(nums, list1, use);
            dupli.add(nums[i]);
        }
    }
}
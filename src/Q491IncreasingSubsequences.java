import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q491IncreasingSubsequences {
    Set<List<Integer>> res = new HashSet();

    public List<List<Integer>> findSubsequences(int[] nums) {
        helper(new ArrayList(), 0, nums);
        List ans = new ArrayList(res);
        return ans;
    }

    public void helper(List<Integer> holder, int index, int[] nums) {
        if (holder.size() >= 2) res.add(holder);
        for (int i = index; i < nums.length; i++) {
            if (holder.size() == 0 || holder.get(holder.size() - 1) <= nums[i]) {
                holder.add(nums[i]);
                helper(new ArrayList(holder), i + 1, nums);
                holder.remove(holder.size() - 1);
            }
        }
    }
}
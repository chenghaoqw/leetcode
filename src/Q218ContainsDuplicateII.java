import java.util.HashMap;

public class Q218ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> d = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (d.containsKey(nums[i]) && Math.abs(d.get(nums[i]) - i) <= k) {
                return true;
            } else {
                d.put(nums[i], i);
            }
        }
        return false;
    }
}

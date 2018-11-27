import java.util.ArrayList;
import java.util.List;

public class Q376WiggleSubsequence {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return nums.length;
        List<Integer> list = new ArrayList();

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) continue;
            list.add(nums[i] - nums[i - 1]);
        }
        int ret = 0;
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                ret++;
                continue;
            }
            if ((list.get(i) > 0 && list.get(i - 1) < 0) || (list.get(i) < 0 && list.get(i - 1) >= 0)) {
                ret++;
            }
        }
        return ret + 1;
    }
}
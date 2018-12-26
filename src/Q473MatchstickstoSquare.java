import java.util.ArrayList;
import java.util.List;

public class Q473MatchstickstoSquare {
    public boolean makesquare(int[] nums) {
        if (nums.length == 0) return false;
        List<Integer> list = new ArrayList();
        int sum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            sum += nums[i];
            list.add(nums[i]);
        }
        if (sum % 4 != 0) return false;
        return dfs(1, sum / 4, 0, list);
    }

    public boolean dfs(int index, int edge, int sum, List<Integer> list) {
        if (index > 4 || sum > edge) return false;
        if (index == 4 && sum == edge) return true;
        if (sum == edge) return dfs(index + 1, edge, 0, list);
        for (int i = 0; i < list.size(); i++) {
            List<Integer> list1 = new ArrayList();
            list1.addAll(list);
            int j = list1.get(i);
            list1.remove(i);
            if (dfs(index, edge, sum + j, list1)) return true;
        }
        return false;
    }
}
import java.util.ArrayList;
import java.util.List;

public class Q457CircularArrayLoop {
    public boolean circularArrayLoop(int[] nums) {
        int l = nums.length;
        List<Integer> visisted = new ArrayList();
        for (int i = 0; i < l; i++) {
            List<Integer> list = new ArrayList();
            boolean skip = false;
            int cur = i;
            while (!list.contains(cur)) {
                if (visisted.contains(cur)) {
                    skip = true;
                    break;
                }
                list.add(cur);
                int next = (cur + nums[cur]) % l;
                if (next < 0) next += l;
                if (next == cur) {
                    skip = true;
                    break;
                }
                cur = next;
            }
            if (skip) {
                visisted.addAll(list);
                continue;
            }
            List list1 = new ArrayList();
            list1.addAll(list);
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == cur) break;
                else list.remove(i);
            }
            for (int j : list) {
                if (nums[j] / nums[cur] < 0) {
                    skip = true;
                    break;
                }
            }
            if (skip) {
                visisted.addAll(list);
            } else {
                return true;
            }
        }
        return false;
    }
}
import java.util.ArrayList;
import java.util.List;

public class Q77Combinations {
    List<List<Integer>> result = new ArrayList();

    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list = new ArrayList();
        combine(n, k, list);
        return result;
    }

    public void combine(int n, int k, List<Integer> list) {
        if (list.size() == k) {
            result.add(list);
            return;
        }
        int start = 1;
        if (list.size() != 0) {
            start = list.get(list.size() - 1);
        }
        for (int i = start; i <= n; i++) {
            List<Integer> list1 = new ArrayList();
            list1.addAll(list);
            if (!list1.contains(i)) {
                list1.add(i);
                combine(n, k, list1);
            }
        }
    }
}

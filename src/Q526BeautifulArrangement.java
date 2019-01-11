import java.util.ArrayList;
import java.util.List;

public class Q526BeautifulArrangement {
    int ret = 0;

    public int countArrangement(int N) {
        helper(1, new ArrayList(), N);
        return ret;
    }

    public void helper(int pos, List<Integer> list, int total) {
        if (pos > total) {
            ret++;
            return;
        }
        for (int i = 1; i <= total; i++) {
            List<Integer> list1 = new ArrayList();
            list1.addAll(list);
            if (!list.contains(i) && (pos % i == 0 || i % pos == 0)) {
                list1.add(i);
                helper(pos + 1, list1, total);
            }
        }
    }
}
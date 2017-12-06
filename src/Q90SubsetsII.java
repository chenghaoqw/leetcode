import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q90SubsetsII {
    private List<List<Integer>> r = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        r.add(new ArrayList<Integer>());
        ref(nums, new ArrayList<Integer>(), -1);
        return r;
    }

    private void ref(int[] n, List<Integer> d, int o) {
        if (o == n.length - 1) return;
        int t = 0;
        for (int i = o + 1; i < n.length; i++) {
            List<Integer> l = new ArrayList<>();
            l.addAll(d);
            if (i == o + 1 || t != n[i]) {
                t = n[i];
                l.add(t);
                r.add(l);
                ref(n, l, i);
            }
        }
    }
}

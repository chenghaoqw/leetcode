import java.util.HashSet;

public class Q822CardFlippingGame {
    public int flipgame(int[] fronts, int[] backs) {
        int l = fronts.length;
        HashSet<Integer> set = new HashSet();
        for (int i = 0; i < l; i++) {
            if (fronts[i] == backs[i]) set.add(fronts[i]);
        }
        int ret = Integer.MAX_VALUE;
        for (int i = 0; i < l; i++) {
            if (!set.contains(fronts[i])) ret = Math.min(ret, fronts[i]);
            if (!set.contains(backs[i])) ret = Math.min(ret, backs[i]);
        }
        return ret == Integer.MAX_VALUE ? 0 : ret;
    }
}

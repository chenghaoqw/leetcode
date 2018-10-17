import java.util.HashSet;

public class Q888FairCandySwap {
    public int[] fairCandySwap(int[] A, int[] B) {
        int[] ret = new int[2];
        int sum1 = 0, sum2 = 0;
        for (int i : A) sum1 += i;
        for (int i : B) sum2 += i;
        int d = sum2 - sum1;
        if (d % 2 != 0) return ret;
        d /= 2;
        HashSet<Integer> set = new HashSet();
        for (int i : B) set.add(i);
        for (int i : A) {
            if (set.contains(i + d)) {
                ret[0] = i;
                ret[1] = i + d;
                return ret;
            }
        }
        return ret;
    }
}
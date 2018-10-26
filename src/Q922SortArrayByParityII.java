import java.util.ArrayList;
import java.util.List;

public class Q922SortArrayByParityII {
    public int[] sortArrayByParityII(int[] A) {
        List<Integer> list1 = new ArrayList();
        List<Integer> list2 = new ArrayList();
        for (int i : A) {
            if (i % 2 == 0) list1.add(i);
            else list2.add(i);
        }
        int[] ret = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (i % 2 == 0) ret[i] = list1.get(i / 2);
            else ret[i] = list2.get(i / 2);
        }
        return ret;
    }
}
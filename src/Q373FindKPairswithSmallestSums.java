import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Q373FindKPairswithSmallestSums {
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<int[]> list = new ArrayList();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int[] pair = new int[2];
                pair[0] = nums1[i];
                pair[1] = nums2[j];
                list.add(pair);
            }
        }
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] i1, int[] i2) {
                return i1[0] + i1[1] - i2[0] - i2[1];
            }
        });
        if (list.size() >= k)
            return list.subList(0, k);
        return list;
    }
}

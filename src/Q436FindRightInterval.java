import java.util.Arrays;
import java.util.HashMap;

public class Q436FindRightInterval {
    public class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

    public int[] findRightInterval(Interval[] intervals) {
        HashMap<Integer, Integer> map = new HashMap();
        int l = intervals.length;
        int[] r = new int[l];
        int[] array = new int[l];
        for (int i = 0; i < l; i++) {
            array[i] = intervals[i].start;
            map.put(array[i], i);
        }
        Arrays.sort(array);
        for (int i = 0; i < l; i++) {
            int t = Arrays.binarySearch(array, intervals[i].end);
            if (t >= -1) r[i] = map.get(array[t]);
            else if (t != -l - 1) r[i] = map.get(array[-t - 1]);
            else r[i] = -1;
        }
        return r;
    }
}

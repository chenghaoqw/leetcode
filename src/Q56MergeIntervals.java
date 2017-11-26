import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Q56MergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval i1, Interval i2) {
                if (i1.start - i2.start != 0) {
                    return i1.start - i2.start;
                } else {
                    return i1.end - i2.end;
                }
            }
        });
        int l = intervals.size();
        if (l == 0) {
            return intervals;
        }
        Interval t = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            if (t.end >= intervals.get(i).start) {
                while (i < intervals.size() && intervals.get(i).end <= t.end) {
                    intervals.remove(i);
                }
                if (i < intervals.size() && intervals.get(i).start <= t.end) {
                    t.end = intervals.get(i).end;
                    intervals.remove(i);
                }
                if (i >= intervals.size()) {
                    return intervals;
                }
                i--;
            }
            t = intervals.get(i);
        }
        return intervals;
    }

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
}

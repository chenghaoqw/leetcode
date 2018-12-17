import java.util.Arrays;
import java.util.Comparator;

public class Q435NonoverlappingIntervals {
    public int eraseOverlapIntervals(Interval[] intervals) {
        int l = intervals.length;
        if (l <= 1) return 0;
        Arrays.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval i1, Interval i2) {
                return i1.end - i2.end;
            }
        });
        int[][] dp = new int[l][2];
        for (int i = 0; i < l; i++) {
            dp[i][0] = intervals[i].end;
        }
        for (int i = 0; i < l; i++) {
            int max = 1;
            for (int left = i - 1; left >= 0; left--) {
                if (intervals[left].end <= intervals[i].start) {
                    max = Math.max(dp[left][1] + 1, max);
                    break;
                }
            }
            for (int right = i - 1; right >= 0; right--) {
                if (intervals[right].end <= intervals[i].end) {
                    max = Math.max(max, dp[right][1]);
                    break;
                }
            }
            dp[i][1] = max;
        }
        return l - dp[l - 1][1];
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


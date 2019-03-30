import java.util.TreeSet;

public class Q855ExamRoom {
    TreeSet<Integer> set = new TreeSet();
    int l;

    public Q855ExamRoom(int N) {
        l = N;
    }

    public int seat() {
        int p = 0;
        if (set.size() > 0) {
            int dist = set.first();
            int prev = -1;
            for (int i : set) {
                if (i >= 0) {
                    int d = (i - prev) / 2;
                    if (d > dist) {
                        dist = d;
                        p = prev + d;
                    }
                }
                prev = i;
            }
            if (l - 1 - set.last() > dist) p = l - 1;
        }
        set.add(p);
        return p;
    }

    public void leave(int p) {
        set.remove(p);
    }
}
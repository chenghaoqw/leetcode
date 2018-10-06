import java.util.ArrayList;
import java.util.List;

public class Q849MaximizeDistancetoClosestPerson {
    public int maxDistToClosest(int[] seats) {
        List<Integer> list = new ArrayList();
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) list.add(i);
        }
        int ret = Math.max(list.get(0), seats.length - 1 - list.get(list.size() - 1));
        for (int i = 0; i < list.size() - 1; i++) {
            ret = Math.max(ret, (list.get(i + 1) - list.get(i)) / 2);
        }
        return ret;
    }
}
import java.util.TreeMap;

public class Q846HandofStraights {
    public boolean isNStraightHand(int[] hand, int W) {
        TreeMap<Integer, Integer> map = new TreeMap();
        for (int card : hand) {
            if (!map.containsKey(card)) map.put(card, 1);
            else map.put(card, map.get(card) + 1);
        }
        while (map.size() > 0) {
            int first = map.firstKey();
            for (int i = first; i < first + W; i++) {
                if (!map.containsKey(i)) return false;
                if (map.get(i) == 1) map.remove(i);
                else map.put(i, map.get(i) - 1);
            }
        }
        return true;
    }
}

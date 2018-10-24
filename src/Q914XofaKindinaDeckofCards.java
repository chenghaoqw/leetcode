import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Q914XofaKindinaDeckofCards {
    public boolean hasGroupsSizeX(int[] deck) {
        if (deck.length <= 1) return false;
        HashMap<Integer, Integer> map = new HashMap();
        for (int i : deck) {
            if (!map.containsKey(i)) map.put(i, 1);
            else map.put(i, map.get(i) + 1);
        }
        List<Integer> list = new ArrayList();
        for (int i : map.keySet()) {
            list.add(map.get(i));
        }
        Collections.sort(list);
        for (int i = 2; i <= list.get(0); i++) {
            boolean ret = true;
            for (int j : list) {
                if (j % i != 0) ret = false;
            }
            if (ret) return true;
        }
        return false;
    }

    public int GCD(int m, int n) {
        int result = 0;
        while (n != 0) {
            result = m % n;
            m = n;
            n = result;
        }
        return m;
    }
}
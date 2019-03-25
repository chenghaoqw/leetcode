import java.util.ArrayList;
import java.util.List;

public class Q842SplitArrayintoFibonacciSequence {
    public List<Integer> splitIntoFibonacci(String S) {
        int l = S.length();
        for (int i = 0; i < Math.min(l, 10); i++) {
            if (S.substring(0, i + 1).startsWith("0") && i > 0) break;
            long left = Long.valueOf(S.substring(0, i + 1));
            if (left > Integer.MAX_VALUE) break;
            search:
            for (int j = i + 1; j < Math.min(i + 10, l); j++) {
                if (S.substring(i + 1, j + 1).startsWith("0") && j > i + 1) break;
                long right = Long.valueOf(S.substring(i + 1, j + 1));
                if (right > Integer.MAX_VALUE) break;
                int k = j + 1;
                List<Integer> list = new ArrayList();
                list.add((int) left);
                list.add((int) right);
                while (k < l) {
                    long add = list.get(list.size() - 1) + list.get(list.size() - 2);
                    if (add > Integer.MAX_VALUE || !S.substring(k).startsWith(add + "")) continue search;
                    else {
                        list.add((int) add);
                        k += (add + "").length();
                    }
                }
                if (list.size() >= 3) return list;
            }
        }
        return new ArrayList<Integer>();
    }

}
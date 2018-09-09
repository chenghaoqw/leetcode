import java.util.ArrayList;
import java.util.List;

public class Q682BaseballGame {
    public int calPoints(String[] ops) {
        int r = 0;
        List<Integer> list = new ArrayList();
        for (int i = 0; i < ops.length; i++) {
            String s = ops[i];
            if ("C".equals(s)) {
                r -= list.get(list.size() - 1);
                list.remove(list.size() - 1);
            } else if ("D".equals(s)) {
                r += list.get(list.size() - 1) * 2;
                list.add(list.get(list.size() - 1) * 2);
            } else if ("+".equals(s)) {
                r += list.get(list.size() - 1) + list.get(list.size() - 2);
                list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
            } else {
                r += Integer.parseInt(s);
                list.add(Integer.parseInt(s));
            }
        }
        return r;
    }
}
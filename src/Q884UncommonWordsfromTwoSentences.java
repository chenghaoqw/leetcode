import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q884UncommonWordsfromTwoSentences {
    public String[] uncommonFromSentences(String A, String B) {
        HashMap<String, Integer> map = new HashMap();
        String[] array = A.split(" ");
        for (String s : array) {
            if (map.containsKey(s)) map.put(s, map.get(s) + 1);
            else map.put(s, 1);
        }
        array = B.split(" ");
        for (String s : array) {
            if (map.containsKey(s)) map.put(s, map.get(s) + 1);
            else map.put(s, 1);
        }
        List<String> list = new ArrayList();
        for (String s : map.keySet()) {
            if (map.get(s) == 1) list.add(s);
        }
        String[] strings = new String[list.size()];
        list.toArray(strings);
        return strings;
    }
}
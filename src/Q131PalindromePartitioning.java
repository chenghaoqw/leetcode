import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q131PalindromePartitioning {
    public List<List<String>> partition(String s) {
        HashMap<Integer, List<List<String>>> map = new HashMap();
        List<List<String>> result = new ArrayList();
        if (s.length() == 0) {
            List<String> t1 = new ArrayList();
            result.add(t1);
            return result;
        }
        for (int i = 0; i < s.length(); i++) {
            StringBuilder builder = new StringBuilder(s.substring(0, i + 1));
            if (builder.reverse().toString().equals(s.substring(0, i + 1))) {
                List<List<String>> t;
                if (map.containsKey(s.length() - i)) {
                    t = map.get(s.length() - i);
                } else {
                    t = partition(s.substring(i + 1, s.length()));
                    map.put(s.length() - i, t);
                }
                for (List<String> item : t) {
                    item.add(0, s.substring(0, i + 1));
                    result.add(item);
                }
            }
        }
        return result;
    }
}
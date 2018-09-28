import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q811SubdomainVisitCount {
    HashMap<String, Integer> map = new HashMap();

    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> list = new ArrayList();
        for (int i = 0; i < cpdomains.length; i++) {
            String[] array = cpdomains[i].split(" ");
            int count = Integer.parseInt(array[0]);
            String s = array[1];
            while (s.length() > 0) {
                if (map.containsKey(s)) map.put(s, map.get(s) + count);
                else map.put(s, count);
                if (s.indexOf(".") > 0) {
                    s = s.substring(s.indexOf(".") + 1, s.length());
                } else {
                    s = "";
                }
            }
        }
        for (String key : map.keySet()) {
            list.add(map.get(key) + " " + key);
        }
        return list;
    }
}
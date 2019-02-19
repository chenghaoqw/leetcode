import java.util.*;

public class Q721AccountsMerge {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String, String> union = new HashMap();
        Map<String, String> o = new HashMap();
        Map<String, Set<String>> m = new HashMap();
        for (List<String> list : accounts) {
            o.put(list.get(1), list.get(0));
            for (int i = 1; i < list.size(); i++) {
                union.put(list.get(i), list.get(1));
            }
        }
        for (List<String> list : accounts) {
            String parent = find(union, list.get(1));
            for (int i = 1; i < list.size(); i++) {
                union.put(find(union, list.get(i)), parent);
            }
        }
        for (List<String> list : accounts) {
            for (int i = 1; i < list.size(); i++) {
                String parent = find(union, list.get(i));
                if (m.containsKey(parent)) {
                    m.get(parent).add(list.get(i));
                } else {
                    TreeSet<String> set = new TreeSet();
                    set.add(list.get(i));
                    m.put(parent, set);
                }
            }
        }
        List<List<String>> ret = new ArrayList();
        for (String key : m.keySet()) {
            List<String> s = new ArrayList();
            s.add(o.get(key));
            s.addAll(m.get(key));
            ret.add(s);
        }
        return ret;
    }

    public String find(Map<String, String> map, String p) {
        if (map.get(p).equals(p)) return p;
        return find(map, map.get(p));
    }
}
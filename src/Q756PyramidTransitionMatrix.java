import java.util.*;

public class Q756PyramidTransitionMatrix {
    public boolean pyramidTransition(String bottom, List<String> allowed) {
        Map<String, Set<String>> map = new HashMap();
        for (String s : allowed) {
            String t = s.substring(0, 2);
            if (map.containsKey(t)) map.get(t).add(s.substring(2, 3));
            else {
                TreeSet<String> set = new TreeSet();
                set.add(s.substring(2, 3));
                map.put(t, set);
            }
        }
        return helper(bottom, "", map);
    }

    public boolean helper(String bottom, String now, Map<String, Set<String>> map) {
        if (now.length() == bottom.length() - 1) {
            if (now.length() == 1) return true;
            else return helper(now, "", map);
        }
        String s = bottom.substring(now.length(), now.length() + 2);
        if (!map.containsKey(s)) return false;
        Set<String> set = map.get(s);
        if (set.size() == 0) return false;
        for (String t : set) {
            if (helper(bottom, now + t, map)) return true;
        }
        return false;
    }
}
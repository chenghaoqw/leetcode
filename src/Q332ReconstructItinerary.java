import java.util.*;

public class Q332ReconstructItinerary {
    public List<String> findItinerary(String[][] tickets) {
        Map<String, ArrayList<String>> map = new HashMap();
        for (String[] s : tickets) {
            if (map.containsKey(s[0])) map.get(s[0]).add(s[1]);
            else {
                ArrayList<String> set = new ArrayList();
                set.add(s[1]);
                map.put(s[0], set);
            }
        }
        for (String s : map.keySet()) {
            Collections.sort(map.get(s));
        }
        List<String> list = new ArrayList();
        Stack<String> stack = new Stack();
        stack.add("JFK");
        while (!stack.isEmpty()) {
            String s = stack.peek();
            if (!map.containsKey(s) || map.get(s).size() == 0) {
                list.add(0, s);
                stack.pop();
            } else {
                stack.add(map.get(s).get(0));
                map.get(s).remove(0);
            }
        }
        return list;
    }
}

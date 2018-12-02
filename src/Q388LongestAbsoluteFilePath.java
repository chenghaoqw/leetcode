import java.util.HashMap;
import java.util.Map;

public class Q388LongestAbsoluteFilePath {
    public int lengthLongestPath(String input) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap();
        map.put(0, 0);
        for (String s : input.split("\n")) {
            int level = s.lastIndexOf("\t") + 1;
            int len = s.substring(level).length();
            if (s.contains(".")) {
                res = Math.max(res, map.get(level) + len);
            } else {
                map.put(level + 1, map.get(level) + len + 1);
            }
        }
        return res;
    }
}
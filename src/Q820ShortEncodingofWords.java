import java.util.HashSet;

public class Q820ShortEncodingofWords {
    public int minimumLengthEncoding(String[] words) {
        HashSet<String> set1 = new HashSet();
        HashSet<String> set = new HashSet();
        for (String s : words) set1.add(s);
        set.addAll(set1);
        for (String s1 : set1) {
            for (String s2 : set1) {
                if (s1 == s2) continue;
                System.out.printf(s1 + "|" + s2);
                System.out.printf("\n");
                if (s1.startsWith(s2) || s1.endsWith(s2)) set.remove(s2);
            }
        }
        int ret = 0;
        for (String s : set) System.out.printf(s + "|");
        for (String s : set) ret += s.length();
        ret += set.size();
        return ret;
    }
}

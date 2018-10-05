public class Q844BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        char[] s = S.toCharArray();
        char[] t = T.toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (s[i] == '#') {
                int j = i - 1;
                while (j >= 0 && s[j] == '#') j--;
                if (j >= 0) s[j] = '#';
            }
        }
        for (int i = 0; i < t.length; i++) {
            if (t[i] == '#') {
                int j = i - 1;
                while (j >= 0 && t[j] == '#') j--;
                if (j >= 0) t[j] = '#';
            }
        }
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            if (s[i] != '#') s1.append(s[i]);
        }
        for (int i = 0; i < t.length; i++) {
            if (t[i] != '#') s2.append(t[i]);
        }
        return s1.toString().equals(s2.toString());
    }
}
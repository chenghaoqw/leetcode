import java.util.Arrays;

public class Q833FindAndReplaceinString {
    public String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        int[] match = new int[S.length()];
        Arrays.fill(match, -1);
        for (int i = 0; i < indexes.length; i++) {
            if (indexes[i] + sources[i].length() > S.length()) continue;

            if (S.substring(indexes[i], indexes[i] + sources[i].length()).equals(sources[i])) {
                match[indexes[i]] = i;
            }
        }

        String ans = S;
        for (int i = 0; i < S.length(); i++) {
            if (match[i] >= 0) {
                ans = ans.substring(0, i + ans.length() - S.length()) + targets[match[i]] + S.substring(i + sources[match[i]].length());
                i += sources[match[i]].length() - 1;
            }
        }
        return ans;
    }
}
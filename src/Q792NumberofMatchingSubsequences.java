import java.util.ArrayList;
import java.util.List;

public class Q792NumberofMatchingSubsequences {
    public int numMatchingSubseq(String S, String[] words) {
        ArrayList<int[]>[] all = new ArrayList[128];
        for (int i = 0; i < all.length; i++) all[i] = new ArrayList();
        int ret = 0;
        for (int i = 0; i < words.length; i++) {
            all[words[i].charAt(0)].add(new int[]{i, 1});
        }
        for (char c : S.toCharArray()) {
            List<int[]> list = new ArrayList();
            list.addAll(all[c]);
            all[c].clear();
            for (int[] t : list) {
                if (t[1] == words[t[0]].length()) ret++;
                else all[words[t[0]].charAt(t[1]++)].add(t);
                ;
            }
        }
        return ret;
    }
}
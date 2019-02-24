import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Q752OpentheLock {
    public int openLock(String[] deadends, String target) {
        Set<String> used = new HashSet();
        Queue<String> q = new LinkedList();
        for (String s : deadends) {
            if (s.equals("0000")) return -1;
            used.add(s);
        }
        q.add("0000");
        used.add("0000");
        int ans = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String cur = q.poll();
                if (cur.equals(target)) return ans;
                for (int j = 0; j < 4; j++) {
                    for (int k = -1; k <= 1; k++) {
                        if (k == 0) continue;
                        char[] acur = cur.toCharArray();
                        acur[j] = (char) ((acur[j] - '0' + 10 + k) % 10 + '0');
                        if (!used.contains(String.valueOf(acur))) {
                            used.add(String.valueOf(acur));
                            q.add(String.valueOf(acur));
                        }
                    }
                }
            }
            ans++;
        }
        return -1;
    }
}
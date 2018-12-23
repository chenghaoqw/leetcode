import java.util.Arrays;
import java.util.HashMap;

public class Q464canIWin {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= maxChoosableInteger)
            return true;
        if (desiredTotal > maxChoosableInteger * (maxChoosableInteger + 1) / 2)
            return false;
        int[] flag = new int[maxChoosableInteger + 1];
        return canWinHelp(flag, desiredTotal, new HashMap<String, Boolean>());
    }

    public boolean canWinHelp(int[] flag, int desiredTotal, HashMap<String, Boolean> map) {
        String state = Arrays.toString(flag);
        if (map.containsKey(state))
            return map.get(state);
        for (int i = 1; i < flag.length; i++) {
            if (flag[i] == 0) {
                flag[i] = 1;
                if (i >= desiredTotal || !canWinHelp(flag, desiredTotal - i, map)) {
                    map.put(state, true);
                    flag[i] = 0;
                    return true;
                }
                flag[i] = 0;
            }
        }
        map.put(state, false);
        return false;
    }
}
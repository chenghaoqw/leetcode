import java.util.HashSet;

public class Q421MaximumXORofTwoNumbersinanArray {
    public int findMaximumXOR(int[] nums) {
        int max = 0, mask = 0;
        for (int i = 31; i >= 0; i--) {
            mask = mask | (1 << i);
            HashSet<Integer> set = new HashSet();
            for (int j : nums) set.add(mask & j);
            int t = max | (1 << i);
            for (int j : set) {
                if (set.contains(j ^ t)) {
                    max = t;
                    break;
                }
            }
        }
        return max;
    }
}

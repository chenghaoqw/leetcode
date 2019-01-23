import java.util.Arrays;

public class Q646MaximumLengthofPairChain {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
        int ans = 0, cur = Integer.MIN_VALUE;
        for (int[] pair : pairs) {
            if (cur < pair[0]) {
                ans++;
                cur = pair[1];
            }
        }
        return ans;
    }
}
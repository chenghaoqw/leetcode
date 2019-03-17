import java.util.Arrays;
import java.util.HashMap;

public class Q823BinaryTreesWithFactors {
    HashMap<Integer, Integer> map = new HashMap();

    public int numFactoredBinaryTrees(int[] A) {
        int l = A.length;
        int m = 1_000_000_007;
        Arrays.sort(A);
        long[] dp = new long[l];
        Arrays.fill(dp, 1);
        for (int i = 0; i < l; ++i)
            map.put(A[i], i);
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < i; j++) {
                if (A[i] % A[j] == 0) {
                    int right = A[i] / A[j];
                    if (map.containsKey(right)) {
                        dp[i] = (dp[i] + dp[j] * dp[map.get(right)]) % m;
                    }
                }
            }
        }
        long ans = 0;
        for (long x : dp) ans += x;
        return (int) (ans % m);
    }
}

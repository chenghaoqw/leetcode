public class Q740DeleteandEarn {
    public int deleteAndEarn(int[] nums) {
        int[] sum = new int[10001];
        for (int i : nums) {
            sum[i] += i;
        }
        for (int i = 2; i <= 10000; i++) {
            sum[i] = Math.max(sum[i - 2] + sum[i], sum[i - 1]);
        }
        return sum[10000];
    }
}
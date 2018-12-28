public class Q477TotalHammingDistance {
    public int totalHammingDistance(int[] nums) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int cur = 0;
            for (int num : nums) {
                if (((num >> i) & 1) == 1) cur++;
            }
            res += cur * (nums.length - cur);
        }
        return res;
    }
}
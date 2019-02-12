import java.util.Arrays;

public class Q673NumberofLongestIncreasingSubsequence {
    public int findNumberOfLIS(int[] nums) {
        int l = nums.length;
        if (l <= 1) return l;
        int[] len = new int[l];
        int[] count = new int[l];
        Arrays.fill(count, 1);
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    if (len[j] >= len[i]) {
                        count[i] = count[j];
                        len[i] = len[j] + 1;
                    } else if (len[j] + 1 == len[i]) count[i] += count[j];
                }
            }
        }
        int max = Arrays.stream(len).max().getAsInt();
        int ret = 0;
        for (int i = 0; i < l; i++) {
            if (len[i] == max) ret += count[i];
        }
        return ret;
    }
}
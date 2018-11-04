public class Q220ContainsDuplicateIII {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (k == 0) return false;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j <= i + k && j < nums.length; j++) {
                long temp = (long) nums[i] - (long) nums[j];
                if (Math.abs(temp) <= t) return true;
            }

        }
        return false;
    }
}
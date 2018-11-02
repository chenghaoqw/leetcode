public class Q213HouseRobberII {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        else if (nums.length == 2) return Math.max(nums[0], nums[1]);
        else if (nums.length == 0) return 0;
        int[] ret = new int[nums.length + 2];
        boolean is = false;
        for (int i = 0; i < nums.length; i++) {
            ret[i + 2] = Math.max(ret[i] + nums[i], ret[i + 1]);
            if (i == 2 && ret[i + 2] == ret[i]) is = true;
            if (i == nums.length - 1 && ret[i + 2] != ret[i]) is = false;
        }
        if (is) return ret[ret.length - 1];
        int result = 0;
        int i0 = nums[0];
        nums[0] = 0;
        ret = new int[nums.length + 2];
        for (int i = 0; i < nums.length; i++) {
            ret[i + 2] = Math.max(ret[i] + nums[i], ret[i + 1]);
        }
        result = ret[ret.length - 1];
        nums[0] = i0;
        nums[nums.length - 1] = 0;
        ret = new int[nums.length + 2];
        for (int i = 0; i < nums.length; i++) {
            ret[i + 2] = Math.max(ret[i] + nums[i], ret[i + 1]);
        }
        result = Math.max(ret[ret.length - 1], result);
        return result;
    }
}
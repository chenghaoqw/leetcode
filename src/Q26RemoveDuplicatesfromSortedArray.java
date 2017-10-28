public class Q26RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int result = 1;
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != temp) {
                result++;
                nums[result - 1] = nums[i];
                temp = nums[i];
            }
        }
        return result;
    }
}

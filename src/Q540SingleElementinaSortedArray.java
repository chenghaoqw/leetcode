public class Q540SingleElementinaSortedArray {
    public int singleNonDuplicate(int[] nums) {
        int ret = 0;
        for (int i : nums) {
            ret = ret ^ i;
        }
        return ret;
    }
}
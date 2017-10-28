public class Q27RemoveElement {
    public int removeElement(int[] nums, int val) {
        int amount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                amount++;
            } else {
                nums[i - amount] = nums[i];
            }
        }
        return nums.length - amount;
    }
}

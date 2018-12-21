import java.util.Stack;

public class Q456132Pattern {
    public boolean find132pattern(int[] nums) {
        int l = nums.length;
        if (l <= 2) return false;
        Stack<Integer> stack = new Stack();
        int third = Integer.MIN_VALUE;
        for (int i = l - 1; i >= 0; i--) {
            if (nums[i] < third) return true;
            while (!stack.empty() && nums[i] > stack.peek()) {
                third = stack.pop();
            }
            stack.add(nums[i]);
        }
        return false;
    }
}
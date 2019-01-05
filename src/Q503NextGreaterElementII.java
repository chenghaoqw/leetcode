import java.util.Stack;

public class Q503NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        int len = nums.length;
        if (len <= 0) return new int[0];
        int[] ret = new int[len];
        Stack<Integer> stack = new Stack();
        for (int i = 2 * len - 1; i >= 0; i--) {
            while (!stack.empty() && stack.peek() <= nums[i % len]) stack.pop();
            ret[i % len] = stack.empty() ? -1 : stack.peek();
            stack.add(nums[i % len]);
        }
        return ret;
    }
}
import java.util.Arrays;

public class Q654MaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0) return null;
        int max = Integer.MIN_VALUE;
        for (int i : nums) max = Math.max(max, i);
        int index = 0;
        for (; index < nums.length; index++) if (nums[index] == max) break;
        TreeNode node = new TreeNode(nums[index]);
        node.left = constructMaximumBinaryTree(Arrays.copyOfRange(nums, 0, index));
        node.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums, index + 1, nums.length));
        return node;
    }
}
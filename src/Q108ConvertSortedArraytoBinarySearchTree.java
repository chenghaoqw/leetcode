public class Q108ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    public TreeNode sortedArrayToBST(int[] nums, int l, int r) {
        if (l > r) return null;
        int mid = l + (r - l + 1) / 2;
        TreeNode t = new TreeNode(nums[mid]);
        t.left = sortedArrayToBST(nums, l, mid - 1);
        t.right = sortedArrayToBST(nums, mid + 1, r);
        return t;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}

public class Q209ConvertSortedListtoBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        ListNode cur = head;
        int sum = 0;
        while (cur != null) {
            sum++;
            cur = cur.next;
        }
        return rec(head, 0, sum - 1);
    }

    public TreeNode rec(ListNode node, int start, int end) {
        if (end < start) return null;
        int mid = (end + start + 1) / 2;
        ListNode cur = node;
        int count = start;
        while (count < mid) {
            count++;
            cur = cur.next;
        }
        TreeNode root = new TreeNode(cur.val);
        root.left = rec(node, start, mid - 1);
        root.right = rec(cur.next, mid + 1, end);
        return root;
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

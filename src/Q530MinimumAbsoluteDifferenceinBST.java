public class Q530MinimumAbsoluteDifferenceinBST {
    List<Integer> list = new ArrayList();

    public int getMinimumDifference(TreeNode root) {
        ref(root);

        if (list.size() <= 1) {
            return -1;
        }

        int r = list.get(1) - list.get(0);

        for (int i = 2; i < list.size(); i++) {
            r = Math.min(list.get(i) - list.get(i - 1), r);
        }

        return r;
    }

    public void ref(TreeNode root) {
        if (root.left != null) {
            ref(root.left);
        }

        list.add(root.val);

        if (root.right != null) {
            ref(root.right);
        }
    }
}

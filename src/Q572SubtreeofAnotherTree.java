public class Q572SubtreeofAnotherTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        }

        return check(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    public boolean check(TreeNode s, TreeNode t) {
        if ((s == null) && (t == null)) {
            return true;
        }

        if (((s == null) && (t != null)) || ((s != null) && (t == null))) {
            return false;
        }

        return (s.val == t.val) && check(t.left, s.left) &&
        check(s.right, t.right);
    }
}

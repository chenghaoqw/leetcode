import java.util.ArrayList;
import java.util.List;

public class Q783MinimumDistanceBetweenBSTNodes {
    List<Integer> list = new ArrayList();

    public int minDiffInBST(TreeNode root) {
        ref(root);
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            ans = Math.min(ans, list.get(i) - list.get(i - 1));
        }
        return ans;
    }

    public void ref(TreeNode root) {
        if (root == null) return;
        ref(root.left);
        list.add(root.val);
        ref(root.right);
    }
}
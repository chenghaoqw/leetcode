import java.util.ArrayList;
import java.util.List;

public class Q897IncreasingOrderSearchTree {
    List<TreeNode> list = new ArrayList();

    public TreeNode increasingBST(TreeNode root) {
        ref(root);
        if (list.size() <= 0) return null;
        for (int i = 0; i < list.size(); i++) {
            TreeNode cur = list.get(i);
            cur.left = null;
            if (list.size() == i + 1) {
                cur.right = null;
            } else {
                cur.right = list.get(i + 1);
            }
        }
        return list.get(0);
    }

    public void ref(TreeNode root) {
        if (root == null) return;
        ref(root.left);
        list.add(root);
        ref(root.right);
    }

}
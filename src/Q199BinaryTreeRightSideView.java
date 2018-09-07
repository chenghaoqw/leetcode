import java.util.ArrayList;
import java.util.List;

public class Q199BinaryTreeRightSideView {
    List<Integer> list = new ArrayList();

    public List<Integer> rightSideView(TreeNode root) {
        ref(root, 1);
        return list;
    }

    public void ref(TreeNode root, int deep) {
        if (root == null) return;
        if (list.size() >= deep) list.set(deep - 1, root.val);
        else list.add(root.val);
        ref(root.left, deep + 1);
        ref(root.right, deep + 1);
    }
}
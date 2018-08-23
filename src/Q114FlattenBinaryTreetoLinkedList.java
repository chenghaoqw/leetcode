import java.util.ArrayList;
import java.util.List;

public class Q114FlattenBinaryTreetoLinkedList {
    List<TreeNode> list = new ArrayList();

    public void flatten(TreeNode root) {
        ref(root);
        TreeNode head = root;
        for (int i = 1; i < list.size(); i++) {
            root.left = null;
            root.right = list.get(i);
            root = root.right;
        }
    }

    public void ref(TreeNode root) {
        if (root == null) return;
        list.add(root);
        ref(root.left);
        ref(root.right);
    }
}
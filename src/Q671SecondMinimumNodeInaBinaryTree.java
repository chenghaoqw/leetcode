import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q671SecondMinimumNodeInaBinaryTree {
    List<Integer> list = new ArrayList();

    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) return -1;
        ref(root);
        Collections.sort(list);
        if (list.size() >= 2) return list.get(1);
        else return -1;
    }

    public void ref(TreeNode root) {
        if (root == null) return;
        if (!list.contains(root.val)) list.add(root.val);
        ref(root.left);
        ref(root.right);
    }
}

import java.util.ArrayList;
import java.util.List;

public class Q872LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList();
        List<Integer> list2 = new ArrayList();
        ref(root1, list1);
        ref(root2, list2);
        return list1.equals(list2);
    }

    public void ref(TreeNode root, List<Integer> list) {
        if (root == null) return;
        if (root.left == null && root.right == null) list.add(root.val);
        else {
            ref(root.left, list);
            ref(root.right, list);
        }
    }
}
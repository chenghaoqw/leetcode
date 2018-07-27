import java.util.ArrayList;
import java.util.List;

public class Q501FindModeinBinarySearchTree {
    List<Integer> list = new ArrayList<>();
    int pre = -1;
    int precount = 0;
    int max = 0;

    public int[] findMode(TreeNode root) {
        findMode1(root);
        int[] r = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            r[i] = list.get(i);
        }
        return r;
    }

    public void findMode1(TreeNode root) {
        if (root == null) return;
        findMode1(root.left);
        if (root.val == pre) {
            precount++;
        } else {
            precount = 1;
            pre = root.val;
        }
        if (precount == max && !list.contains(root.val)) {
            list.add(root.val);
        } else if (precount > max) {
            list = new ArrayList();
            max = precount;
            list.add(root.val);
        }
        findMode1(root.right);
    }
}

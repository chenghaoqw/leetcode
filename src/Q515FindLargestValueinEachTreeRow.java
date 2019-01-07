import java.util.ArrayList;
import java.util.List;

public class Q515FindLargestValueinEachTreeRow {
    List<Integer> ret = new ArrayList();

    public List<Integer> largestValues(TreeNode root) {
        ref(root, 0);
        return ret;
    }

    public void ref(TreeNode root, int deep) {
        if (root == null) return;
        if (ret.size() <= deep) ret.add(root.val);
        else ret.set(deep, Math.max(root.val, ret.get(deep)));
        ref(root.left, deep + 1);
        ref(root.right, deep + 1);
    }
}
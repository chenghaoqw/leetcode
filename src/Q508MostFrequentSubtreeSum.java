import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q508MostFrequentSubtreeSum {
    HashMap<Integer, Integer> map = new HashMap();
    int count = 0;

    public int[] findFrequentTreeSum(TreeNode root) {
        List<Integer> list = new ArrayList();
        ref(root);
        for (int i : map.keySet()) {
            if (map.get(i) == count) list.add(i);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public int ref(TreeNode root) {
        int r = 0;
        if (root == null) return r;
        r += ref(root.left);
        r += ref(root.right);
        r += root.val;
        if (map.containsKey(r)) map.put(r, map.get(r) + 1);
        else map.put(r, 1);
        count = Math.max(map.get(r), count);
        return r;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}

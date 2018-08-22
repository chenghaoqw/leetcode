import java.util.ArrayList;
import java.util.List;

public class Q113PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList();
        if (root == null) return result;
        if (sum == root.val && root.left == null && root.right == null) {
            List<Integer> list = new ArrayList();
            list.add(root.val);
            result.add(list);
        }
        List<List<Integer>> left = pathSum(root.left, sum - root.val);
        List<List<Integer>> right = pathSum(root.right, sum - root.val);
        for (List<Integer> list : left) {
            list.add(0, root.val);
            result.add(list);
        }
        for (List<Integer> list : right) {
            list.add(0, root.val);
            result.add(list);
        }
        return result;
    }
}
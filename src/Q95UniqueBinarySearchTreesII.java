import java.util.ArrayList;
import java.util.List;

public class Q95UniqueBinarySearchTreesII {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList();
        return generateTrees(1, n);
    }

    public List<TreeNode> generateTrees(int start, int end) {
        List<TreeNode> list = new ArrayList();
        if (-1 == end - start) {
            list.add(null);
            return list;
        }
        for (int i = start; i <= end; i++) {
            for (TreeNode node1 : generateTrees(start, i - 1)) {
                for (TreeNode node2 : generateTrees(i + 1, end)) {
                    TreeNode n = new TreeNode(i);
                    n.left = node1;
                    n.right = node2;
                    list.add(n);
                }
            }
        }
        return list;
    }
}
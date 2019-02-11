import java.util.HashMap;

public class Q662MaximumWidthofBinaryTree {
    int ans;
    HashMap<Integer, Integer> map = new HashMap();

    public int widthOfBinaryTree(TreeNode root) {
        dfs(root, 0, 0);
        return ans;
    }

    public void dfs(TreeNode node, int depth, int pos) {
        if (node == null) return;
        map.putIfAbsent(depth, pos);
        ans = Math.max(pos - map.get(depth) + 1, ans);
        dfs(node.left, depth + 1, pos * 2);
        dfs(node.right, depth + 1, pos * 2 + 1);
    }
}
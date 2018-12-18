import java.util.LinkedList;
import java.util.Queue;

public class Q449SerializeandDeserializeBST {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "$,";
        return root.val + "," + serialize(root.left) + serialize(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> q = new LinkedList();
        String[] array = data.split("\\,");
        for (String s : array) q.add(s);
        return dfs(q);
    }

    public TreeNode dfs(Queue<String> q) {
        String s = q.poll();
        if ("$".equals(s)) return null;
        TreeNode root = new TreeNode(Integer.valueOf(s));
        root.left = dfs(q);
        root.right = dfs(q);
        return root;
    }
}
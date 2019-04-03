import java.util.ArrayList;
import java.util.List;

public class Q863AllNodesDistanceKinBinaryTree {
    ST targetNode;
    TreeNode t;
    List<Integer> list = new ArrayList();

    class ST {
        TreeNode node;
        ST parent;
        ST left;
        ST right;

        public ST(TreeNode p) {
            this.node = p;
        }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        t = target;
        helper(root, null);
        dfs(targetNode, null, K);
        return list;
    }

    public ST helper(TreeNode node, ST parent) {
        if (node == null) return null;
        ST st = new ST(node);
        st.left = helper(node.left, st);
        st.right = helper(node.right, st);
        st.parent = parent;
        if (node == t) targetNode = st;
        return st;
    }

    public void dfs(ST node, ST pre, int target) {
        if (node == null) return;
        if (target == 0) list.add(node.node.val);
        if (node.left != pre) dfs(node.left, node, target - 1);
        if (node.right != pre) dfs(node.right, node, target - 1);
        if (node.parent != pre) dfs(node.parent, node, target - 1);
    }
}
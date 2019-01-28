import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q655PrintBinaryTree {
    List<List<String>> list = new ArrayList();
    int h = 0;

    public List<List<String>> printTree(TreeNode root) {
        if (root == null) return list;
        Stack<TreeNode> stack = new Stack();
        stack.add(root);
        while (!stack.isEmpty()) {
            h++;
            Stack<TreeNode> stack1 = new Stack();
            while (!stack.isEmpty()) {
                TreeNode node = stack.pop();
                if (node.left != null) stack1.add(node.left);
                if (node.right != null) stack1.add(node.right);
            }
            stack = stack1;
        }
        helper(root, ((int) Math.pow(2, h) - 2) / 2, 0);
        return list;
    }

    public void helper(TreeNode root, int index, int deep) {
        if (root == null) return;
        if (list.size() <= deep) {
            List<String> t = new ArrayList();
            for (int t1 = 0; t1 < (int) (Math.pow(2, h)) - 1; t1++) {
                t.add("");
            }
            list.add(t);
        }
        list.get(deep).set(index, root.val + "");
        helper(root.left, index - (int) Math.pow(2, h - deep - 2), deep + 1);
        helper(root.right, index + (int) Math.pow(2, h - deep - 2), deep + 1);
    }
}
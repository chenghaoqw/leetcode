import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q103BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList();
        if (root == null) return result;
        Stack<TreeNode> stack1 = new Stack();
        stack1.add(root);
        int i = 0;
        while (!stack1.isEmpty()) {
            List<Integer> list = new ArrayList();
            Stack<TreeNode> stack2 = new Stack();
            i++;
            while (!stack1.isEmpty()) {
                TreeNode node = stack1.pop();
                if (i % 2 == 1) {
                    if (node.left != null) stack2.add(node.left);
                    if (node.right != null) stack2.add(node.right);
                } else {
                    if (node.right != null) stack2.add(node.right);
                    if (node.left != null) stack2.add(node.left);
                }
                list.add(node.val);
            }
            result.add(list);
            stack1 = stack2;
        }
        return result;
    }
}

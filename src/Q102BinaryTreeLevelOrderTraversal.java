import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q102BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList();
        if (root == null) return result;
        Queue<TreeNode> stack1 = new LinkedList();
        stack1.offer(root);
        while (!stack1.isEmpty()) {
            List<Integer> list = new ArrayList();
            Queue<TreeNode> stack2 = new LinkedList();
            while (!stack1.isEmpty()) {
                TreeNode node = stack1.poll();
                if (node.left != null) stack2.offer(node.left);
                if (node.right != null) stack2.offer(node.right);
                list.add(node.val);
            }
            result.add(list);
            stack1 = stack2;
        }
        return result;
    }
}

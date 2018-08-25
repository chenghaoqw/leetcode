import java.util.LinkedList;
import java.util.Queue;

public class Q117PopulatingNextRightPointersinEachNodeII {
    public void connect(TreeLinkNode root) {
        if (root == null) return;
        Queue<TreeLinkNode> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeLinkNode next = null;
            Queue<TreeLinkNode> queue1 = new LinkedList();
            while (!queue.isEmpty()) {
                TreeLinkNode node = queue.poll();
                if (node.right != null) queue1.offer(node.right);
                if (node.left != null) queue1.offer(node.left);
                node.next = next;
                next = node;
            }
            queue = queue1;
        }
    }
}

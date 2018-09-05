import java.util.Stack;

public class Q173BinarySearchTreeIterator {
    Stack<TreeNode> stack = new Stack();

    public Q173BinarySearchTreeIterator(TreeNode root) {
        while (root != null) {
            stack.add(root);
            root = root.left;
        }
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return !stack.empty();
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        TreeNode node = stack.pop();
        int ret = node.val;
        if (node.right != null) {
            node = node.right;
            while (node != null) {
                stack.add(node);
                node = node.left;
            }
        }
        return ret;
    }
}
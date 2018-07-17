
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

public class Q412NaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;
        Stack<Node> stack = new Stack();
        stack.add(root);
        while (!stack.isEmpty()) {
            Stack<Node> stack1 = new Stack();
            List<Integer> l = new ArrayList();
            for (Node item : stack) {
                l.add(item.val);
                for (Node node : item.children) {
                    stack1.add(node);
                }
            }
            list.add(l);
            stack = stack1;
        }
        return list;
    }
}

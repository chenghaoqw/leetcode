public class Q590NaryTreePostorderTraversal {
    List<Integer> list = new ArrayList();

    public List<Integer> postorder(Node root) {
        if (root == null) {
            return list;
        }

        for (Node item : root.children) {
            postorder(item);
        }

        list.add(root.val);

        return list;
    }
}

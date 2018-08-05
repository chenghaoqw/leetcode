public class Q589NaryTreePreorderTraversal {
    List<Integer> list = new ArrayList();

    public List<Integer> preorder(Node root) {
        if (root == null) {
            return list;
        }

        list.add(root.val);

        for (Node item : root.children) {
            preorder(item);
        }

        return list;
    }
}

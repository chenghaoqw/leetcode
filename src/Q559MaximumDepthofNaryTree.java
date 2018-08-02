public class Q559MaximumDepthofNaryTree {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        int max = 0;

        for (Node item : root.children) {
            max = Math.max(max, maxDepth(item));
        }

        return max + 1;
    }
}

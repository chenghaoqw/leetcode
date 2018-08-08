public class Q637AverageofLevelsinBinaryTree {
    Stack<TreeNode> stack1 = new Stack();
    Stack<TreeNode> stack2 = new Stack();

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList();
        stack1.add(root);

        while (!stack1.isEmpty()) {
            long sum = 0;
            int count = 0;

            while (!stack1.isEmpty()) {
                TreeNode node = stack1.pop();
                count++;
                sum += node.val;

                if (node.left != null) {
                    stack2.add(node.left);
                }

                if (node.right != null) {
                    stack2.add(node.right);
                }
            }

            stack1 = stack2;
            stack2 = new Stack();
            list.add((double) sum / (double) count);
        }

        return list;
    }
}

public class Q785IsGraphBipartite {
    public boolean isBipartite(int[][] graph) {
        int[] root = new int[graph.length + 1];
        for (int i = 0; i < graph.length; i++) root[i] = i;
        for (int i = 0; i < graph.length; i++) {
            int[] a = graph[i];
            if (a.length <= 0) continue;
            int x = find(root, i);
            int yp = find(root, a[0]);
            if (x == yp) return false;
            for (int j = 1; j < a.length; j++) {
                int y = find(root, a[j]);
                if (x == y) {
                    return false;
                }
                root[y] = yp;
            }
        }
        return true;
    }

    public int find(int[] root, int i) {
        return root[i] == i ? i : find(root, root[i]);
    }
}
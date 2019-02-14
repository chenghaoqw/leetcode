public class Q684RedundantConnection {
    public int[] findRedundantConnection(int[][] edges) {
        int[] to = new int[2001];
        for (int[] edge : edges) {
            int x = find(to, edge[0]);
            int y = find(to, edge[1]);
            if (x == y) return edge;
            to[x] = y;
        }
        return new int[]{};
    }

    public int find(int[] to, int a) {
        while (to[a] != -0) a = to[a];
        return a;
    }
}
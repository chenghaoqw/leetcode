public class Q743NetworkDelayTime {
    public int networkDelayTime(int[][] times, int N, int K) {
        int[] dist = new int[N + 1];
        for (int i = 1; i <= N; i++) dist[i] = Integer.MAX_VALUE;
        dist[K] = 0;
        for (int i = 0; i < N; i++) {
            for (int[] time : times) {
                int u = time[0];
                int v = time[1];
                int w = time[2];
                if (dist[u] != Integer.MAX_VALUE && dist[v] > dist[u] + w) dist[v] = dist[u] + w;
            }
        }
        int max = 0;
        for (int i : dist) max = Math.max(max, i);
        return max == Integer.MAX_VALUE ? -1 : max;
    }
}
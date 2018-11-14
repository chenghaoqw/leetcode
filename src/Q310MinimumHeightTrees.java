import java.util.ArrayList;
import java.util.List;

public class Q310MinimumHeightTrees {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        int[] in = new int[n];
        List<Integer> ret = new ArrayList();
        for (int i = 0; i < n; i++) {
            ret.add(i);
        }
        ArrayList<Integer>[] lists = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            lists[i] = new ArrayList();
        }
        for (int i = 0; i < edges.length; i++) {
            lists[edges[i][0]].add(edges[i][1]);
            lists[edges[i][1]].add(edges[i][0]);
            in[edges[i][0]]++;
            in[edges[i][1]]++;
        }
        while (ret.size() > 2) {
            int[] in1 = new int[n];
            for (int i = 0; i < n; i++) in1[i] = in[i];
            for (int i = 0; i < in.length; i++) {
                if (in[i] == 1) {
                    for (int j : lists[i]) {
                        in1[j]--;
                    }
                    in1[i] = 0;
                    ret.remove(ret.indexOf(i));
                }

            }
            in = in1;
        }
        return ret;
    }
}
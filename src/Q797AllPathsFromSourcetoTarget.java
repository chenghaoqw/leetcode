import java.util.ArrayList;
import java.util.List;

public class Q797AllPathsFromSourcetoTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        return helper(graph, 0);
    }

    public List<List<Integer>> helper(int[][] graph, int node) {
        int l = graph.length;
        List<List<Integer>> ans = new ArrayList();
        if (node == l - 1) {
            List<Integer> path = new ArrayList();
            path.add(l - 1);
            ans.add(path);
            return ans;
        }
        for (int i : graph[node]) {
            for (List<Integer> path : helper(graph, i)) {
                path.add(0, node);
                ans.add(path);
            }
        }
        return ans;
    }
}
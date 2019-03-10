import java.util.*;

public class Q802FindEventualSafeStates {
    List<Integer> list = new ArrayList();

    public List<Integer> eventualSafeNodes(int[][] graph) {
        int l = graph.length;
        boolean[] safe = new boolean[l];
        List<Set<Integer>> g = new ArrayList();
        List<Set<Integer>> r = new ArrayList();
        for (int i = 0; i < l; i++) {
            g.add(new TreeSet());
            r.add(new TreeSet());
        }
        Queue<Integer> queue = new LinkedList();
        for (int i = 0; i < l; i++) {
            if (graph[i].length == 0)
                queue.add(i);
            for (int j : graph[i]) {
                g.get(i).add(j);
                r.get(j).add(i);
            }
        }
        while (!queue.isEmpty()) {
            int j = queue.poll();
            safe[j] = true;
            for (int i : r.get(j)) {
                g.get(i).remove(j);
                if (g.get(i).isEmpty())
                    queue.add(i);
            }
        }
        List<Integer> ans = new ArrayList();
        for (int i = 0; i < l; ++i)
            if (safe[i])
                ans.add(i);

        return ans;
    }
}
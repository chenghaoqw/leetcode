import java.util.*;

public class Q133CloneGraph {
    HashMap<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap();

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) return null;
        Queue<UndirectedGraphNode> queue1 = new LinkedList();
        Queue<UndirectedGraphNode> queue2 = new LinkedList();
        UndirectedGraphNode cur = new UndirectedGraphNode(node.label);
        map.put(node, cur);
        queue1.add(node);
        queue2.add(cur);
        while (!queue1.isEmpty()) {
            UndirectedGraphNode n1 = queue1.poll();
            UndirectedGraphNode n2 = queue2.poll();
            List<UndirectedGraphNode> neighbors = new ArrayList();
            for (UndirectedGraphNode item : n1.neighbors) {
                UndirectedGraphNode n3;
                if (!map.containsKey(item)) {
                    n3 = new UndirectedGraphNode(item.label);
                    queue1.add(item);
                    queue2.add(n3);
                    map.put(item, n3);
                } else {
                    n3 = map.get(item);
                }
                neighbors.add(n3);
            }
            n2.neighbors = neighbors;
        }
        return cur;
    }

    class UndirectedGraphNode {
        int label;
        List<UndirectedGraphNode> neighbors;

        UndirectedGraphNode(int x) {
            label = x;
            neighbors = new ArrayList<UndirectedGraphNode>();
        }
    }
}
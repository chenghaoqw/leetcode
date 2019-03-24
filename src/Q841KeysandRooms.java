import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class Q841KeysandRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> set = new HashSet();
        Stack<Integer> stack = new Stack();
        stack.push(0);
        set.add(0);
        while (!stack.isEmpty()) {
            int node = stack.pop();
            for (int key : rooms.get(node)) {
                if (!set.contains(key)) {
                    stack.push(key);
                    set.add(key);
                }
            }
        }
        return set.size() == rooms.size();
    }
}

import java.util.List;
import java.util.Stack;

public class Q636ExclusiveTimeofFunctions {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] ret = new int[n];
        if (logs.size() <= 0) return ret;
        Stack<Integer> stack = new Stack();
        String[] s = logs.get(0).split(":");
        stack.add(Integer.parseInt(s[0]));
        int prev = Integer.parseInt(s[2]);
        for (int i = 1; i < logs.size(); i++) {
            s = logs.get(i).split(":");
            if (s[1].equals("start")) {
                if (!stack.isEmpty())
                    ret[stack.peek()] += Integer.parseInt(s[2]) - prev;
                prev = Integer.parseInt(s[2]);
                stack.add(Integer.parseInt(s[0]));
            } else {
                ret[stack.peek()] += Integer.parseInt(s[2]) - prev + 1;
                prev = Integer.parseInt(s[2]) + 1;
                stack.pop();
            }
        }
        return ret;
    }
}
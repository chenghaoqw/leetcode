import java.util.ArrayList;
import java.util.Stack;

public class Q210CourseScheduleII {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] in = new int[numCourses];
        int[] ret = new int[numCourses];
        int count = 0;
        ArrayList<Integer>[] lists = new ArrayList[numCourses];
        for (int i = 0; i < in.length; i++) {
            lists[i] = new ArrayList();
        }
        for (int i = 0; i < prerequisites.length; i++) {
            lists[prerequisites[i][1]].add(prerequisites[i][0]);
            in[prerequisites[i][0]]++;
        }
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < in.length; i++) {
            if (in[i] == 0) {
                stack.add(i);
                ret[count] = i;
                count++;
            }
        }
        while (!stack.isEmpty()) {
            int index = stack.pop();
            for (int i : lists[index]) {
                in[i]--;
                if (in[i] == 0) {
                    stack.add(i);
                    ret[count] = i;
                    count++;
                }
            }
        }
        for (int i = 0; i < in.length; i++) {
            if (in[i] > 0) return new int[0];
        }
        return ret;
    }
}
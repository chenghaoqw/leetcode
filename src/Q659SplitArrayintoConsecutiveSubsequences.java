import java.util.HashMap;
import java.util.PriorityQueue;

public class Q659SplitArrayintoConsecutiveSubsequences {
    public boolean isPossible(int[] nums) {
        int count = 0;
        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap();
        for (int i : nums) {
            PriorityQueue<Integer> queue = new PriorityQueue();
            map.put(i, queue);
        }
        for (int num : nums) {
            if (!map.containsKey(num - 1) || map.get(num - 1).isEmpty()) {
                map.get(num).add(1);
                count++;
            } else {
                int len = map.get(num - 1).poll();
                len++;
                map.get(num).add(len);
                if (len == 3) count--;
            }
        }
        System.out.print(count);
        return count == 0;
    }
}
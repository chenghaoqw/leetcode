import java.util.HashSet;
import java.util.Set;

public class Q817LinkedListComponents {
    public int numComponents(ListNode head, int[] G) {
        Set<Integer> set = new HashSet();
        int ret = 0;
        for (int i : G) set.add(i);
        ListNode cur = head;
        while (cur != null) {
            if (set.contains(cur.val) && (cur.next == null || !set.contains(cur.next.val)))
                ret++;
            cur = cur.next;
        }
        return ret;
    }
}
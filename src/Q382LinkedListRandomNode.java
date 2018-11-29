import java.util.Random;

public class Q382LinkedListRandomNode {
    /**
     * @param head The linked list's head.
     * Note that the head is guaranteed to be not null, so it contains at least one node.
     */
    ListNode head;
    int count = 0;

    public Q382LinkedListRandomNode(ListNode head) {
        this.head = head;
        ListNode cur = head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
    }

    /**
     * Returns a random node's value.
     */
    public int getRandom() {
        int ran = new Random().nextInt(count);
        ListNode cur = head;
        for (int i = 0; i < ran; i++) {
            cur = cur.next;
        }
        return cur.val;
    }
}
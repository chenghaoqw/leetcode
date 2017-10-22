public class Q19removeNthFromEnd {

    static int count;

    public Q19removeNthFromEnd() {
        count = 1;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        head.next = removeNthFromEnd(head.next, n);
        if (count == n) {
            head = head.next;
        }
        count++;
        return head;
    }
}

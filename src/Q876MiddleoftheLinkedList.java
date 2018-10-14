public class Q876MiddleoftheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode cur = head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        count /= 2;
        cur = head;
        while (cur != null && count > 0) {
            count--;
            cur = cur.next;
        }
        return cur;
    }
}
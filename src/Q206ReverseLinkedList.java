public class Q206ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode pre=null;
        while(head!=null){
            ListNode n=head.next;
            head.next=pre;
            pre=head;
            head=n;
        }
        return pre;
    }
}

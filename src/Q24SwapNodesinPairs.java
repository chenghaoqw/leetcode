public class Q24SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode r=null;
        if(head==null) return r;
        if(head.next==null) return head;
        r=head.next;
        head.next=r.next;
        r.next=head;
        while(head.next!=null && head.next.next!=null){
            ListNode first=head.next;
            ListNode second=head.next.next;
            first.next=second.next;
            second.next=first;
            head.next=second;
            head=first;
        }
        return r;
    }
}

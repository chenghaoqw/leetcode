public class Q142LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode one=head;
        ListNode two=head;
        while(two!=null && two.next!=null){
            one=one.next;
            two=two.next.next;
            if(one==two){
                while(head!=two){
                    head=head.next;
                    two=two.next;
                }
                return head;
            }
        }
        return null;
    }
}

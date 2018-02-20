public class Q141LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode one=head;
        ListNode two=head.next;
        while(two!=null && two.next!=null){
            if(one==two) return true;
            one=one.next;
            two=two.next.next;

        }
        return false;
    }
}

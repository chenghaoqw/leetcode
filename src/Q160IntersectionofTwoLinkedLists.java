public class Q160IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        int l1=0;
        ListNode headA=head1;
        ListNode headB=head2;
        while(headA!=null)
        {
            headA=headA.next;
            l1++;
        }
        int l2=0;
        while(headB!=null) {
            l2++;
            headB=headB.next;
        }
        if(l1<l2){
            for(int i=0;i<l2-l1;i++){
                head2=head2.next;
            }
        }else if(l2<l1){
            for(int i=0;i<l1-l2;i++){
                head1=head1.next;
            }
        }
        while(head1!=null){
            if(head1==head2) return head1;
            head1=head1.next;
            head2=head2.next;
        }
        return null;
    }
}

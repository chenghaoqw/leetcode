public class Q203RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null){
            if(head.val==val) head=head.next;
            else break;
        }
        ListNode cur=head;
        while(cur!=null && cur.next!=null){
            ListNode n=cur.next;
            while(n!=null){
                if(n.val==val) n=n.next;
                else break;
            }
            cur.next=n;
            cur=cur.next;
        }
        return head;
    }
}

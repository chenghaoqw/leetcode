public class Q83RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode cur=head;
        while(cur!=null && cur.next!=null){
            ListNode temp=cur.next;
            while(temp!=null)
                if(temp.val==cur.val){
                    cur.next=temp.next;
                    temp=temp.next;
                }else break;
            cur=cur.next;
        }
        return head;
    }
}

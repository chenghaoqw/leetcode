public class Q82RemoveDuplicatesfromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        boolean isFirst=true;
        ListNode trueHead=new ListNode(0);
        trueHead.next=head;
        ListNode cur=trueHead;
        while(cur!=null && cur.next!=null){
            int val=cur.next.val;
            if(cur.next.next!=null && cur.next.next.val==val){
                ListNode n=cur.next.next;
                while(n!=null && n.val==val) n=n.next;
                cur.next=n;
                continue;
            }
            cur=cur.next;
        }
        return trueHead.next;
    }
}

public class Q147InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        ListNode trueHead=new ListNode(0);
        ListNode cur=head;
        while(cur!=null){
            ListNode n=cur.next;
            ListNode n1=trueHead;
            while(n1!=null){
                if(n1.next==null || n1.next.val>cur.val){
                    ListNode next=n1.next;
                    n1.next=cur;
                    n1.next.next=next;
                    break;
                }
                n1=n1.next;
            }
            cur=n;
        }
        return trueHead.next;
    }
}

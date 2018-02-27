public class Q92ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode trueHead=new ListNode(0);
        trueHead.next=head;
        ListNode top=trueHead;
        ListNode cur=trueHead;
        ListNode pre=null;
        int count=0;
        while(cur!=null){
            ListNode next=cur.next;
            if(count==m-1) top=cur;
            if(count>m){
                cur.next=pre;
            }
            if(count>=n) {
                top.next.next=next;
                top.next=cur;
                break;
            }
            count++;
            pre=cur;
            cur=next;
        }
        return trueHead.next;
    }
}

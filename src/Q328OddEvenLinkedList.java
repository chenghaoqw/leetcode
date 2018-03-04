public class Q328OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd=new ListNode(0);
        ListNode even=new ListNode(0);
        ListNode oddCur=odd,evenCur=even,cur=head;
        int count=0;
        while(cur!=null){
            count++;
            ListNode next=cur.next;
            if(count%2==1) {
                oddCur.next=cur;
                oddCur=cur;
            }else {
                evenCur.next=cur;
                evenCur=cur;
            }
            cur.next=null;
            cur=next;
        }
        oddCur.next=even.next;
        return odd.next;
    }
}

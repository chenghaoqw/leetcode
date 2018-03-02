public class Q143ReorderList {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        ListNode cur=head;
        int sum=0,count=0;
        while(cur!=null){
            sum++;
            cur=cur.next;
        }
        sum--;
        cur=head.next;
        ListNode pre=null;
        ListNode two=null;
        while(cur!=null){
            ListNode next=cur.next;
            count++;
            if(count>sum/2){
                cur.next=pre;
                pre=cur;
            }
            if(next==null) two=cur;
            cur=next;
        }
        ListNode one=head.next;
        head.next=two;
        while(two!=null && one!=null){
            ListNode oneNext=one.next;
            ListNode twoNext=two.next;
            two.next=one;
            one.next=twoNext;
            one=oneNext;
            two=twoNext;
        }
    }
}

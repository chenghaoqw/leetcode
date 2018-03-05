public class Q445AddTwoNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode trueHead=null;
        ListNode r=null;
        ListNode h1=reverse(l1);
        ListNode h2=reverse(l2);
        int carry=0;
        int v1=0,v2=0;
        while(h1!=null || h2!=null || carry>0){
            if(h1==null) v1=0;
            else v1=h1.val;
            if(h2==null) v2=0;
            else v2=h2.val;
            int sum=v1+v2+carry;
            if(sum>=10) carry=1;
            else carry=0;
            ListNode n=new ListNode(sum%10);
            if(trueHead==null)
            {trueHead=n;
                r= n;
            }
            else {
                trueHead.next=n;
                trueHead=n;
            }
            if(h1!=null) h1=h1.next;
            if(h2!=null) h2=h2.next;
        }
        return reverse(r);
    }

    ListNode reverse(ListNode head){
        ListNode pre=null;
        while(head!=null){
            ListNode next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }
}

public class Q61RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head==null) return head;
        ListNode cur=head;
        int sum=0;
        ListNode tail=null;
        while(cur!=null){
            sum++;
            if(cur.next==null) tail = cur;
            cur=cur.next;
        }
        k=k%sum;
        cur=head;
        int count=0;
        while(cur!=null){
            count++;
            if(count==sum-k){
                tail.next=head;
                ListNode trueHead=cur.next;
                cur.next=null;
                return trueHead;
            }
            cur=cur.next;
        }
        return head;
    }
}

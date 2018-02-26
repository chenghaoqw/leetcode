public class Q86PartitionList {
    public ListNode partition(ListNode head, int x) {
        if(head==null) return null;
        ListNode small=new ListNode(0);
        ListNode smallHead=small;
        ListNode big=new ListNode(x);
        ListNode bigHead=big;
        small.next=big;
        ListNode cur=head;
        while(cur!=null){
            if(cur.val<x){
                ListNode next=cur.next;
                small.next=cur;
                small=small.next;
                small.next=bigHead;
                cur=next;
            }else{
                big.next=cur;
                big=big.next;
                ListNode next=cur.next;
                cur.next=null;
                cur=next;
            }
        }
        cur=smallHead;
        while(cur!=null && cur.next!=null){
            if(cur.next.val==x) {
                cur.next=cur.next.next;
                break;
            }
            cur=cur.next;
        }
        return smallHead.next;
    }
}

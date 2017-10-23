public class Q21mergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode cur=new ListNode(0);
        ListNode temp=cur;
        while(l2!=null && l1!=null){
            temp.next=new ListNode(0);
            if(l2.val<l1.val){
                temp.next.val=l2.val;
                l2=l2.next;
            }else{
                temp.next.val=l1.val;
                l1=l1.next;
            }
            temp=temp.next;
        }
        if(l1!=null){
            temp.next=l1;
        }
        if(l2!=null){
            temp.next=l2;
        }
        return cur.next;
    }
}

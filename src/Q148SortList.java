public class Q148SortList {
    public ListNode sortList(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        int sum=0;
        ListNode cur=head;
        while(cur!=null){
            sum++;
            cur=cur.next;
        }
        int mid=sum/2;
        cur=head;
        int count=0;
        ListNode left=null;
        ListNode right=null;
        while(cur!=null){
            ListNode next=cur.next;
            count++;
            if(count==1 &&  count<=mid) left=head;
            if(count==mid) cur.next=null;
            if(count==mid+1) right=cur;
            cur=next;
        }
        left=sortList(left);
        right=sortList(right);
        ListNode trueHead=new ListNode(0);
        cur=trueHead;
        while(left!=null || right!=null){
            if(left!=null && right!=null){
                if(left.val<=right.val){
                    cur.next=left;
                    left=left.next;
                }else {
                    cur.next=right;
                    right=right.next;
                }
            }else if(left==null) {
                cur.next=right;
                right=right.next;
            }else if(right==null){
                cur.next=left;
                left=left.next;
            }
            cur=cur.next;
        }
        return trueHead.next;
    }
}

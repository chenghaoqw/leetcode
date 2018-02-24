
public class Q234PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode cur=head;
        int count=0;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        cur=head;
        int sum=0;
        while(cur!=null && sum<count/2){
            cur=cur.next;
            sum++;
        }
        if(count%2==1) cur=cur.next;
        ListNode pre=null;
        while(cur!=null){
            ListNode n=cur.next;
            cur.next=pre;
            pre=cur;
            cur=n;
        }
        while(pre!=null){
            if(pre.val!=head.val) return false;
            pre=pre.next;
            head=head.next;
        }
        return true;
    }
}

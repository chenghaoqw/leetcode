public class Q725SplitLinkedListinParts {
    public ListNode[] splitListToParts(ListNode root, int k) {
        int sum=0;
        ListNode cur=root;
        while(cur!=null){
            sum++;
            cur=cur.next;
        }
        int part=(int)Math.ceil(sum/k);
        cur=root;
        ListNode[] r=new ListNode[k];
        for(int i=0;i<k && cur!=null;i++){
            ListNode n=new ListNode(0);
            n.next=cur;
            int extra=0;
            if(i<sum%k) extra=1;
            for(int j=0;j<part-1+extra && cur!=null;j++){
                cur=cur.next;
            }
            if(cur!=null){
                ListNode next=cur.next;
                cur.next=null;
                cur=next;
            }
            r[i]=n.next;
        }
        return r;
    }
}

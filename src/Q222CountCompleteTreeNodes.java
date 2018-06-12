
public class Q222CountCompleteTreeNodes {
    public int countNodes(Q94BinaryTreeInorderTraversal.TreeNode root) {
        if(root==null) return 0;
        int h=0;
        Q94BinaryTreeInorderTraversal.TreeNode cur=root;
        while(cur!=null){
            h++;
            cur=cur.left;
        }
        int l=0;
        int r=(int) Math.pow(2,h-1)-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            char[] c=Integer.toBinaryString(mid).toCharArray();
            cur=root;
            for(int i=0;i<h-1;i++){
                if(i+c.length<h-1) cur=cur.left;
                else if(c[c.length-h+i+1]=='1') cur=cur.right;
                else if(c[c.length-h+i+1]=='0') cur=cur.left;
            }
            if(cur==null)  r=mid-1;
            else l=mid+1;
        }
        return (int)Math.pow(2,h-1)+l-1;
    }
}

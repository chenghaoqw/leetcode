public class Q541ReverseStringII {
    public String reverseStr(String s, int k) {
        char[] c=s.toCharArray();
        int i=0;
        while(i<s.length()){
            if(i+2*k-1<=s.length()-1) {
                reverse(c,i,i+k-1);
                i=i+2*k;
            }
            else if(i+k-1>s.length()-1) {
                reverse(c,i,c.length-1);
                break;
            }else{
                reverse(c,i,i+k-1);
                i+=i+2*k;
            }
        }
        return new String(c);
    }

    void reverse(char[] c,int l,int r){
        for(int i=l;i<=(l+r)/2;i++){
            char t=c[i];
            c[i]=c[r+l-i];
            c[r+l-i]=t;
        }
    }
}

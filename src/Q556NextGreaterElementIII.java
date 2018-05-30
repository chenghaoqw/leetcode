import java.util.Arrays;

public class Q556NextGreaterElementIII {
    public int nextGreaterElement(int n) {
        String s=String.valueOf(n);
        int len=s.length();
        int index=len-2;
        for(;index>=0;index--) if(s.charAt(index)<s.charAt(index+1)) break;
        if(index==-1) return -1;
        char[] array=new char[len-index-1];
        int target=0;
        int extra=0;
        for(int i=len-1;i>=index;i--) {
            if(s.charAt(i)>s.charAt(index) && extra==0) {
                target=i;
                extra=1;
            }
            else array[len-1-i-extra]=s.charAt(i);
        }
        Arrays.sort(array);
        s=s.substring(0,index)+s.charAt(target)+new String(array);
        long r=Long.valueOf(s);
        return r>Integer.MAX_VALUE?-1:(int)r;
    }
}

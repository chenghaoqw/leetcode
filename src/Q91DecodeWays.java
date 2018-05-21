public class Q91DecodeWays {
    public int numDecodings(String s) {
        int l=s.length();
        if(l<=0) return 0;
        int[] r=new int[l+1];
        r[0]=1;
        if(s.charAt(0)>'0') r[1]=1;
        for(int i=1;i<l;i++){
            int left=s.charAt(i-1);
            int right=s.charAt(i);
            if(right>'0') r[i+1]=r[i];
            if((left-'0')*10+(right-'0')<=26 && left>'0') r[i+1]+=r[i-1];
        }
        return r[l];
    }
}

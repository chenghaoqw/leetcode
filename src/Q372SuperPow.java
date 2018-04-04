public class Q372SuperPow {
    public int superPow(int a, int[] b) {
        if(b.length==0) return 0;
        a%=1337;
        int ans=superPow(a,Integer.toBinaryString(b[0]));
        for(int i=1;i<b.length;i++){
            ans= superPow(ans,Integer.toBinaryString(10)) % 1337 * superPow(a,Integer.toBinaryString(b[i])) % 1337;
        }
        return ans;
    }

    public int superPow(int a,String b){
        int l=b.length();
        if(l==1) {
            if(b.charAt(0)=='0') return 1;
            else return a;
        }
        char c=b.charAt(l-1);
        String nb=b.substring(0,l-1);
        int t=superPow(a,nb);
        t=t*t%1337;
        if(c=='1') t=a*t%1337;
        return t;
    }
}

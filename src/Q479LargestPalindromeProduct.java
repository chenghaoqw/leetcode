public class Q479LargestPalindromeProduct {
    public int largestPalindrome(int n) {
        if(n==1)
            return 9;
        int max=(int)Math.pow(10,n)-1;
        for(int i=max;i>=0;i--){
            String s=new StringBuffer(i+"").reverse().toString();
            s=i+""+s;
            long l=Long.parseLong(s);
            for(long j=max;j*j>=l;j--){
                if(l % j==0) return (int)(l%1337);
            }
        }
        return 0;
    }
}

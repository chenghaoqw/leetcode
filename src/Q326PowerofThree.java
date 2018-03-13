public class Q326PowerofThree {
    public boolean isPowerOfThree(int n) {
        while(n>1){
            int sum=0;
            int t=n;
            while(t>0){
                sum+=t%10;
                t/=10;
            }
            if(sum % 3!=0) return false;
            n/=3;
        }
        if(n==1) return true;
        else return false;
    }
}

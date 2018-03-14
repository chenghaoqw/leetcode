public class Q400NthDigit {
    public int findNthDigit(int n) {
        int i=1;
        long extra=0;
        for(long sum=0;;i++){
            long t=sum;
            sum+=Math.pow(10,i-1)*9*i;
            if(sum==n) return 9;
            else if(sum>n){
                extra=n-t;
                break;
            }
        }
        int index=(int)extra/i;
        int s=(int)extra % i;
        if(s==0) return (getNight(i-1)+index) %10;
        else return (getNight(i-1)+index+1) / (int)Math.pow(10,i-s) %10;
    }

    int getNight(int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum*10+9;
        }
        return sum;
    }
}

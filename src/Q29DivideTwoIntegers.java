public class Q29DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        int p=1;
        int r=0;
        boolean push=false;
        if(divisor==0) return Integer.MAX_VALUE;
        if(dividend==0) return 0;
        if((dividend >0 && divisor<0) ||(dividend <0 && divisor>0)) p=-1;
        if(dividend ==Integer.MIN_VALUE && divisor==Integer.MIN_VALUE) return 1;
        if(dividend ==Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;
        if(divisor==Integer.MIN_VALUE) return 0;
        divisor=Math.abs(divisor);
        if(dividend==Integer.MIN_VALUE) {
            dividend+=p*divisor;
            push=true;
        }
        dividend=Math.abs(dividend);
        while(dividend>=divisor){
            int t=divisor;
            int count=0;
            while(t<((int)Math.pow(2,30)) && (t*2<=dividend )){
                t*=2;
                count++;
            }
            dividend-=t;
            r+=Math.pow(2,count);
        }
        return p*r+(push?p:0);
    }
}

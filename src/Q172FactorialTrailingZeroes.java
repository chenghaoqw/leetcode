public class Q172FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int r=0;
        long five=5;
        while(five<=n){
            r+=(int)Math.floor(n/five);
            five*=5;
        }
        return r;
    }
}

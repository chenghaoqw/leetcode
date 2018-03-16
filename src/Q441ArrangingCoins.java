public class Q441ArrangingCoins {
    public int arrangeCoins(int n) {
        int i=0;
        for(i=1;(double)(i+1)/2 <=(double)n/i;i++);
        return i-1;
    }
}

public class Q829ConsecutiveNumbersSum {
    public int consecutiveNumbersSum(int N) {
        int count=1;
        for(int i=2;i<Math.sqrt(2*N);i++){
            int t=(1+i)*i/2;
            if((N-t) % i==0) count++;
        }
        return count;
    }
}

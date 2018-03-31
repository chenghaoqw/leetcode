public class Q357CountNumberswithUniqueDigits {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
        int sum=10;
        for(int i=2;i<=n && i<=10;i++){
            int t=9;
            for(int j=2;j<=i;j++){
                t*=(9-j+2);
            }
            sum+=t;
        }
        return sum;
    }
}

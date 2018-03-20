public class Q633SumofSquareNumbers {
    public boolean judgeSquareSum(int c) {
        for(int i=0;i<=Math.floor(Math.sqrt(c));i++){
            if(Math.pow(Math.floor(Math.sqrt(c- i*i)),2)+i*i==c) return true;
        }
        return false;
    }
}

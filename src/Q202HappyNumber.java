import java.util.ArrayList;
import java.util.List;

public class Q202HappyNumber {
    public boolean isHappy(int n) {
        List<Integer> booked=new ArrayList<Integer>();
        while(!booked.contains(n)){
            if(n==1) return true;
            booked.add(n);
            n=calc(n);
        }
        return false;
    }

    public int calc(int n){
        int sum=0;
        while(n > 0){
            sum+=(int)Math.pow(n%10,2);
            n/=10;
        }
        return sum;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Q313SuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        List<Integer> list=new ArrayList<Integer>();
        int[] indexs=new int[primes.length];
        list.add(1);
        while(list.size()<n){
            int min=Integer.MAX_VALUE;
            for(int i=0;i<primes.length;i++){
                if(primes[i]==1) continue;
                min=Math.min(list.get(indexs[i])*primes[i],min);
            }
            for(int i=0;i<primes.length;i++){
                if(min==list.get(indexs[i])*primes[i]) {
                    if(primes[i]==1) continue;
                    indexs[i]++;
                }
            }
            list.add(min);
        }
        return list.get(list.size()-1);
    }
}

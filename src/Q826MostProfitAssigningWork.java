import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q826MostProfitAssigningWork {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        Map<Integer,Integer> map=new HashMap();
        for(int i=0;i<difficulty.length;i++) {
            if(map.containsKey(difficulty[i])) profit[i]=Math.max(profit[i],map.get(difficulty[i]));
            map.put(difficulty[i],profit[i]);
        }
        Arrays.sort(difficulty);
        int max=0,sum=0;
        for(int i=0;i<difficulty.length;i++){
            if(map.get(difficulty[i])>max) max=map.get(difficulty[i]);
            map.put(difficulty[i],max);
        }
        Arrays.sort(worker);
        int i=0,j=0;
        for(;i<worker.length;i++){
            for(;j<difficulty.length;j++){
                if(j==difficulty.length-1 || worker[i]<difficulty[j+1]) break;
            }
            if(worker[i]>=difficulty[j]) sum+=map.get(difficulty[j]);
        }
        return sum;
    }
}

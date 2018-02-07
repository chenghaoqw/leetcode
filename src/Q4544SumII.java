import java.util.HashMap;

public class Q4544SumII {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer,Integer> map1=new HashMap();
        HashMap<Integer,Integer> map2=new HashMap();
        int r=0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B.length;j++){
                int sum=A[i]+B[j];
                int sum1=C[i]+D[j];
                if(map1.containsKey(sum)) map1.put(sum,map1.get(sum)+1);
                else map1.put(sum,1);
                if(map2.containsKey(sum1)) map2.put(sum1,map2.get(sum1)+1);
                else map2.put(sum1,1);
            }
        }
        for(int i:map1.keySet()){
            if(map2.containsKey(-i)) r+=map2.get(-i)*map1.get(i);
        }
        return r;
    }
}

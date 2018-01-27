import java.util.HashMap;

public class Q760FindAnagramMappings {
    public int[] anagramMappings(int[] A, int[] B) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<B.length;i++){
            map.put(B[i],i);
        }
        int[] r=new int[B.length];
        for(int i=0;i<B.length;i++){
            r[i]=map.get(A[i]);
        }
        return r;
    }
}

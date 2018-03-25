import java.util.ArrayList;
import java.util.List;

public class Q60PermutationSequence {
    public String getPermutation(int n, int k) {
        List<Integer> list=new ArrayList();
        int s=1;
        for(int i=0;i<n;i++){
            list.add(i);
            s*=(i+1);
        }
        StringBuffer r=new StringBuffer();
        k--;
        for(int i=n-1;i>0;i--){
            s/=(i+1);
            int index=k/s;
            k=k%s;
            r.append((char)(list.get(index)+'1'));
            list.remove(index);
        }
        r.append((char)(list.get(0)+'1'));
        return r.toString();
    }
}

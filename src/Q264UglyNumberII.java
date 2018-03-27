import java.util.ArrayList;
import java.util.List;

public class Q264UglyNumberII {
    public int nthUglyNumber(int n) {
        List<Integer> list=new ArrayList();
        list.add(1);
        int i1=0,i2=0,i3=0;
        while(list.size()<n){
            int t=Math.min(Math.min(list.get(i2)*3,list.get(i3)*5),list.get(i1)*2);
            if(t==list.get(i1)*2) i1++;
            if(t==list.get(i2)*3) i2++;
            if(t==list.get(i3)*5) i3++;
            list.add(t);
        }
        return list.get(list.size()-1);
    }
}

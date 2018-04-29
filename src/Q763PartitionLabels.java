import java.util.ArrayList;
import java.util.List;

public class Q763PartitionLabels {
    public List<Integer> partitionLabels(String S) {
        List<Integer> list=new ArrayList();
        String reverse=new StringBuilder(S).reverse().toString();
        int before=0;
        int end=0;
        for(int i=0;i<S.length();i++){
            String c=String.valueOf(S.charAt(i));
            int last=reverse.indexOf(c);
            if(last>=0) {
                last=S.length()-last-1;
                if(last>end) end=last;
            }
            if(i==end){
                list.add(end-before+1);
                before=i+1;
            }
        }
        return list;
    }
}

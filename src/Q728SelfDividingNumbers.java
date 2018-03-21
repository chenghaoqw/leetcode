import java.util.ArrayList;
import java.util.List;

public class Q728SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList();
        for(int i=left;i<=right;i++){
            if(isValid(i)) list.add(i);
        }
        return list;
    }

    boolean isValid(int n){
        for(char c:String.valueOf(n).toCharArray()){
            if(c == '0' || (n % (c- '0') !=0)) return false;
        }
        return true;
    }
}

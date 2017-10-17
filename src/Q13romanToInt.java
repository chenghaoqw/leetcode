import java.util.HashMap;
import java.util.Map;

public class Q13romanToInt {
    public int romanToInt(String s) {
        int result=0;
        int temp=0;
        Map<Character,Integer> data=new HashMap<Character,Integer>();
        data.put('I',1);
        data.put('V',5);
        data.put('X',10);
        data.put('L',50);
        data.put('C',100);
        data.put('D',500);
        data.put('M',1000);
        int t=-1;
        int len=s.length();
        for(int i=0;i<len;i++){
            char c=s.charAt(i);
            int index=data.get(c);
            if(t==-1){
                t=index;
            }
            if(index>t){
                temp=index-temp;
                result+=temp;
                temp=0;
            }else if(index==t){
                temp+=index;
            }else{
                result+=temp;
                temp=index;
            }
            t=index;
        }
        result+=temp;
        return result;
    }
}

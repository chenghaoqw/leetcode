import java.util.ArrayList;
import java.util.List;

public class Q816AmbiguousCoordinates {
    public List<String> ambiguousCoordinates(String S) {
        List<String> list=new ArrayList<String>();
        S=S.substring(1,S.length()-1);
        for(int i=1;i<=S.length()-1;i++){
            String s1=S.substring(0,i);
            String s2=S.substring(i,S.length());
            if(Integer.parseInt(s1)==0 && s1.length()>=2) continue;
            if(Integer.parseInt(s2)==0 && s2.length()>=2) continue;
            for(String i1:getList(s1)){
                for(String i2:getList(s2)){
                    list.add("("+i1+", "+i2+")");
                }
            }
        }
        return list;
    }

    private List<String> getList(String s){
        List<String> list=new ArrayList<>();
        if("0".equals(s)){
            list.add(s);
            return list;
        }
        if(s.charAt(0)!='0') list.add(s);
        for(int i=1;i<=s.length()-1;i++){
            String s1=s.substring(0,i);
            String s2=s.substring(i,s.length());
            if(Integer.parseInt(s1)==0 && s1.length()>=2) continue;
            if(Integer.parseInt(s1)!=0 && s.charAt(0)=='0') continue;
            if(Integer.parseInt(s2)==0) continue;
            if(s2.charAt(s2.length()-1)=='0') continue;
            list.add(s1+"."+s2);
        }
        return list;
    }
}

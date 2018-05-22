import java.util.ArrayList;
import java.util.List;

public class Q93RestoreIPAddresses {
    private List<String> list=new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        ref("",0,s);
        return list;
    }

    public void ref(String o,int index,String s){
        if(index>4) return;
        if(index<4 && s.length()==0) return;
        if(index==4 && s.length()==0) {
            list.add(o.substring(0,o.length()-1));
            return;
        }
        if("0".equals(s.substring(0,1))){
            ref(o+0+".",index+1,s.substring(1,s.length()));
            return;
        }
        for(int i=0;i<3 && i<s.length();i++){
            String t=s.substring(0,i+1);
            if(Integer.valueOf(t)>=0 && Integer.valueOf(t)<=255){
                ref(o+t+".",index+1,s.substring(i+1,s.length()));
            }
        }
    }
}

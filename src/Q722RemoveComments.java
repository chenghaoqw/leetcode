import java.util.ArrayList;
import java.util.List;

public class Q722RemoveComments {
    public List<String> removeComments(String[] source) {
        List<String> list=new ArrayList();
        boolean flag=false;
        String result="";
        for(int i=0;i<source.length;i++){
            String s=source[i];
            while(s.length()>0){
                int i1=s.indexOf("//");
                int i2=s.indexOf("/*");
                int i3=s.indexOf("*/");
                if(flag){
                    if(i3>=0) {
                        s=s.substring(i3+2,s.length());
                        flag=false;
                    }else break;
                }else{
                    int target=Math.min(i1==-1?Integer.MAX_VALUE:i1,i2==-1?Integer.MAX_VALUE:i2);
                    if(target==Integer.MAX_VALUE) {
                        result+=s;
                        break;
                    }else{
                        result+=s.substring(0,target);
                    }
                    if(target==i1) break;
                    else if(target==i2){
                        s=s.substring(target+2,s.length());
                        flag=true;
                    }
                }
            }
            if(!flag && result.length()!=0) {
                list.add(result);
                result="";
            }
        }
        return list;
    }
}

import java.util.List;

public class Q524LongestWordinDictionarythroughDeleting {
    public String findLongestWord(String s, List<String> d) {
        String r="";
        for(String item:d){
            boolean flag=true;
            int j=0;
            for(int i=0;i<item.length() && flag;i++){
                String c=String.valueOf(item.charAt(i));
                String t=s.substring(j,s.length());
                if(t.contains(c)) {
                    j=t.indexOf(c)+1+j;
                    if(j>s.length()-1){
                        if(i!=item.length()-1) flag=false;
                        break;
                    }
                }
                else{
                    flag=false;
                    break;
                }
            }
            if(flag){
                if(item.length()>r.length()) r=item;
                if(item.length()==r.length()){
                    for(int  i=0;i<item.length();i++){
                        if(item.charAt(i)<r.charAt(i)) {
                            r=item;
                            break;
                        }else if(item.charAt(i)>r.charAt(i)) break;
                    }
                }
            }
        }
        return r;
    }
}

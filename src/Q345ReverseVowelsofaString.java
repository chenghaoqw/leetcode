import java.util.ArrayList;
import java.util.List;

public class Q345ReverseVowelsofaString {
    public String reverseVowels(String s) {
        List<Character> list=new ArrayList();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                list.add(c);
            }
        }
        int index=0;
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                builder.append(list.get(list.size()-index-1));
                index++;
            }else{
                builder.append(c);
            }
        }
        return builder.toString();
    }
}

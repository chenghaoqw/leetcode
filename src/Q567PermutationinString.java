import java.util.Arrays;

public class Q567PermutationinString {
    public boolean checkInclusion(String s1, String s2) {
        s1=sort(s1);
        for(int i=0;i<s2.length()-s1.length()+1;i++){
            if(s1.equals(sort(s2.substring(i,s1.length()+i)))) return true;
        }
        return false;
    }

    String sort(String s){
        char[] c=s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}

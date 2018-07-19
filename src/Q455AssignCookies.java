import java.util.Arrays;

public class Q455AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int result=0;
        int j=g.length-1;
        for(int i=s.length-1;i>=0 && j>=0;){
            if(g[j]>s[i]) j--;
            else{
                i--;
                j--;
                result++;
            }
        }
        return result;
    }
}

public class Q392IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        char[] c1=s.toCharArray();
        char[] c2=t.toCharArray();
        int i=0,j=0;
        for(;i<s.length() && j<t.length();){
            char t1=c1[i];
            char t2=c2[j];
            if(t1==t2) i++;
            j++;
        }
        return i==s.length();
    }
}

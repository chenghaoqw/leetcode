import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Q522LongestUncommonSubsequenceII {
    public int findLUSlength(String[] strs) {
        Arrays.sort(strs);
        Arrays.sort(strs, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        });
        TreeSet<String> set=new TreeSet();
        for(int i=0;i<strs.length;){
            if(i!=strs.length-1 && strs[i].equals(strs[i+1])){
                while(i!=strs.length-1 && strs[i].equals(strs[i+1])) i++;
                set.add(strs[i]);
                i++;
                continue;
            }
            if(i<=strs.length-1){
                boolean isFind=false;
                for(String s:set){
                    if(isSubString(s,strs[i])) isFind=true;
                }
                if(!isFind) return strs[i].length();
            }
            i++;
        }
        return -1;
    }
    private boolean isSubString(String s1, String s2) {
        char[] a1=s1.toCharArray();
        char[] a2=s2.toCharArray();
        int i1=0,i2=0;
        while(i1<a1.length && i2<a2.length){
            if(a1[i1]==a2[i2]){
                i2++;
            }
            i1++;
        }
        return i2 == a2.length;
    }
}

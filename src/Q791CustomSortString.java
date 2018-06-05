import java.util.Arrays;
import java.util.Comparator;

public class Q791CustomSortString {
    public String customSortString(String S, String T) {
        int[] map=new int[26];
        char[] array=S.toCharArray();
        for(int i=0;i<array.length;i++) map[array[i]-'a']=i;
        array=T.toCharArray();
        Character[] array1=new Character[array.length];
        for(int i=0;i<array.length;i++) array1[i]=array[i];
        Arrays.sort(array1,new Comparator<Character>(){
            public int compare(Character o1,Character o2){
                return map[o1-'a']-map[o2-'a'];
            }
        });
        for(int i=0;i<array.length;i++) array[i]=array1[i];
        return new String(array);
    }
}

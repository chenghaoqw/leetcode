import java.util.Arrays;

public class Q274HIndex {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int r=0;
        for(int i=0;i<citations.length;i++){
            r=Math.max(r,Math.min(citations[i],citations.length-i));
        }
        return r;
    }
}

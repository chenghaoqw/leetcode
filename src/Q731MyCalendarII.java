import java.util.ArrayList;
import java.util.List;

public class Q731MyCalendarII {
    List<int[]> first;
    List<int[]> second;
    public Q731MyCalendarII() {
        first=new ArrayList<int[]>();
        second=new ArrayList<int[]>();
    }

    public boolean book(int start, int end) {
        for(int[] i:second)
            if(end>i[0] && start<i[1]) return false;
        for(int[] i:first){
            if(end>i[0] && start<i[1]){
                second.add(new int[]{Math.max(i[0],start),Math.min(i[1],end)});
            }
        }
        first.add(new int[]{start,end});
        return true;
    }
}

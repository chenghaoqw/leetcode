import java.util.ArrayList;
import java.util.List;

public class Q729MyCalendarI {
    List<int[]> books;
    public Q729MyCalendarI() {
        books=new ArrayList<int[]>();
    }

    public boolean book(int start, int end) {
        for(int[] i:books){
            if(i[1]>start && i[0]<end) return false;
        }
        books.add(new int[]{start,end});
        return true;
    }
}

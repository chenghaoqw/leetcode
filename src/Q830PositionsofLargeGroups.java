import java.util.ArrayList;
import java.util.List;

public class Q830PositionsofLargeGroups {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> ret = new ArrayList();
        char[] array = S.toCharArray();
        int start = 0;
        for (int i = 1; i < array.length; i++) {
            if ((array[start] == array[i] || i == array.length - 1) && i - start >= 2) {
                List<Integer> list = new ArrayList();
                list.add(start);
                if (array[start] != array[i]) {
                    list.add(start);
                } else {
                    list.add(i);
                }
                ret.add(list);
            }
            if (array[start] != array[i]) {
                start = i;
            }
        }
        return ret;
    }
}
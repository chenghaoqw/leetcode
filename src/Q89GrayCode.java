import java.util.ArrayList;
import java.util.List;

public class Q89GrayCode {
    List<Integer> list = new ArrayList();

    public List<Integer> grayCode(int n) {
        for (int i = 0; i < (int) Math.pow(2, n); i++) {
            list.add((i >> 1) ^ i);
        }
        return list;
    }
}
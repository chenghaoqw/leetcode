import java.util.HashMap;
import java.util.Random;

public class Q519RandomFlipMatrix {
    HashMap<Integer, Integer> map = new HashMap();
    int col, row;
    int size;

    public Q519RandomFlipMatrix(int n_rows, int n_cols) {
        col = n_cols;
        row = n_rows;
        size = n_rows * n_cols;
    }

    public int[] flip() {
        int index = new Random().nextInt(size);
        size--;
        int index1 = index;
        if (map.containsKey(index)) index1 = map.get(index);
        int[] ret = new int[]{index1 / col, index1 % col};
        map.put(index, map.containsKey(size) ? map.get(size) : size);
        return ret;
    }

    public void reset() {
        map.clear();
        size = col * row;
    }
}
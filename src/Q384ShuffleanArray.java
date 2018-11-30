import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Q384ShuffleanArray {
    List<Integer> list = new ArrayList();
    int num[];

    public Q384ShuffleanArray(int[] nums) {
        num = nums;
        for (int i : nums) list.add(i);
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        return num;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        List<Integer> l = new ArrayList();
        l.addAll(list);
        for (int i = 0; i < l.size(); i++) {
            int index = new Random().nextInt(l.size() - i) + i;
            int t = l.get(index);
            l.set(index, l.get(i));
            l.set(i, t);
        }
        int[] ret = new int[l.size()];
        for (int i = 0; i < l.size(); i++) ret[i] = l.get(i);
        return ret;
    }
}
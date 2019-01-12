import java.util.Arrays;
import java.util.Random;

public class Q528RandomPickwithWeight {
    int[] a;

    public Q528RandomPickwithWeight(int[] w) {
        for (int i = 1; i < w.length; i++) {
            w[i] = w[i - 1] + w[i];
        }
        a = w;
    }

    public int pickIndex() {
        int index = new Random().nextInt(a[a.length - 1]);
        index = Arrays.binarySearch(a, index);
        if (index < 0) {
            index = -index - 1;
        } else {
            index++;
        }
        return index;
    }
}
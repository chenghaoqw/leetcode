import java.util.Random;

public class Q398RandomPickIndex {
    int[] array;

    public Q398RandomPickIndex(int[] nums) {
        array = nums;
    }

    public int pick(int target) {
        int res = 0;
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != target) continue;
            if (new Random().nextInt(count) == count - 1) res = i;
            count++;
        }
        return res;
    }
}
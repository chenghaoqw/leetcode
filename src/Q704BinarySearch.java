import java.util.Arrays;

public class Q704BinarySearch {
    public int search(int[] nums, int target) {
        int r = Arrays.binarySearch(nums, target);
        if (r < 0) r = -1;
        return r;
    }
}
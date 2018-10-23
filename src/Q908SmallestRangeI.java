import java.util.Arrays;

public class Q908SmallestRangeI {
    public int smallestRangeI(int[] A, int K) {
        Arrays.sort(A);
        if (A.length == 0) return 0;
        if (A[A.length - 1] - A[0] <= 2 * K) return 0;
        else return A[A.length - 1] - A[0] - 2 * K;
    }
}
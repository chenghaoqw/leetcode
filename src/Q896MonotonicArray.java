public class Q896MonotonicArray {
    public boolean isMonotonic(int[] A) {
        int t = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i + 1] > A[i]) {
                if (t < 0) return false;
                t = 1;
            } else if (A[i + 1] < A[i]) {
                if (t > 0) return false;
                t = -1;
            }
        }
        return true;
    }
}
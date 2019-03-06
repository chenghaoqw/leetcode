public class Q795NumberofSubarrayswithBoundedMaximum {
    public int numSubarrayBoundedMax(int[] A, int L, int R) {
        int ret = 0, left = -1, right = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > R) left = i;
            if (A[i] >= L) right = i;
            ret += right - left;
        }
        return ret;
    }
}
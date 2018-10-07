public class Q852PeakIndexinaMountainArray {
    public int peakIndexInMountainArray(int[] A) {
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i] > A[i - 1] && A[i + 1] < A[i]) return i;
        }
        return 0;
    }
}
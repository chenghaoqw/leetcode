public class Q718MaximumLengthofRepeatedSubarray {
    public int findLength(int[] A, int[] B) {
        int ans = 0;
        int[][] r = new int[A.length + 1][B.length + 1];
        for (int i = 1; i <= A.length; i++) {
            for (int j = 1; j <= B.length; j++) {
                if (A[i - 1] == B[j - 1]) {
                    r[i][j] = r[i - 1][j - 1] + 1;
                    ans = Math.max(r[i][j], ans);
                } else r[i][j] = 0;
            }
        }
        return ans;
    }
}

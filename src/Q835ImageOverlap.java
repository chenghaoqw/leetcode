public class Q835ImageOverlap {
    public int largestOverlap(int[][] A, int[][] B) {
        int l = A.length;
        int[][] count = new int[2 * l + 1][2 * l + 1];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (A[i][j] == 1) {
                    for (int i1 = 0; i1 < l; i1++) {
                        for (int j1 = 0; j1 < l; j1++) {
                            if (B[i1][j1] == 1) {
                                count[i - i1 + l - 1][j - j1 + l - 1]++;
                            }
                        }
                    }
                }
            }
        }
        int ans = 0;
        for (int[] row : count) {
            for (int i : row) {
                ans = Math.max(ans, i);
            }
        }
        return ans;
    }
}
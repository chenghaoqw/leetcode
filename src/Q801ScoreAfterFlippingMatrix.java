public class Q801ScoreAfterFlippingMatrix {
    public int matrixScore(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        int ret = 0;
        for (int c = 0; c < col; c++) {
            int count = 0;
            for (int r = 0; r < row; r++) {
                count += A[r][c] ^ A[r][0];
            }
            ret += Math.max(count, row - count) * 1 << (col - 1 - c);
        }
        return ret;
    }
}
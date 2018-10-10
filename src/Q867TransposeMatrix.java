public class Q867TransposeMatrix {
    public int[][] transpose(int[][] A) {
        if (A.length <= 0) return new int[1][1];
        int[][] ret = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                ret[j][i] = A[i][j];
            }
        }
        return ret;
    }
}
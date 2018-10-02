public class Q832FlippinganImage {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int[] r = new int[A[i].length];
            for (int j = 0; j < A[i].length; j++) {
                r[j] = A[i][A[i].length - 1 - j];
            }
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = r[j];
            }
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] == 0) {
                    A[i][j] = 1;
                } else {
                    A[i][j] = 0;
                }
            }
        }
        return A;
    }
}
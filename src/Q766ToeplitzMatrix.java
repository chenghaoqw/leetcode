public class Q766ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int row = matrix.length;
        if (row <= 0) return false;
        int column = matrix[0].length;
        for (int i = 0; i < column; i++) {
            int t = matrix[0][i];
            for (int j = 1, k = i + 1; j < row && k < column; j++, k++) {
                if (matrix[j][k] != t) return false;
            }
        }
        for (int i = 1; i < row; i++) {
            int t = matrix[i][0];
            for (int j = i + 1, k = 1; j < row && k < column; j++, k++) {
                if (matrix[j][k] != t) return false;
            }
        }
        return true;
    }
}
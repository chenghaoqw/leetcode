public class Q498DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length <= 0 || matrix[0].length <= 0) return new int[0];
        int[] ret = new int[matrix.length * matrix[0].length];
        int x = 0, y = 0;
        int count = -1;
        boolean up = true;
        while (true && count + 1 < matrix.length * matrix[0].length) {
            count++;
            ret[count] = matrix[y][x];
            if (up) {
                if (x + 1 <= matrix[0].length - 1 && y - 1 >= 0) {
                    x++;
                    y--;
                } else if (x + 1 <= matrix[0].length - 1) {
                    x++;
                    up = false;
                } else if (y + 1 <= matrix.length - 1) {
                    y++;
                    up = false;
                } else {
                    break;
                }

            } else {
                if (x - 1 >= 0 && y + 1 <= matrix.length - 1) {
                    x--;
                    y++;
                } else if (y + 1 <= matrix.length - 1) {
                    y++;
                    up = true;
                } else if (x + 1 <= matrix[0].length - 1) {
                    x++;
                    up = true;
                } else {
                    break;
                }
            }
        }
        return ret;
    }
}
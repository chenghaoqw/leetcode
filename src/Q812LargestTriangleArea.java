public class Q812LargestTriangleArea {
    public double largestTriangleArea(int[][] points) {
        int l = points.length;
        double ans = 0;
        for (int i = 0; i < l; i++)
            for (int j = i + 1; j < l; j++)
                for (int k = j + 1; k < l; k++)
                    ans = Math.max(ans, area(points[i], points[j], points[k]));
        return ans;
    }

    public double area(int[] x, int[] y, int z[]) {
        return 0.5 * Math.abs(x[0] * y[1] + y[0] * z[1] + z[0] * x[1] - y[0] * x[1] - z[0] * y[1] - x[0] * z[1]);
    }
}
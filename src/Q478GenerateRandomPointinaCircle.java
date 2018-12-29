public class Q478GenerateRandomPointinaCircle {
    double x0, y0, r;

    public Q478GenerateRandomPointinaCircle(double radius, double x_center, double y_center) {
        r = radius;
        x0 = x_center;
        y0 = y_center;
    }

    public double[] randPoint() {
        double x, y;
        do {
            x = -2 * r * Math.random() + r;
            y = -2 * r * Math.random() + r;
        } while (x * x + y * y > r * r);
        return new double[]{x + x0, y + y0};
    }
}
import java.util.Random;

public class Q497RandomPointinNonoverlappingRectangles {
    int sum = 0;
    int[][] rect;

    public Q497RandomPointinNonoverlappingRectangles(int[][] rects) {
        rect = rects;
        for (int[] r : rects) {
            sum += (r[2] - r[0] + 1) * (r[3] - r[1] + 1);
        }
    }

    public int[] pick() {
        int num = new Random().nextInt(sum) + 1;
        int count = 0;
        for (int[] r : rect) {
            int area = (r[2] - r[0] + 1) * (r[3] - r[1] + 1);
            count += area;
            if (count >= num) {
                num = num - count + area - 1;
                int x = num % Math.abs(r[2] - r[0] + 1) + r[0];
                int y = num / Math.abs(r[2] - r[0] + 1) + r[1];
                return new int[]{x, y};
            }
        }
        return new int[]{0, 0};
    }
}
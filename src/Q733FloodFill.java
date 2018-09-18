public class Q733FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int[][] mark = new int[image.length][image[0].length];
        ref(image, mark, sr, sc, newColor, image[sr][sc]);
        return image;
    }

    public void ref(int[][] image, int[][] mark, int sr, int sc, int newColor, int ori) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || mark[sr][sc] == 1 || image[sr][sc] != ori)
            return;
        mark[sr][sc] = 1;
        image[sr][sc] = newColor;
        ref(image, mark, sr + 1, sc, newColor, ori);
        ref(image, mark, sr - 1, sc, newColor, ori);
        ref(image, mark, sr, sc + 1, newColor, ori);
        ref(image, mark, sr, sc - 1, newColor, ori);

    }
}
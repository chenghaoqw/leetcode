public class Q374GuessNumberHigherorLower {
    public int guessNumber(int n) {
        int l = 1;
        int r = n;
        while (r > l) {
            int m = l + (r - l) / 2;
            if (guess(m) == 1) l = m + 1;
            else if (guess(m) == -1) r = m - 1;
            else return m;
        }
        return l;
    }

    int guess(int num) {
        return 1;
    }
}

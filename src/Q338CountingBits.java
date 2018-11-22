public class Q338CountingBits {
    public int[] countBits(int num) {
        int[] ret = new int[num + 1];
        if (num == 0) return ret;
        ret[1] = 1;
        if (num == 1) {
            return ret;
        }
        int n = 1;
        while (Math.pow(2, n) <= num) {
            for (int i = (int) Math.pow(2, n); i <= Math.pow(2, n + 1) - 1; i++) {
                if (i > num) return ret;
                ret[i] = ret[i - (int) Math.pow(2, n)] + 1;
            }
            n++;
        }
        return ret;
    }
}

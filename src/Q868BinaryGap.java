public class Q868BinaryGap {
    public int binaryGap(int N) {
        int r = -1;
        int index = 0;
        int ret = 0;
        while (N > 0) {
            index++;
            if ((N & 1) == 1) {
                if (r == -1) r = index;
                else {
                    ret = Math.max(ret, index - r);
                    r = index;
                }
            }
            N = N >> 1;
        }
        return ret;
    }
}
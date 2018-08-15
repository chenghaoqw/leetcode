public class Q693BinaryNumberwithAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        int t = -1;
        while (n > 0) {
            if (t == -1) {
                t = n & 1;
                n = n >> 1;
                continue;
            }
            int t1 = n & 1;
            if (t1 == t) return false;
            t = t1;
            n = n >> 1;
        }
        return true;
    }
}

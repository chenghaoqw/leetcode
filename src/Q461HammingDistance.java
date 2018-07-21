public class Q461HammingDistance {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount((x ^ y));
    }
}

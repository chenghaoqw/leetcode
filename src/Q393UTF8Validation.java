public class Q393UTF8Validation {
    public boolean validUtf8(int[] data) {
        int count = 0;
        for (int i : data) {
            if (count == 0) {
                if ((i >> 5) == 6) count = 1;
                else if ((i >> 4) == 14) count = 2;
                else if ((i >> 3) == 30) count = 3;
                else if ((i >> 7) == 1) return false;
            } else {
                if ((i >> 6) != 2) return false;
                count--;
            }
        }
        return count == 0;
    }
}
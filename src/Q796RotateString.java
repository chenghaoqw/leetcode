public class Q796RotateString {
    public boolean rotateString(String A, String B) {
        if (A.equals(B)) return true;
        for (int i = 0; i < A.length() - 1; i++) {
            String s = A.substring(i + 1, A.length()) + A.substring(0, i + 1);
            if (s.equals(B)) {
                return true;
            }
        }
        return false;
    }
}
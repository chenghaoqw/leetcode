public class Q859BuddyStrings {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length() || A.equals("") || "".equals(B)) return false;
        if (A.equals(B)) {
            for (int i = 0; i < A.length() - 1; i++) {
                if (A.substring(i + 1, A.length()).contains(A.substring(i, i + 1))) return true;
            }
        }
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                s1.append(A.charAt(i));
                s2.append(B.charAt(i));
            }
        }
        return s1.length() == 2 && (s1.reverse().toString().equals(s2.toString()) || s1.toString().equals(s2.toString()));
    }
}
public class Q925LongPressedName {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        for (; i < name.length() && j < typed.length(); ) {
            char c1 = name.charAt(i);
            char c2 = typed.charAt(j);
            if (c1 != c2) return false;
            int i1 = i + 1;
            int j1 = j + 1;
            while (i1 < name.length() && name.charAt(i1) == c1) {
                i1++;
            }
            while (j1 < typed.length() && typed.charAt(j1) == c1) {
                j1++;
            }
            if (j1 - j < i1 - i) return false;
            i = i1;
            j = j1;
        }
        return i == name.length() && j == typed.length();
    }
}
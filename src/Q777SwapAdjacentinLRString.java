public class Q777SwapAdjacentinLRString {
    public boolean canTransform(String start, String end) {
        char[] a1 = start.toCharArray();
        char[] a2 = end.toCharArray();
        int l = a1.length;
        if (a2.length != l) return false;
        int i = 0, j = 0;
        while (i < l && j < l) {
            while (i < l && a1[i] == 'X') i++;
            while (j < l && a2[j] == 'X') j++;
            char t1 = 'X', t2 = 'X';
            if (i < l) t1 = a1[i];
            if (j < l) t2 = a2[j];
            if (t1 != t2) return false;
            if (i < j && a1[i] == 'L' || i > j && a1[i] == 'R') return false;
            i++;
            j++;
        }
        return true;
    }
}
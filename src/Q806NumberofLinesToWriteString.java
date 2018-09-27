public class Q806NumberofLinesToWriteString {
    public int[] numberOfLines(int[] widths, String S) {
        int index = 0;
        int count = 1;
        for (int i = 0; i < S.length(); i++) {
            index += widths[S.charAt(i) - 'a'];
            if (index > 100) {
                index = 0;
                i--;
                count++;
            }
        }
        int[] ret = new int[]{count, index};
        return ret;
    }
}
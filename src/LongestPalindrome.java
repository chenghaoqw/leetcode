import java.io.IOException;

public class LongestPalindrome {
    public static void main(String[] args) throws IOException {
        String result = longestPalindrome1("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        System.out.printf("result: " + result);
        System.out.printf("");
    }

    public static String longestPalindrome1(String s) {
        int l = s.length();
        String re = new StringBuffer(s).reverse().toString();
        int[][] result = new int[l + 1][l + 1];
        result[0][0] = 0;
        int i, j;
        int start, end = 0;
        int max = 0;
        for (i = 1; i <= l; i++) {
            for (j = 1; j <= l; j++) {
                if (re.charAt(j - 1) == s.charAt(i - 1)) {
                    result[i][j] = result[i - 1][j - 1] + 1;
                    System.out.printf("i:" + i +" "+ "j:" + j + " max:" + max);
                    System.out.printf("\n");
                    StringBuffer temp = new StringBuffer(s.substring(l - j, l - j + result[i][j]));
                    StringBuffer temp1 = new StringBuffer(s.substring(i - result[i][j], i));
                    System.out.printf(temp.toString() + "  " + temp1.toString() + " " + temp.toString().equals(temp1.toString()));
                    System.out.printf("\n");
                    if (result[i][j] > max && temp.toString().equals(temp1.toString())) {
//                    if (result[i][j] > max) {
                        start = i;
                        end = j;
                        max = result[i][j];
                    }
                } else {
                    result[i][j] = 0;
                }
            }
        }
        return re.substring(end - max, end);
    }
}

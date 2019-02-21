public class Q738MonotoneIncreasingDigits {
    public int monotoneIncreasingDigits(int N) {
        char[] a = String.valueOf(N).toCharArray();
        int i = 1;
        while (i < a.length && a[i - 1] <= a[i]) i++;
        while (i < a.length && i > 0 && a[i - 1] > a[i]) a[--i]--;
        for (int j = i + 1; j < a.length; j++) a[j] = '9';
        return Integer.parseInt(String.valueOf(a));
    }
}
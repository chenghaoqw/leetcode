public class Q467UniqueSubstringsinWraparoundString {
    public int findSubstringInWraproundString(String p) {
        char[] a = p.toCharArray();
        int[] count = new int[26];
        int len = 0;
        for (int i = 0; i < a.length; i++) {
            if (i > 0 && (a[i] - a[i - 1] == 1 || a[i - 1] - a[i] == 25)) len++;
            else len = 1;
            count[a[i] - 'a'] = Math.max(count[a[i] - 'a'], len);
        }
        int sum = 0;
        for (int i : count) sum += i;
        return sum;
    }
}
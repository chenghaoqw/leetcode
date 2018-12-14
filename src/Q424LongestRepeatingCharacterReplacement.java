public class Q424LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int start = 0, ret = 0, max = 0;
        char[] array = s.toCharArray();
        int[] count = new int[26];
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, ++count[array[i] - 'A']);
            while (i - start + 1 - max > k) {
                --count[array[start] - 'A'];
                start++;
            }
            ret = Math.max(ret, i - start + 1);
        }
        return ret;
    }
}

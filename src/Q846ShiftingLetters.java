public class Q846ShiftingLetters {
    public String shiftingLetters(String S, int[] shifts) {
        int[] count = new int[shifts.length + 1];
        for (int i = shifts.length - 1; i >= 0; i--) {
            count[i] = (shifts[i] % 26 + count[i + 1] % 26) % 26;
        }
        char[] array = S.toCharArray();
        for (int i = 0; i < count.length - 1; i++) {
            array[i] = (char) ((array[i] - 'a' + count[i]) % 26 + 'a');
        }
        return new String(array);
    }
}
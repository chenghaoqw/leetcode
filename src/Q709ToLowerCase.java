public class Q709ToLowerCase {
    public String toLowerCase(String str) {
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            if (c >= 'A' && c <= 'Z') array[i] = (char) (c - ('A' - 'a'));
        }
        return new String(array);
    }
}
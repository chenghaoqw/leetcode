public class Q318MaximumProductofWordLengths {
    public int maxProduct(String[] words) {
        int l = words.length;
        int ret = 0;
        int mask[] = new int[l];
        for (int i = 0; i < l; i++) {
            for (int index = 0; index < words[i].length(); index++) {
                mask[i] |= 1 << words[i].charAt(index) - 'a';
            }
            for (int j = 0; j < i; j++) {
                if ((mask[i] & mask[j]) == 0) {
                    ret = Math.max(ret, words[i].length() * words[j].length());
                }
            }
        }
        return ret;
    }
}
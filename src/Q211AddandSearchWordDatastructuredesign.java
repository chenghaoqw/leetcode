public class Q211AddandSearchWordDatastructuredesign {
    class TrieNode {
        TrieNode[] node = new TrieNode[26];
        boolean isWord = false;
    }

    TrieNode root;

    /**
     * Initialize your data structure here.
     */
    public Q211AddandSearchWordDatastructuredesign() {
        root = new TrieNode();
    }

    /**
     * Adds a word into the data structure.
     */
    public void addWord(String word) {
        char[] w = word.toCharArray();
        TrieNode cur = root;
        for (char c : w) {
            if (cur.node[c - 'a'] == null) cur.node[c - 'a'] = new TrieNode();
            cur = cur.node[c - 'a'];
        }
        cur.isWord = true;
    }

    /**
     * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
     */
    public boolean search(String word) {
        char[] w = word.toCharArray();
        TrieNode cur = root;
        for (int i = 0; i < w.length; i++) {
            char c = w[i];
            if (c == '.') {
                for (int j = 0; j < 26; j++) {
                    char[] w1 = word.toCharArray();
                    w1[i] = (char) ('a' + j);
                    if (search(new String(w1))) return true;
                }
            } else {
                if (cur.node[c - 'a'] == null) return false;
                cur = cur.node[c - 'a'];
                continue;
            }
            return false;
        }
        if (cur != null && cur.isWord) return true;
        return false;
    }
}

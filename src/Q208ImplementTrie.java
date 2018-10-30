import java.util.ArrayList;
import java.util.List;

public class Q208ImplementTrie {
    List<String> list;

    /**
     * Initialize your data structure here.
     */
    public Q208ImplementTrie() {
        list = new ArrayList();
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        list.add(word);
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        return list.contains(word);
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        for (String s : list) {
            if (s.startsWith(prefix)) return true;
        }
        return false;
    }
}
import java.util.ArrayList;
import java.util.List;

public class Q706DesignHashMap {
    List<Integer> list = new ArrayList();
    List<Integer> index = new ArrayList();

    /**
     * Initialize your data structure here.
     */
    public Q706DesignHashMap() {

    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        if (!index.contains(key)) {
            index.add(key);
            list.add(value);
        } else {
            int i = index.indexOf(key);
            list.remove(i);
            list.add(i, value);
        }
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        if (index.contains(key)) {
            return list.get(index.indexOf(key));
        } else {
            return -1;
        }
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        if (index.contains(key)) {
            list.remove(index.indexOf(key));
            index.remove(index.indexOf(key));
        }
    }
}
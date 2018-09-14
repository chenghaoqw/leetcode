import java.util.ArrayList;
import java.util.List;

public class Q705DesignHashSet {
    private List<Integer> list = new ArrayList();

    /**
     * Initialize your data structure here.
     */
    public Q705DesignHashSet() {

    }

    public void add(int key) {
        if (!list.contains(key)) {
            list.add(key);
        }
    }

    public void remove(int key) {
        if (list.contains(key)) {
            list.remove(list.indexOf(key));
        }
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        return list.contains(key);
    }
}
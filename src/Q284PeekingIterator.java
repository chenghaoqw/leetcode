import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q284PeekingIterator implements Iterator<Integer> {
    List<Integer> list = new ArrayList();
    int index = 0;

    public Q284PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        for (; iterator.hasNext(); ) list.add(iterator.next());
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if (!hasNext()) return 0;
        return list.get(index);
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        index++;
        return list.get(index - 1);
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }
}

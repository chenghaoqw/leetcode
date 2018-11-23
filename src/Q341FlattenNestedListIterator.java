import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// This is the interface that allows for creating nested lists.
// You should not implement it, or speculate about its implementation
interface NestedInteger {

    // @return true if this NestedInteger holds a single integer, rather than a nested list.
    public boolean isInteger();

    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    public Integer getInteger();

    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return null if this NestedInteger holds a single integer
    public List<NestedInteger> getList();
}

public class Q341FlattenNestedListIterator implements Iterator<Integer> {
    LinkedList<NestedInteger> stack = new LinkedList();
    List<Integer> list = new ArrayList();

    public Q341FlattenNestedListIterator(List<NestedInteger> nestedList) {
        for (NestedInteger i : nestedList) {
            stack.add(i);
        }
        while (!stack.isEmpty()) {
            NestedInteger i = stack.pop();
            if (i.isInteger()) {
                list.add(i.getInteger());
            } else {
                LinkedList<NestedInteger> stack1 = new LinkedList();
                for (NestedInteger in : i.getList()) {
                    stack1.add(in);
                }
                stack.addAll(0, stack1);
            }
        }
    }

    @Override
    public Integer next() {
        Integer ret = list.get(0);
        list.remove(0);
        return ret;
    }

    @Override
    public boolean hasNext() {
        return list.size() > 0;
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
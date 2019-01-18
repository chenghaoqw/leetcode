import java.util.LinkedList;

public class Q622DesignCircularQueue {
    LinkedList<Integer> list = new LinkedList();
    int limit;

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public Q622DesignCircularQueue(int k) {
        limit = k;
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        if (list.size() >= limit) return false;
        list.add(value);
        return true;
    }

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (list.isEmpty()) return false;
        list.pop();
        return true;
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        if (list.isEmpty()) return -1;
        return list.getFirst();
    }

    /**
     * Get the last item from the queue.
     */
    public int Rear() {
        if (list.isEmpty()) return -1;
        return list.getLast();
    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        return list.size() >= limit;
    }
}
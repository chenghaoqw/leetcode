import java.util.LinkedList;

public class Q232ImplementQueueusingStacks {
    LinkedList<Integer> queue = new LinkedList<Integer>();

    /**
     * Initialize your data structure here.
     */
    public Q232ImplementQueueusingStacks() {

    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        queue.offerLast(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        return queue.removeFirst();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        return queue.getFirst();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

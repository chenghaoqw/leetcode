public class Q430FlattenaMultilevelDoublyLinkedList {
    public Node flatten(Node head) {
        Node cur = head;
        while (cur != null) {
            if (cur.child != null) {
                cur.child = flatten(cur.child);
                Node next = cur.next;
                Node last = cur.child;
                while (last.next != null) last = last.next;
                cur.next = cur.child;
                cur.next.prev = cur;
                cur.child = null;
                last.next = next;
                if (next != null) next.prev = last;
            }
            cur = cur.next;
        }
        return head;
    }

    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node() {
        }

        public Node(int _val, Node _prev, Node _next, Node _child) {
            val = _val;
            prev = _prev;
            next = _next;
            child = _child;
        }
    }

}

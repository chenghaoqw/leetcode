public class Q707DesignLinkedList {
    Node head = new Node(0);

    class Node {
        int val;
        Node pre;
        Node next;

        public Node(int value) {
            this.val = value;
        }
    }

    /**
     * Initialize your data structure here.
     */
    public Q707DesignLinkedList() {

    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        int count = 0;
        Node cur = head;
        while (count <= index) {
            count++;
            cur = cur.next;
        }
        return cur.val;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head.next;
        head.next = node;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        Node node = new Node(val);
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        int count = 0;
        Node cur = head;
        Node node = new Node(val);
        while (count < index && cur != null) {
            count++;
            cur = cur.next;
        }
        if (cur == null) return;
        node.next = cur.next;
        cur.next = node;
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        int count = 0;
        Node cur = head;
        while (count < index) {
            count++;
            cur = cur.next;
        }
        cur.next = cur.next.next;
    }
}
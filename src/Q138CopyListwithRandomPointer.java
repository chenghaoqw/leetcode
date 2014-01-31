import java.util.HashMap;

public class Q138CopyListwithRandomPointer {
    HashMap<RandomListNode, RandomListNode> map = new HashMap<>();

    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) return null;
        RandomListNode node = new RandomListNode(head.label);
        map.put(head, node);
        RandomListNode next = head.next;
        RandomListNode cur = node;
        while (next != null) {
            RandomListNode temp = new RandomListNode(next.label);
            map.put(next, temp);
            cur.next = temp;
            cur = temp;
            next = next.next;
        }
        cur = node;
        while (head != null) {
            if (head.random != null) cur.random = map.get(head.random);
            head = head.next;
            cur = cur.next;
        }
        return node;
    }


    class RandomListNode {
        int label;
        RandomListNode next, random;

        RandomListNode(int x) {
            this.label = x;
        }
    }
}

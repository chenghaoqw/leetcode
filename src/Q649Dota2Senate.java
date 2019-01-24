import java.util.LinkedList;

public class Q649Dota2Senate {
    public String predictPartyVictory(String senate) {
        LinkedList<Character> list = new LinkedList();
        int p1 = 0, p2 = 0, b1 = 0, b2 = 0;
        for (char c : senate.toCharArray()) {
            if (c == 'R') p1++;
            else p2++;
            list.add(c);
        }
        while (p1 > 0 && p2 > 0) {
            char c = list.poll();
            if (c == 'R') {
                if (b2 > 0) {
                    b2--;
                    p1--;
                } else {
                    b1++;
                    list.add(c);
                }
            } else {
                if (b1 > 0) {
                    b1--;
                    p2--;
                } else {
                    b2++;
                    list.add(c);
                }
            }
        }
        return p1 > 0 ? "Radiant" : "Dire";
    }
}
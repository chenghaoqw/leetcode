import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class Q406QueueReconstructionbyHeight {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] i1, int[] i2) {
                if (i1[0] == i2[0]) {
                    return i1[1] - i2[1];
                }
                return i2[0] - i1[0];
            }
        });
        LinkedList<int[]> list = new LinkedList();
        for (int[] item : people) {
            list.add(item[1], item);
        }
        return list.toArray(new int[people.length][]);
    }
}
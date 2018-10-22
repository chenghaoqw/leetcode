import java.util.ArrayList;

public class Q905SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        ArrayList<Integer> list = new ArrayList();
        for (int i : A) {
            if (i % 2 == 0) list.add(i);
        }
        for (int i : A) {
            if (i % 2 == 1) list.add(i);
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
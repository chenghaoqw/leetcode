import java.util.TreeSet;

public class Q547FriendCircles {
    public int findCircleNum(int[][] M) {
        if (M.length <= 0 || M[0].length <= 0) return 0;
        int[] array = new int[M.length + 1];
        ;
        for (int i = 1; i <= M.length; i++) array[i] = i;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (i == j) continue;
                if (M[i][j] == 1) join(array, i + 1, j + 1);
            }
        }
        TreeSet set = new TreeSet();
        for (int i = 1; i <= M.length; i++) {
            set.add(find(array, i));
        }
        return set.size();
    }

    public int find(int[] array, int a) {
        int t = a;
        while (array[t] != t) {
            t = array[t];
        }
        int t1 = a, j;
        while (t1 != t) {
            j = array[t1];
            array[t1] = t;
            t1 = j;
        }
        return t;
    }

    public void join(int[] array, int a1, int a2) {
        int f1 = find(array, a1);
        int f2 = find(array, a2);
        if (a1 != a2) {
            array[f1] = array[f2];
        }
    }
}
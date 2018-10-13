import java.util.HashSet;

public class Q874WalkingRobotSimulation {
    public int robotSim(int[] commands, int[][] obstacles) {
        HashSet<int[]> set = new HashSet();
        for (int[] j : obstacles) {
            if (j[0] >= -1000 && j[0] <= 1000 && j[1] >= -30000 && j[1] <= 30000)
                set.add(j);
        }
        int to = 0;
        int ret = 0;
        int[] r1 = new int[2];
        for (int i : commands) {
            int[] r2 = new int[2];
            r2[1] = r1[1];
            r2[0] = r1[0];
            if (i > 0) {
                if (to == 0) r1[1] += i;
                else if (to == 1) r1[0] += i;
                else if (to == 2) r1[1] -= i;
                else r1[0] -= i;
                for (int[] j : set) {
                    if (r1[0] == r2[0] && r1[0] == j[0]) {
                        if (r1[1] > r2[1] && r1[1] >= j[1] && j[1] > r2[1]) r1[1] = j[1] - 1;
                        else if (r1[1] < r2[1] && r1[1] <= j[1] && j[1] < r2[1]) r1[1] = j[1] + 1;
                    }
                    if (r1[1] == r2[1] && r1[1] == j[1]) {
                        if (r1[0] > r2[0] && r1[0] >= j[0] && j[0] > r2[0]) r1[0] = j[0] - 1;
                        else if (r1[0] < r2[0] && r1[0] <= j[0] && j[0] < r2[0]) r1[0] = j[0] + 1;
                    }
                }
                ret = Math.max(ret, r1[0] * r1[0] + r1[1] * r1[1]);
            } else {
                if (i == -2) to--;
                else to++;
                if (to == -1) to = 3;
                else if (to == 4) to = 0;
            }
        }
        return ret;
    }
}
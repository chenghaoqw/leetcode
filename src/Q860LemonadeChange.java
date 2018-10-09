public class Q860LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int[] count = new int[3];
        for (int i = 0; i < bills.length; i++) {
            int b = bills[i];
            if (b == 20) count[0] += 1;
            if (b == 10) count[1] += 1;
            if (b == 5) count[2] += 1;
            b -= 5;
            int j0 = b / 20;
            j0 = Math.min(count[2], j0);
            b -= j0 * 20;
            int j1 = b / 10;
            j1 = Math.min(count[1], j1);
            b -= j1 * 10;
            int j2 = b / 5;
            j2 = Math.min(count[2], j2);
            b -= j2 * 5;
            if (b == 0) {
                count[2] -= j2;
                count[1] -= j1;
                count[0] -= j0;
            } else {
                return false;
            }

        }
        return true;
    }
}
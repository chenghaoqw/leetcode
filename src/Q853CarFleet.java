import java.util.Arrays;

public class Q853CarFleet {
    class car {
        int p;
        int s;

        car(int position, int speed) {
            this.p = position;
            this.s = speed;
        }
    }

    public int carFleet(int target, int[] position, int[] speed) {
        int l = position.length;
        if (l < 1) return 0;
        car[] cars = new car[l];
        for (int i = 0; i < l; i++) {
            car car1 = new car(position[i], speed[i]);
            cars[i] = car1;
        }
        Arrays.sort(cars, (car car1, car car2) -> {
            if (car1.p != car2.p) return car2.p - car1.p;
            return car2.s - car1.s;
        });
        for (int i = 0; i < l; i++) {
            System.out.printf(cars[i].p + "|" + cars[i].s + "\n");
        }
        int count = 1;
        double time = ((double) target - cars[0].p) / cars[0].s;
        System.out.printf(time + "\n");
        for (int i = 1; i < l; i++) {
            System.out.printf((double) (target - cars[i].p) / cars[i].s + "\n");
            if (time >= (double) (target - cars[i].p) / cars[i].s) {
            } else {
                time = (double) (target - cars[i].p) / cars[i].s;
                count++;
            }
        }
        return count;
    }
}
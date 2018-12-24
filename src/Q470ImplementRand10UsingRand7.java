import java.util.Random;

public class Q470ImplementRand10UsingRand7 {
    public int rand10() {
        int rand49 = rand7() * 7 - rand7() + 1;
        if (rand49 < 10) return rand10();
        else return rand49 % 10 + 1;
    }

    public int rand7() {
        return new Random().nextInt(7) + 1;
    }
}
public class Q390EliminationGame {
    public int lastRemaining(int n) {
        return ref(n, true);
    }

    public int ref(int n, boolean left) {
        if (n == 1) return 1;
        if (left) return 2 * ref(n / 2, false);
        else return ref(n / 2, true) * 2 - 1 + n % 2;
    }
}
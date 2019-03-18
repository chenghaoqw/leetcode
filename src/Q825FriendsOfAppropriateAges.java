public class Q825FriendsOfAppropriateAges {
    public int numFriendRequests(int[] ages) {
        int[] count = new int[121];
        for (int i : ages) {
            count[i]++;
        }
        int ret = 0;
        for (int i = 1; i <= 120; i++) {
            for (int j = 1; j <= 120; j++) {
                if (count[i] == 0 || count[j] == 0) continue;
                if (j <= i * 0.5 + 7) continue;
                if (j > i) continue;
                if (j > 100 && i < 100) continue;
                ret += count[i] * count[j];
                if (i == j) ret -= count[i];
            }
        }
        return ret;
    }
}
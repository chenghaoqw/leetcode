public class Q278FirstBadVersion {
    public int firstBadVersion(int n) {
        int left = 0;
        int right = n;
        while (right > left) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) right = mid;
            else left = mid + 1;
        }
        return left;
    }

    boolean isBadVersion(int version) {
        return false;
    }
}

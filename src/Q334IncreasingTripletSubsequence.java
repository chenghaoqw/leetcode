public class Q334IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int a1 = Integer.MAX_VALUE;
        int a2 = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i <= a1) a1 = i;
            else if (i <= a2) a2 = i;
            else return true;
        }
        return false;
    }
}
public class Q769MaxChunksToMakeSorted {
    public int maxChunksToSorted(int[] arr) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int t = arr[i];
            max = Math.max(t, max);
            if (max == i) count++;
        }
        return count;
    }
}
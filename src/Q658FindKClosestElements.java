import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q658FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int temp = 0;
        List<Integer> list = new ArrayList();
        Arrays.sort(arr);
        int t = Arrays.binarySearch(arr, x);
        int left = 0, right = 0;
        if (t >= 0) {
            if (k > 0) {
                list.add(x);
                k--;
            }
            left = t - 1;
            right = t + 1;
        } else {
            left = -t - 2;
            right = -t - 1;
        }
        while ((left >= 0 || right <= arr.length - 1) && k > 0) {
            if (left < 0) {
                list.add(arr[right]);
                right++;
            } else if (right > arr.length - 1) {
                list.add(arr[left]);
                left--;
            } else {
                if (x - arr[left] <= arr[right] - x) {
                    list.add(arr[left]);
                    left--;
                } else {
                    list.add(arr[right]);
                    right++;
                }
            }
            k--;
        }
        Collections.sort(list);
        return list;
    }
}

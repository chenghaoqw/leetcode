import java.util.Arrays;
import java.util.Comparator;

public class Q179LargestNumber {
    public String largestNumber(int[] nums) {
        String[] array = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            array[i] = nums[i] + "";
        }
        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String ss1 = s1 + s2;
                String ss2 = s2 + s1;
                for (int i = 0; i < ss1.length(); i++) {
                    if (ss1.charAt(i) != ss2.charAt(i)) {
                        return ss2.charAt(i) - ss1.charAt(i);
                    }
                }
                return 0;
            }
        });
        String r = "";
        for (int i = 0; i < nums.length; i++) {
            r += array[i];
        }
        boolean zero = true;
        for (int i = 0; i < r.length(); i++) {
            if (r.charAt(i) != '0') {
                zero = false;
                break;
            }
        }
        if (zero) r = "0";
        return r;
    }
}
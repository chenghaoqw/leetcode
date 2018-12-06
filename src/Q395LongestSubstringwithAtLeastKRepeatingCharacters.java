import java.util.HashMap;

public class Q395LongestSubstringwithAtLeastKRepeatingCharacters {
    public int longestSubstring(String s, int k) {
        int count = 0;
        HashMap<Character, Integer> map = new HashMap();
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        int left = 0;
        boolean is = false;
        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i]) < k) {
                is = true;
                count = Math.max(count, longestSubstring(s.substring(left, i), k));
                left = i + 1;
            } else {
                if (i == array.length - 1 && left > 0)
                    count = count = Math.max(count, longestSubstring(s.substring(left, i + 1), k));
            }
        }
        return is ? count : s.length();
    }
}
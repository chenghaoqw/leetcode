import java.util.ArrayList;
import java.util.List;

public class Q241DifferentWaystoAddParentheses {
    public List<Integer> diffWaysToCompute(String input) {
        char[] array = input.toCharArray();
        List<Integer> list = new ArrayList();
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] == '-' || array[i] == '+' || array[i] == '*') {
                List<Integer> left = diffWaysToCompute(input.substring(0, i));
                List<Integer> right = diffWaysToCompute(input.substring(i + 1));
                for (int l : left) {
                    for (int r : right) {
                        if (array[i] == '+') list.add(l + r);
                        if (array[i] == '-') list.add(l - r);
                        if (array[i] == '*') list.add(l * r);
                    }
                }
            }
        }
        if (list.size() == 0) list.add(Integer.parseInt(input));
        return list;
    }
}
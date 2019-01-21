import java.util.ArrayList;
import java.util.List;

public class Q638ShoppingOffers {
    int ret = Integer.MAX_VALUE;

    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        ref(price, special, needs, 0);
        return ret;
    }

    public void ref(List<Integer> price, List<List<Integer>> special, List<Integer> needs, int use) {
        boolean is = true;
        for (int i : needs) {
            if (i != 0) {
                is = false;
                break;
            }
        }
        if (is) {
            ret = Math.min(ret, use);
            return;
        }
        int t = use;
        for (int i = 0; i < needs.size(); i++) {
            t += price.get(i) * needs.get(i);
        }
        ret = Math.min(ret, t);
        for (List<Integer> list : special) {
            List<Integer> clone = new ArrayList();
            clone.addAll(needs);
            boolean valid = true;
            for (int i = 0; i < clone.size(); i++) {
                clone.set(i, clone.get(i) - list.get(i));
                if (clone.get(i) < 0) {
                    valid = false;
                    break;
                }
            }
            if (valid) ref(price, special, clone, use + list.get(list.size() - 1));
        }
    }
}
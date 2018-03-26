import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q223RectangleArea {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int a=1,b=1;
        List<Integer> list1=new ArrayList();
        List<Integer> list2=new ArrayList();
        if((A < E && C < E) || (G < A && G < C) || (D < F && B < F) || (H < B && H<D)) return (D-B) * (C-A) + (H-F)*(G-E);
        list1.add(A);
        list1.add(E);
        list1.add(C);
        list1.add(G);
        list2.add(D);
        list2.add(B);
        list2.add(H);
        list2.add(F);
        Collections.sort(list1);
        Collections.sort(list2);
        return (D-B) * (C-A) + (H-F)*(G-E)-(list1.get(2) -list1.get(1))*(list2.get(2) -list2.get(1));
    }
}

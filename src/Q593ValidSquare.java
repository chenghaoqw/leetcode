import java.util.Arrays;

public class Q593ValidSquare {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        return calcValid(p1,p2,p3,p4) && calcValid(p4,p2,p3,p1);
    }
    boolean calcValid(int[] p1, int[] p2, int[] p3, int[] p4){
        int i[]=new int[3];
        i[0]=calcDis(p1,p2);
        i[1]=calcDis(p1,p3);
        i[2]=calcDis(p1,p4);
        Arrays.sort(i);
        return i[0] == i[1] && i[0]+i[1] == i[2] && i[0]!=0;
    }
    int calcDis(int[] p1, int[] p2){
        return (p2[1]-p1[1])*(p2[1]-p1[1])+(p2[0]-p1[0])*(p2[0]-p1[0]);
    }
}

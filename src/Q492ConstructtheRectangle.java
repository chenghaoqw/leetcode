public class Q492ConstructtheRectangle {
    public int[] constructRectangle(int area) {
        int[] r=new int[2];
        int l= (int)Math.ceil(Math.sqrt(area));
        for(;l<=area;l++){
            if(area%l==0) {
                r[0]=l;
                r[1]=area/l;
                break;
            }
        }
        return r;
    }
}

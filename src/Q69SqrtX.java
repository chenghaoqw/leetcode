public class Q69SqrtX {
    public int mySqrt(int x) {
        double r=1.0;
        while(Math.abs(r*r-x)>0.1){
            r=(r * r+x)/(2.0*r);
        }
        return (int)Math.floor(r);
    }
}

public class Q537ComplexNumberMultiplication {
    public String complexNumberMultiply(String a, String b) {
        String r="";
        int[] i1=getIndex(a);
        int[] i2=getIndex(b);
        r+=(i1[0]*i2[0]-i1[1]*i2[1])+"+";
        r=r+(i1[0]*i2[1]+i1[1]*i2[0]+"i");
        return r;
    }

    int[] getIndex(String n){
        int[] r=new int[2];
        int i1=n.indexOf('+');
        int i2=n.indexOf('i');
        r[0]=Integer.valueOf(n.substring(0,i1));
        r[1]=Integer.valueOf(n.substring(i1+1,i2));
        return r;
    }
}

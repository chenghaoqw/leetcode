public class Q592FractionAdditionandSubtraction {
    public String fractionAddition(String expression) {
        expression=expression.replace("-","+-");
        if(expression.charAt(0)=='+') expression=expression.substring(1,expression.length());
        String[] s=expression.split("[+]");
        int a=0,b=1;
        for(String item:s){
            Fraction t=new Fraction(item);
            a=a*t.nemo+t.deno*b;
            b*=t.nemo;
            int gcd=Math.abs(gcd(a,b));
            b/=gcd;
            a/=gcd;
        }
        return a+"/"+b;
    }

    int gcd(int a,int b){
        return b==0 ? a :gcd (b,a%b);
    }
    class Fraction{
        public int deno;
        public int nemo;
        public Fraction(String arg){
            int index=arg.indexOf("/");
            this.deno=Integer.valueOf(arg.substring(0,index));
            this.nemo=Integer.valueOf(arg.substring(index+1,arg.length()));;
        }
        public Fraction(int a1,int a2){
            this.deno=a1;
            this.nemo=a2;
        }
    }
}

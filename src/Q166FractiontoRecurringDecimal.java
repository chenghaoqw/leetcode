import java.util.HashMap;

public class Q166FractiontoRecurringDecimal {
    public String fractionToDecimal(int numerator1, int denominator1) {
        HashMap<Long,Integer> map=new HashMap();
        long numerator=numerator1;
        long denominator=denominator1;
        boolean bz=false;
        if(denominator > 0){
            if(numerator <0){
                bz=true;
                numerator=-numerator;
            }
        }else if(denominator <0){
            if(numerator <0){
                numerator=-numerator;
                denominator=-denominator;
            }else {
                bz=true;
                denominator=-denominator;
            }
        }else {
            return "";
        }
        StringBuffer r=new StringBuffer("");
        long first=0;
        if(numerator>denominator){
            first=numerator/denominator;
            numerator=numerator % denominator;
        }
        if(numerator==0) {
            if(bz) return -first+"";
            else return first+"";
        }
        r.append(first);
        r.append(".");
        while(numerator!=0){
            while(numerator<denominator){
                if(map.containsKey(numerator)){
                    r.insert(map.get(numerator),"(");
                    r.append(")");
                    if(bz) r.insert(0,"-");
                    return r.toString();
                }
                map.put(numerator,r.length());
                // r.append("$"+numerator+"$");
                numerator*=10;
                if(numerator<denominator) r.append("0");
                // else return r.toString();
            }
            long t=numerator/denominator;
            r.append(t);
            numerator=numerator % denominator;
        }
        if(bz) r.insert(0,"-");
        return r.toString();
    }
}

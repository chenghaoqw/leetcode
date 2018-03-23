public class Q43MultiplyStrings {
    public String multiply(String num1, String num2) {
        num1=new StringBuilder(num1).reverse().toString();
        num2=new StringBuilder(num2).reverse().toString();
        StringBuilder r=new StringBuilder("0");
        for(int i=0;i<num1.length();i++){
            int carry=0;
            int a=Integer.parseInt(num1.substring(i,i+1));
            if(a==0) continue;
            StringBuilder t=new StringBuilder();
            boolean notzero=false;
            for(int j=0;j<num2.length();j++){
                int b=Integer.parseInt(num2.substring(j,j+1));
                if(b!=0) notzero=true;
                int sum=a*b+carry;
                t.insert(0,sum%10+"");
                carry=sum/10;
            }
            if(carry>0) t.insert(0,carry+"");
            for(int l=0;l<i && notzero;l++) t.append("0");
            r=add(r.toString(),t.toString());
        }
        return r.toString();
    }

    public StringBuilder add(String num1,String num2){
        num1=new StringBuilder(num1).reverse().toString();
        num2=new StringBuilder(num2).reverse().toString();
        int carry=0;
        StringBuilder r=new StringBuilder();
        for(int i=0;i<num1.length() || i<num2.length() || carry>0;i++){
            int a=0;
            int b=0;
            if(i<num1.length()) a=Integer.parseInt(num1.substring(i,i+1));
            if(i<num2.length()) b=Integer.parseInt(num2.substring(i,i+1));
            int sum=a+b+carry;
            if(sum>=10){
                carry=1;
                r.append((sum-10)+"");
            }else{
                carry=0;
                r.append(sum+"");
            }
        }
        return r.reverse();
    }
}

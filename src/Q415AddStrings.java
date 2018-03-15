public class Q415AddStrings {
    public String addStrings(String num1, String num2) {
        StringBuilder r=new StringBuilder();
        num1=new StringBuilder(num1).reverse().toString();
        num2=new StringBuilder(num2).reverse().toString();
        int carry=0;
        for(int i=0;i<num1.length() || i<num2.length() || carry>0;i++){
            int a=0;
            int b=0;
            if(i<num1.length()) a=Integer.parseInt(num1.substring(i,i+1));
            if(i<num2.length()) b=Integer.parseInt(num2.substring(i,i+1));
            int sum=a+b+carry;
            if(sum>9){
                carry=1;
                r.append((sum-10)+"");
            }else{
                carry=0;
                r.append(sum+"");
            }
        }
        return r.reverse().toString();
    }
}

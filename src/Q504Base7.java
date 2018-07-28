public class Q504Base7 {
    public String convertToBase7(int num) {
        boolean is=false;
        StringBuilder r=new StringBuilder();
        if(num<0) {
            is=true;
            num=-num;
        }
        while(num>=0){
            r.insert(0,num%7+"");
            num/=7;
            if(num==0) break;
        }
        if(is) r.insert(0,"-");
        return r.toString();
    }
}

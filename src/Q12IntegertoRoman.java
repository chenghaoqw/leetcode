public class Q12IntegertoRoman {
    public String intToRoman(int num) {
        StringBuffer result=new StringBuffer("");
        String[] data=new String[7];
        data[0]="I";
        data[1]="V";
        data[2]="X";
        data[3]="L";
        data[4]="C";
        data[5]="D";
        data[6]="M";
        int i=0;
        while(num >0){
            int temp=num % 10;
            if(temp <=3){
                for(int j=0;j<temp;j++){
                    result.insert(0,data[2*i]);
                }
            }else if(temp ==4){
                result.insert(0,data[2*i+1]);
                result.insert(0,data[2*i]);
            }else if(temp ==5){
                result.insert(0,data[2*i+1]);
            }else if(temp >=6 && temp<=8){
                for(int j=0;j<temp-5;j++){
                    result.insert(0,data[2*i]);
                }
                result.insert(0,data[2*i+1]);
            }else{
                result.insert(0,data[2*i+2]);
                result.insert(0,data[2*i]);
            }
            num/=10;
            i++;
        }
        return result.toString();
    }
}

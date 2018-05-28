public class Q468ValidateIPAddress {
    public String validIPAddress(String IP) {
        IP=IP.toLowerCase();
        if(IP.indexOf(".")>0){
            if(IP.charAt(IP.length()-1)=='.') return "Neither";
            String[] array=IP.split("\\.");
            if(array.length!=4) return "Neither";
            for(int i=0;i<4;i++){
                try{
                    if((array[i].charAt(0)=='0' && array[i].length()>1) || array[i].charAt(0)=='-') return "Neither";
                    int t=Integer.parseInt(array[i]);
                    if(t<0 || t>255) return "Neither";
                }catch(Exception e){
                    return "Neither";
                }
            }
            return "IPv4";
        }else if(IP.indexOf(":")>0){
            if(IP.charAt(IP.length()-1)==':') return "Neither";
            String[] array=IP.split(":");
            if(array.length!=8) return "Neither";
            for(int i=0;i<8;i++){
                if(array[i].length()==0 || array[i].length()>4) return "Neither";
                for(int j=0;j<array[i].length();j++){
                    char c=array[i].charAt(j);
                    if(c<'0' || c>'f') return "Neither";
                }
            }
            return "IPv6";
        }
        return "Neither";
    }
}


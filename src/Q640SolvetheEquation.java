public class Q640SolvetheEquation {
    public String solveEquation(String equation) {
        if(equation ==null || equation.length()==0) return "";
        int a1=0,a2=0;
        String[] two=equation.split("[=]");
        int[] left=calc(two[0]);
        int[] right=calc(two[1]);
        if(left[0]==right[0])
            if(left[1]==right[1]) return "Infinite solutions";
            else return "No solution";
        return "x="+((right[1]-left[1])/(left[0]-right[0]));

    }

    int[] calc(String e){
        int[] r=new int[2];
        e=e.replace("-","+-");
        String[] ss=e.split("[+]");
        for(String s:ss){
            if(s.length()==0) continue;
            if(s.charAt(s.length()-1)=='x') {
                if(s.length()==1) r[0]+=1;
                else if(s.length()==2 && s.charAt(0)=='-') r[0]-=1;
                else r[0]+=Integer.valueOf(s.substring(0,s.length()-1));
            }
            else r[1]+=Integer.valueOf(s.substring(0,s.length()));
        }
        return r;
    }
}

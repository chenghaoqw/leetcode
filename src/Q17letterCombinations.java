import java.util.ArrayList;
import java.util.List;

public class Q17letterCombinations {
    private List<String> result=new ArrayList<String>();
    private List<List<String>> data=new ArrayList<List<String>>();
    public List<String> letterCombinations(String digits) {
        if(digits==null || digits.length()<=0){
            return result;
        }
        for(int i=2;i<=9;i++){
            List<String> temp=new ArrayList<String>();
            if(i==2){
                temp.add("a");
                temp.add("b");
                temp.add("c");
            }else if(i==3){
                temp.add("d");
                temp.add("e");
                temp.add("f");
            }else if(i==4){
                temp.add("g");
                temp.add("h");
                temp.add("i");
            }else if(i==5){
                temp.add("j");
                temp.add("k");
                temp.add("l");
            }else if(i==6){
                temp.add("m");
                temp.add("n");
                temp.add("o");
            }else if(i==7){
                temp.add("p");
                temp.add("q");
                temp.add("r");
                temp.add("s");
            }else if(i==8){
                temp.add("t");
                temp.add("u");
                temp.add("v");
            }else if(i==9){
                temp.add("w");
                temp.add("x");
                temp.add("y");
                temp.add("z");
            }
            data.add(temp);
        }
        dfs(digits,"");
        return result;
    }

    public void dfs(String digits,String subString){
        if(digits==null || digits.length()==0){
            result.add(subString);
            return;
        }
        List<String> subData=data.get(Integer.parseInt(digits.substring(0,1))-2);
        digits=digits.substring(1);
        for(int i=0;i<subData.size();i++){
            String temp=subString + subData.get(i);
            dfs(digits,temp);
        }
    }
}

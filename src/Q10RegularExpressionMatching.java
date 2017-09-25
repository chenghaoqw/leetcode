import java.util.ArrayList;

public class Q10RegularExpressionMatching {
    class Solution {
        class MultiChar{
            public int len;
            public char c;
            public MultiChar(int len,char c){
                this.len=len;
                this.c=c;
            }

        }
        public boolean isMatch(String s, String p) {
            if(s.length()==0 || p.length()==0 || p.charAt(0)=='*'){
                return false;
            }
            ArrayList<MultiChar> n1=new ArrayList<MultiChar>();
            MultiChar temp=new MultiChar(1,s.charAt(0));
            for(int i=1;i<s.length();i++){
                if(s.charAt(i)==temp.c){
                    temp.len=temp.len+1;
                    if(i+1==s.length()){
                        n1.add(temp);
                    }
                }else{
                    if(i+1<s.length()){
                        n1.add(temp);
                        temp=new MultiChar(1,s.charAt(i));
                    }else{
                        n1.add(temp);
                        n1.add(new MultiChar(i,s.charAt(i)));
                    }
                }
            }
            int index=0;
            int i=0;
            int l=p.length();
            for(i=0;i<n1.size() && index<l;){
                boolean isMatching=false;
                boolean exit=false;
                MultiChar left=n1.get(i);
                int start=index;
                for(;index<l && !exit;index++){
                    char rightChar=p.charAt(index);
                    boolean isMax=false;
                    if(!isMatching){
                        if(rightChar=='.' || rightChar==left.c){
                            isMatching=true;
                        }
                    }else {
                        if(rightChar=='*'){
                            if(p.charAt(index-1)=='.'){
                                return true;
                            }
                            isMax=true;
                        }else if(rightChar!='.' && rightChar!='*'){
                            exit=true;
                        }
                    }
                    if(exit || index==l-1){
                        if(i==0 || i==n1.size()-1){
                            if(isMax || index-start+1>=left.len){
                                i++;
                            }
                        }else{
                            if(isMax){
                                if(index-start+1<=left.len){
                                    i++;
                                }
                            }else{
                                if(index-start+1==left.len){
                                    i++;
                                }
                            }
                        }
                    }
                }
            }
            if(i>=n1.size()){
                return true;
            }else{
                return false;
            }
        }
    }
}

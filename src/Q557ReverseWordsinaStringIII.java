public class Q557ReverseWordsinaStringIII {
    public String reverseWords(String s) {
        String[] array=s.split(" ");
        StringBuilder result=new StringBuilder();
        for(int i=0;i<array.length;i++){
            if(array[i].length()==0) continue;
            result.append(new StringBuilder(array[i]).reverse().toString());
            if(i!=array.length-1) result.append(" ");
        }
        return result.toString();
    }
}

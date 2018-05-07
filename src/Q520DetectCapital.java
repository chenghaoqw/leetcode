public class Q520DetectCapital {
    public boolean detectCapitalUse(String word) {
        if(word.length()<=0) return true;
        if(word.toLowerCase().equals(word)) return true;
        if(word.toUpperCase().equals(word)) return true;
        if(word.charAt(0)<='Z' && word.charAt(0)>='A'){
            word=word.substring(1,word.length());
            if(word.toLowerCase().equals(word)) return true;
        }
        return false;
    }
}

public class Q171ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        long r=0;
        char[] array=s.toCharArray();
        for(int i=0;i<array.length;i++){
            r+=array[i]-'A'+1;
            if(i==array.length-1) break;
            r*=26;
        }
        return (int)r;
    }
}

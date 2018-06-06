public class Q809ExpressiveWords {
    public int expressiveWords(String S, String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            if(isValid(S.toCharArray(),words[i].toCharArray())) count++;
        }
        return count;
    }

    public boolean isValid(char[] a,char[] b){
        int index1=0;
        int index2=0;
        while(index1<a.length && index2<b.length){
            int c1=1,c2=1;
            if(a[index1]!=b[index2]) return false;
            while(index1!=a.length-1 && a[index1]==a[index1+1]){
                c1++;
                index1++;
            }
            while(index2!=b.length-1 && b[index2]==b[index2+1]){
                c2++;
                index2++;
            }
            if(c1<=2 && c2!=c1) return false;
            if(c2>c1) return false;
            index1++;
            index2++;
        }
        return index1==a.length && index2==b.length;
    }
}

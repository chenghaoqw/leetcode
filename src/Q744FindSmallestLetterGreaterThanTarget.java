import java.util.Arrays;

public class Q744FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        if(letters.length<1) return 'a';
        Arrays.sort(letters);
        int l=0;
        int r=letters.length-1;
        if(target>=letters[letters.length-1] || target<letters[0]) return letters[0];
        while(r>=l){
            int mid=l+(r-l)/2;
            if(letters[mid]>target) r=mid-1;
            else l=mid+1;
        }
        return letters[l];
    }
}

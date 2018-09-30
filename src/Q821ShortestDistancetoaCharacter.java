public class Q821ShortestDistancetoaCharacter {
    public int[] shortestToChar(String S, char C) {
        int[] ret = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            int l = i;
            int r = i;
            while (l >= 0 || r < S.length()) {
                if (l >= 0) {
                    if (S.charAt(l) == C) {
                        ret[i] = i - l;
                        break;
                    }
                }
                if (r < S.length()) {
                    if (S.charAt(r) == C) {
                        ret[i] = r - i;
                        break;
                    }
                }
                l--;
                r++;
            }
        }
        return ret;
    }
}

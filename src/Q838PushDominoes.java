public class Q838PushDominoes {
    public String pushDominoes(String dominoes) {
        char[] a = dominoes.toCharArray();
        StringBuilder res = new StringBuilder();
        char last = 'L';
        int lastIndex = 0;
        int l = a.length;
        for (int i = 0; i < l; i++) {
            if (a[i] == '.') continue;
            if (a[i] == 'R') {
                if (last == 'R') {
                    for (; lastIndex < i; lastIndex++) {
                        res.append('R');
                    }
                } else {
                    for (; lastIndex < i; lastIndex++) {
                        res.append('.');
                    }
                }
                res.append('R');
                last = 'R';
            } else {
                if (last == 'R') {
                    int sub = i - lastIndex;
                    for (int j = 0; j < sub / 2; j++) res.append('R');
                    if (sub % 2 == 1) res.append('.');
                    for (int j = 0; j < sub / 2; j++) res.append('L');
                } else {
                    for (; lastIndex < i; lastIndex++) {
                        res.append('L');
                    }
                }
                last = 'L';
                res.append('L');
            }
            lastIndex = i + 1;
        }
        if (last == 'R') {
            for (; lastIndex < l; lastIndex++) res.append('R');
        } else {
            for (; lastIndex < l; lastIndex++) res.append('.');
        }
        return res.toString();
    }
}

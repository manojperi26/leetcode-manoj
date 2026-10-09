class Solution {
    public int minInsertions(String s) {
        int res = 0, close = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (close % 2 == 1) {
                    res++;
                    close--;
                }
                close += 2;
            } else {
                close--;
                if (close < 0) {
                    res++;
                    close = 1;
                }
            }
        }

        return res + close;
    }
}
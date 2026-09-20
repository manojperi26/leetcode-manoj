class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        for(int i = 0 ; i < s.length(); i++){
            int reverse_pos = 26 - (s.charAt(i) - 'a');
            ans += reverse_pos * (i+1);
        }
        return ans;
    }
}
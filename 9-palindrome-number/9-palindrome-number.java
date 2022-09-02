class Solution {
    public boolean isPalindrome(int x) {
        if(x >= 0){
            String s = Integer.toString(x);
            int f = 0;
            int l = s.length() - 1;
            while(f < l){
                if(s.charAt(f) != s.charAt(l)) return false;
                f++;
                l--;
            }
            return true;
        }
        return false;
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() > 0){
            s = removeNonAlphanumeric(s);
            int f = 0;
            int l = s.length() - 1;
            while(f < l){
                if(s.charAt(f) != s.charAt(l)) return false;
                f++;
                l--;
            }
            return true;
        }
        return true;
    }
    
    public static String
      removeNonAlphanumeric(String str)
    {
        str = str.replaceAll(
          "[^a-zA-Z0-9]", "");
  
        return str.toLowerCase();
    }
}
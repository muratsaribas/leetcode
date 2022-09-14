class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> chars = new HashSet<>();
        
        int len = 0;
        int maxLen = 0;
        
        char[] ch = s.toCharArray();
        
        for(int i=0; i<ch.length; i++){
            
            for(int j = i; j<ch.length; j++){
                if(chars.contains(ch[j])){
                    chars.clear();
                    if(len > maxLen) maxLen = len;
                    len = 0;
                    break;
                }
                else{
                    chars.add(ch[j]);
                    len++;
                }
            }
        }

        return len > maxLen ? len : maxLen;
        
    }
}
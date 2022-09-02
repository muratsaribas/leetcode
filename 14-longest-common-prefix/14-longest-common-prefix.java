class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        if(strs.length > 1){
            int idx = 0;
            while(idx < strs[0].length()){
                for(int i=1; i<strs.length;i++){
                    if(idx >= strs[i].length()) return res;
                    if(strs[0].charAt(idx) != strs[i].charAt(idx)) return res;
                }
                res = res + strs[0].charAt(idx);
                idx++;
            }
        }
        else if(strs.length == 1){
            return strs[0];
        }
        return res;
    }
}
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length() < ransomNote.length()) return false;
        
        int[] alphabet = new int[27];
        
        for(char c : magazine.toCharArray()){
            alphabet[c - 'a']++;
        }
        
        for(char c : ransomNote.toCharArray()){
            alphabet[c - 'a']--;
            if(alphabet[c - 'a'] < 0) return false;
        }
        
        return true;
        
    }
}
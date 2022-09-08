class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        char[] chars = s.toCharArray();
        for(int i=0; i<chars.length; i++){
            if(countMap.containsKey(chars[i]))
                countMap.put(chars[i], countMap.get(chars[i]) + 1);
            else
                countMap.put(chars[i], 1);
        }
        
        for(int i=0; i<chars.length; i++){
            if(countMap.get(chars[i]) == 1) return i;
        }
        
        return -1;
    }
}
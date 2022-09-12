class Solution {
    public String reverseWords(String s) {
        
        char[] c = s.toCharArray();
        
        int start = 0, end = 0;
        
        while(end < c.length){
            
            if(c[end] == ' '){
                reverse(c, start, end-1);
                start = end+1;
            }
            end++;
            
        }
    
        reverse(c, start, end-1);
        
        return new String(c);
    }
    
    private void reverse(char[] c, int start, int end){
        while(start < end){
            char tmp = c[end];
            c[end] = c[start];
            c[start] = tmp;
            start++;
            end--;
        }
    }
    
}
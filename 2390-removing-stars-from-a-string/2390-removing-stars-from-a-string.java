class Solution {
    public String removeStars(String s) {
        Stack<Character> chars = new Stack<>();
        StringBuilder res = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == '*'){
                if(!chars.isEmpty()) chars.pop();
            }
            else{
                chars.push(ch);
            }
        }
        
        while(!chars.isEmpty()){
            res.append(chars.pop());
        }
        
        return res.reverse().toString();
    }
}
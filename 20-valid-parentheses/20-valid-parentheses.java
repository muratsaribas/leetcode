class Solution {
    public boolean isValid(String s) {
        Stack<Character> stacks = new Stack<>();
        ArrayList<Character> opened = new ArrayList<>(Arrays.asList('(','{','['));
        ArrayList<Character> closed = new ArrayList<>(Arrays.asList(')','}',']'));
        for (char c : s.toCharArray()){
            if(opened.indexOf(c) > -1 ){
                stacks.push(c);
            }
            else{
                if(stacks.isEmpty()) return false;
                if(closed.indexOf(c) != opened.indexOf(stacks.pop())) return false;
            }
        }
        return stacks.isEmpty();
    }
}
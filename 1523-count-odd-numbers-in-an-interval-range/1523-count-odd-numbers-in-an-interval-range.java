class Solution {
    public int countOdds(int low, int high) {
        
        if((high - low + 1) % 2 == 0) return (high - low)/2 + 1;
        
        if(high % 2 == 0 && low % 2 == 0) return (high - low)/2;
        
        else return (high - low)/2 + 1;
        
    }
}
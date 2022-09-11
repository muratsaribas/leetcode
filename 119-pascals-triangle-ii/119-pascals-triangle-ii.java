class Solution {
    public List<Integer> getRow(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        
        for(int i = 0; i < numRows+1; i++){
            
            List<Integer> row =  new ArrayList<Integer>();
            
            for(int j=0;j < i + 1;j++){
                
                if(j==0 || j == i){
                    row.add(1);
                }
                else{
                    row.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
                }
            }
            res.add(row);
        }
        return res.get(numRows);
    }
}
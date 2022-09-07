class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer, Integer> numset = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<nums[0].length; i++){
            numset.put(nums[0][i], 1);
        }
        for(int i=1; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                 if(numset.containsKey(nums[i][j])){
                    int count = numset.get(nums[i][j]);
                    numset.put(nums[i][j], count + 1);
                }
            }
           
        }
        
        for (Integer key : numset.keySet()) {
            if(numset.get(key) == nums.length) res.add(key);
        }
        
        Collections.sort(res);
        
        return res;
    }
}
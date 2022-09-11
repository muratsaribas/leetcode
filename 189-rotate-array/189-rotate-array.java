class Solution {
    public void rotate(int[] nums, int k) {
        
        if(k == 0) return;
        
        int[] arr = nums.clone();
        
        for(int i = 0; i<arr.length; i++){
            int idx = (i+k) % arr.length;
            nums[idx] = arr[i]; 
        }
    }
}
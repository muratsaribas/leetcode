class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int temp = 0;
        
        for(int i=0; i<nums.length; i++){
            temp = Math.max(nums[i], temp + nums[i]);
            if(max < temp) max = temp;
        }
        
        return max;
        
    }
}
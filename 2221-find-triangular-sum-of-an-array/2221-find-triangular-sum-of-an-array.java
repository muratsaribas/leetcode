class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length == 1) return nums[0];
        int len = 0;
        while(len < nums.length){
            for(int i=0; i<nums.length-1-len; i++){
                nums[i] = (nums[i] + nums[i+1]) % 10;
            }
            nums[nums.length-1] = -1;
            len++;
        }
        return nums[0];
        
    }
}
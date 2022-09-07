class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> nums = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<nums1.length; i++){
            if(!nums.containsKey(nums1[i])){
                nums.put(nums1[i], 1);
            }
            else{
                int count = nums.get(nums1[i]);
                nums.put(nums1[i], count + 1);
            }
        }
        for(int i=0; i<nums2.length; i++){
            if(nums.containsKey(nums2[i])){
                res.add(nums2[i]);
                int count = nums.get(nums2[i]);
                if(count == 1){
                    nums.remove(nums2[i]);
                }
                else{
                    nums.put(nums2[i], count - 1);
                }
                
            }
        }
        
        int[] ret = new int[res.size()]; 
        for(int i = 0; i < res.size();i++){
            ret[i] = res.get(i);
        }
        
        return ret;
    }
}
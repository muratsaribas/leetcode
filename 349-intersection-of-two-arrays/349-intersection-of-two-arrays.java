class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> nums = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<nums1.length; i++){
            nums.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            if(nums.contains(nums2[i])){
                if(!res.contains(nums2[i]))
                    res.add(nums2[i]);
            }
        }
        
        int[] ret = new int[res.size()]; 
        for(int i = 0; i < res.size();i++){
            ret[i] = res.get(i);
        }
        
        return ret;
    }
}
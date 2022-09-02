class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int[] mergedArr = new int[nums1.length + nums2.length];
        int p1 = 0;
        int p2 = 0;
        for(int i=0; i<(nums1.length + nums2.length); i++){
            if(p1 > nums1.length - 1){
                mergedArr[i] = nums2[p2];
                p2++;
            }
            else if(p2 > nums2.length - 1){
                mergedArr[i] = nums1[p1];
                p1++;
            }
            else{
                if(nums1[p1] > nums2[p2]){
                mergedArr[i] = nums2[p2];
                p2++;
                }
                else{
                    mergedArr[i] = nums1[p1];
                    p1++;
                }
            }
            
        }
        if(mergedArr.length % 2 != 0){
            return mergedArr[mergedArr.length/2];
        }
        return ((double)mergedArr[mergedArr.length/2] + (double)mergedArr[mergedArr.length/2 - 1])/2;
    }
}
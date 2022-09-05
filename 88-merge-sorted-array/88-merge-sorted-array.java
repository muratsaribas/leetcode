class Solution {
    public static void insertionSort(int array[]) {
        int size = array.length;

        for (int step = 1; step < size; step++) {
          int key = array[step];
          int j = step - 1;


          while (j >= 0 && key < array[j]) {
            array[j + 1] = array[j];
            --j;
          }


          array[j + 1] = key;
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=0;
        for(int i=m; i<nums1.length; i++){
            nums1[i] = nums2[p1];
            p1++;
        }
        insertionSort(nums1);
    }
}
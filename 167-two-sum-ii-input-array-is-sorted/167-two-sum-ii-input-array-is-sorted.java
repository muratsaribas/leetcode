class Solution {
    
    int binarySearch(int array[], int element, int low, int high) {

        while (low <= high) {

          int mid = low + (high - low) / 2;

          if (array[mid] == element)
            return mid;

          if (array[mid] < element)
            low = mid + 1;

          else
            high = mid - 1;
        }

        return -1;
    }
    
    public int[] twoSum(int[] numbers, int target) {
        
        int[] res = new int[2];
        
        for(int i=0; i<numbers.length; i++){
            int newTarget = numbers[i] > 0 ? target-numbers[i] : target+Math.abs(numbers[i]);
            int other = binarySearch(numbers, newTarget, i+1, numbers.length-1);
            if(other != -1){
                res[0] = i+1;
                res[1] = other+1;
                return res;
            }
        }
        
        return res;
        
    }
}
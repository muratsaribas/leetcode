class Solution {
    public double average(int[] salary) {
        double min = salary[0];
        double max = salary[0];
        double sum = salary[0];
        
        for(int i = 1; i<salary.length; i++){
            if(salary[i] < min) min = salary[i];
            else if(salary[i] > max) max = salary[i];
            sum += salary[i];
        }
        
        sum = sum - min - max;
        
        return sum / (salary.length - 2);
        
    }
}
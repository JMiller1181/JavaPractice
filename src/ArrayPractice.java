import java.util.Arrays;

public class ArrayPractice {
    public ArrayPractice(){

    }
    public int countEvens(int[] nums) {
        //init a variable for counting
        int evenCount = 0;
        //for each number in the array
        for(int num: nums){
            //if num % 2 has no remainder it is even, add to the counter
            if(num % 2 == 0){
                evenCount += 1;
            }
        }
        return evenCount;
    }
    public int bigDiff(int[] nums) {
        //init variables for comparison
        int min = nums[0];
        int max = nums[0];
        //iterate through the array
        for(int num: nums){
            //compare numbers and set values as needed
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        //return difference
        return max - min;
    }
    public int centeredAverage(int[] nums) {
        //sort the array to put the smallest and largest at the ends of the array
        Arrays.sort(nums);
        //init variable for adding the numbers
        int sum = 0;
        //iterate through the array ignoring the first index and last
        for(int i = 1; i < nums.length - 1; i++){
            //add the numbers
            sum += nums[i];
        }
        //divide by size minus the two removed numbers
        return sum / (nums.length - 2);
    }

}

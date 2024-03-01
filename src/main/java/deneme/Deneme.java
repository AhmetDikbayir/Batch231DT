package deneme;

import java.util.Arrays;
import java.util.Collections;

public class Deneme {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 100};
        int result = centeredAverage(nums);
        System.out.println(result);

    }

    public static int centeredAverage(int[] nums) {
        //int[] nums = {1, 2, 3, 4, 100};
        int avg = 0;
        int sum = 0;
        Arrays.sort(nums);
        int[] newNums = new int[nums.length - 2];
        for (int i = 1; i <= newNums.length; i++) {
            newNums[i-1] = nums[i];
        }

        for(int w : newNums){
            sum += w;
        }

        avg = sum/newNums.length;
        return avg;
    }
}


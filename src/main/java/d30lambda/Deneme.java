package d30lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Deneme {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 2, 4, 5, 11, 10));
        maksimum4(nums);
        

    }

    public static void maksimum4(List<Integer> nums){

        Integer max = nums.stream().distinct().reduce(Math::min).get();
        System.out.println(max);
    }



}



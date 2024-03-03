package d30lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deneme {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 2, 4, 5, 11, 10));
        minimum2(nums);

    }

    public static void maksimum2(List<Integer> nums) {
        int max = nums.stream().distinct().reduce(nums.get(0), (t, u) -> t > u ? t : u);
        System.out.println(max);
    }

    public static void minimum2(List<Integer> nums) {
        int min = nums.stream().distinct().reduce(nums.get(0), (t, u) -> t < u ? t : u);
        System.out.println(min);
    }


}



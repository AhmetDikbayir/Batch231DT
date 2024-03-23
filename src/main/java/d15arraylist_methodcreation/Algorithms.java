package d15arraylist_methodcreation;

import java.util.Arrays;

public class Algorithms {
    public static void main(String[] args) {
        int[] nums = {555,90,48254,17723};
        System.out.println(Arrays.toString(nums));
        int counter = 0;
        int res = 0;
        for(int num : nums){
            while(num!=0){
                num/=10;
                counter++;
            }
            if(counter%2 == 0){
                System.out.println("even");
                res++;
            }else {
                System.out.println("odd");
            }
            counter=0;
        }
        System.out.println(res);
    }
}

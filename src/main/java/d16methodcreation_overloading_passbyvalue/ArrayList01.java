package d16methodcreation_overloading_passbyvalue;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        //Ornek 1: Bir tane Integer List olusturunuz.Interview Sorusu
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz.
        //           [12, 23, 10, 19] ==> 12 ve 10

        //Iki turlu sort() kullanabiliriz,
        //1- ArrayList icinde olan (Java 8 sonrasi cikti)
        //2- Collections icinde olan sort()

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(23);
        nums.add(12);
        nums.add(10);
        nums.add(9);

        //Collection.sort(nums);
        nums.sort(null);
        System.out.println(nums);

        int minFark = nums.get(1) - nums.get(0); //minfark kabulu yaptık.

        for(int i =1; i<nums.size()-1; i++){
            minFark = Math.min(minFark, nums.get(i) - nums.get(i-1));
        }
        System.out.println(minFark);

        for(int i =1; i<nums.size(); i++){
            if(nums.get(i) - nums.get(i-1) == minFark){
                System.out.println(nums.get(i) + " ve " + nums.get(i-1));
            }
        }
    }
}

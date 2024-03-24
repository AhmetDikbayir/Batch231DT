package d15arraylist_methodcreation;

import java.util.ArrayList;
import java.util.Arrays;

public class Algorithms {
    public static void main(String[] args) {

        //Find the even digit of numbers in array
        /*int[] nums = {555,90,48254,17723};
        //System.out.println(Arrays.toString(nums));
        int counter = 0;
        int res = 0;
        for(int num : nums){
            while(num!=0){
                num/=10;
                counter++;
            }
            if(counter%2 == 0){
                //System.out.println("even");
                res++;
            }else {
                //System.out.println("odd");
            }
            counter=0;
        }
        //System.out.println(res);

        //Sort the square of the array elements
        int[] arr = {-4,-1,0,3,10};
        //Lambda solution:
        Arrays.stream(arr).sequential().map(t->t*t).sorted().forEach(t-> System.out.println(t));

        //Structural solution
        int[] newArr = new int[arr.length];
        int index = 0;
        for(int w : arr){
            newArr[index] = w*w;
            index++;
        }
        Arrays.sort(newArr);
        System.out.println(Arrays.toString(newArr));
*/
        //Return the unique number in the list
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int k = 1;
        ArrayList<Integer> list = new ArrayList<>();
        for(int w : nums){
            list.add(w);
        }
        System.out.println(list);
        ArrayList<Integer> newList = new ArrayList<>();
        for(Integer w : list){
            if(!newList.contains(w)){
                newList.add(w);
            }
        }
        System.out.println(newList);

    }
}

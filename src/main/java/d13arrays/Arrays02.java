package d13arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Ornek 1: int turunde ages isminde bir Array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //           bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz

        int[] ages = {20, 23, 19, 44, 15, 32};

        //sort() methodu sayilari kucukten buyuge siralar (ascending order)
        //String data tiplerini alfabetik siralar (alphabetical order)
        //ascending order + alphabetical order = natural order
        //sort() methodu Array elemanlarini natural order'a gore siralar

        //1. yol:
        Arrays.sort(ages);
        System.out.println(ages[0] + ages[ages.length-1]);
        System.out.println(Arrays.toString(ages));

        //2.yol:

        int minimum = ages[0];
        int maximum = ages[0];

        for(int w : ages){
            minimum = Math.min(minimum, w);
            maximum = Math.max(maximum, w);
        }

        System.out.println(maximum + minimum);


    }
}

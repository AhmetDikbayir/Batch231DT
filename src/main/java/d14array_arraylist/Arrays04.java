package d14array_arraylist;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        //Ornek 4: [0, 2, 3, 0, 12, 0] arrayinde tum sifirlari sona yerlestiriniz.
        // Interview Sorusu
        //         [0, 2, 3, 0, 12, 0] ==> [2, 3, 12, 0, 0, 0]

        int[] arr = {0, 2, 3, 0, 12, 0};
        int[] yeniArr = new int[arr.length];

        int ilkIndex = 0;
        for(int w : arr){
            if(w != 0){
                yeniArr[ilkIndex] = w;
                ilkIndex++;
            }
        }

        System.out.println(Arrays.toString(yeniArr));
        System.out.println("----------------");

        //--------------------
        //Benim çözümüm:
        /*
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] b = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            b[i] = arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(b));


         */
        //---------------------------
        //Arraylerin esit olup olmadigi nasil anlasilir?

        int[] a = new int[3];
        a[0] = 2;
        a[1] = 1;
        a[2] = 3;

        int[] b = new int[3];
        b[0] = 2;
        b[1] = 3;
        b[2] = 1;

        //iki arrayin ayni olabilmesi icin, ayni index te ayni elemanlarin bulunmasi gerekir

        boolean result = Arrays.equals(a,b);
        System.out.println("result = " + result);

    }
}

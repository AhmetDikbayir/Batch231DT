package d13arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arrays03 {
    public static void main(String[] args) {
        //Ornek 1: Bir int array olusturun ve 5 ten kucuk olan elemanlari yazdirin.
        //      [12, 3, -3, 5, 23] ==> 3, -3

        //Array leri kisa yoldan nasil olusturabiliriz? =’den sonra {} acar, degerleri yazariz
/*
        int[] numbers = {12, 3, -3, 5, 23};

        System.out.println(Arrays.toString(numbers));

        for(int w : numbers){
            if(w < 5){
                System.out.print(w + " ");
            }
        }
        System.out.println("-----------------------");
        //-------------------------
        //Ornek 2: Spesifik bir elemanin Array'de olup olmadigini anlamak icin gereken kodu yaziniz

        //binarySearch() methodu var olan elemanlar icin size o elemanin index'ini verir
        //binarySearch() methodunu sort() kullanmadan kullanmayiniz
        //binarySearch() methodu olmayan elemanlar icin size negatif tamsayi verir
        // "-" ==> isaretinin anlami eleman yok demektir

        /*
        Yani, metot şu şekilde çalışır:
            Diziyi ikiye bölün.
            Aranan değer, ortadaki elemana eşitse, arama tamamlanır.
            Aranan değer, ortadaki elemandan küçükse, dizinin sol yarısında aramaya devam edilir.
            Aranan değer, ortadaki elemandan büyükse, dizinin sağ yarısında aramaya devam edilir.
            Bu işlem, aranan değer bulunana veya dizi içinde aranacak bir alt dizi kalmayana kadar tekrar edilir.
         */

        //AARAYLIST BINARY SERACH KULLANIMI
        // Sıralı bir ArrayList oluştur
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(3);
        number.add(5);
        number.add(7);
        number.add(9);

        // binarySearch() metodunu kullanarak 5 sayısının index'ini bul
        int index = Collections.binarySearch(number, 15);

        // Sonucu yazdır
        if (index >= 0) {
            System.out.println("5 sayısı listenin " + index + ". index'inde bulundu.");
        } else {
            System.out.println("5 sayısı listenin içinde bulunamadı.");
        }
        System.out.println(number + " " + index);

        String[] names = {"A", "T", "K", "E", "B"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        int result = Arrays.binarySearch(names, "C");//Olmadığı durumda olsaydı olacağı sırayı veriyor.
                                                            //Olduğu durumda indeksi veriyor.
        System.out.println(result);

        int[] arr = {2, 1, 7, 6};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 7));//Olduğu durumda indeksi veriyor.
        System.out.println(Arrays.binarySearch(arr, 3));//Olmadığı durumda olsaydı olacağı sırayı veriyor.
        System.out.println(Arrays.binarySearch(arr, 9));//-5

        String[] str = {"A", "C", "B", "D"};

        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.binarySearch(str, "A"));//0
        System.out.println(Arrays.binarySearch(str, "C"));//2
        System.out.println(Arrays.binarySearch(str, "E"));//-5
        System.out.println(Arrays.binarySearch(str, "G"));//-5

        //Ornek 3: Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.
        //String s = "Java is easy. Learn Java earn money.";
        String s = "Java is easy. Learn Java earn money.";


        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);
    }
}

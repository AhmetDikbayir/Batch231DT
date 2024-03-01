package d14array_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList01 {
    public static void main(String[] args) {
        //ArrayList nedir?
        /*
            ArrayList (class'tır), dinamik bir array yapısıdır. Bu, ArrayList'in boyutunun, elemanlar ekleme veya çıkarma
             sırasında otomatik olarak ayarlanabileceği anlamına gelir.

            Gerçek hayattan bir örnek olarak, bir alışveriş listesi ArrayList olarak temsil edilebilir.
            Alışveriş listesi, ürünlere ait isimlerin bir listesini içerir. Ürünler, String referans türleridir.
        */

        /*
            1)Array'ler primitive data type'lari ve reference'lari depolayabilir ama Arraylist'ler non-primitive'leri (reference'lari) depolar
            2)ArrayListler memory'de Array'lerden daha fazla yer kaplar
            3)Array'ler olusturulurken bastan eleman sayisini belirtmek zorundayiz
            4)ArrayList'ler eleman sayisinda esnektirler.

            5) Array'leri Java niye iptal etmedi?
                a) Array'ler cok daha hizlidir
                b) Array'ler memory'de cok az yer kaplarlar
                c) Bu nedenle eleman sayisi belli olan datalari depolamak icin Array'ler tercih edilir

            6) Java'da generic (kapsamli) türler (<> ile belirtilen türler) için yalnızca referans veri türleri kullanılabilir. Primitive veri türleri (örneğin int, char, boolean, double, vb.) doğrudan generic türlerin içine yerleştirilemez. Bu nedenle, özel bir durumla karşılaştığınızda, bu türleri ilgili sınıflarla sarmalamanız (wrapper) gerekir.
        */
        //ARRAYLER JAVADA ÖZEL BİR TÜRDÜR.

        //ArrayList nasil olusturulur?

        //ArrayList<Integer> ages = new ArrayList<Integer>(); // İkinci Integer yazmak zorunda değiliz.
        ArrayList<Integer> ages = new ArrayList<>(); //Type Inference - Tip Çıkarımı

        //ArrayList’lere eleman nasil eklenir?

        //add() metodu, ArrayList'e yeni bir eleman eklemek için kullanılır ve
        // eklenen elemanı listenin sonuna yerleştirir.

        ages.add(9);
        ages.add(12);
        ages.add(5);
        System.out.println(ages);
        //List’te araya eleman eklemek icin index numarasini yazariz

        //add(int index, E element): Bu metot, belirtilen elemanı ArrayList’in belirtilen konumuna ekler.
        // Mevcut elemanlar sağa kaydırılır.

        ages.add(1,28);
        System.out.println(ages);

        ages.add(3,7);
        System.out.println("ages = " + ages);

        //Listenin sonuna eklemek için indeks saymaya gerek yok.
        ages.add(15);
        System.out.println("ages = " + ages);

        //Ornek 1: Verilen Integer List’i, ages List’inin icine koyunuz

        //addAll() metodu, bir koleksiyondaki tüm öğeleri mevcut ArrayList’e eklemek için kullanılır.
        // Bu metod, genellikle bir ArrayList’i başka bir koleksiyonun öğeleriyle genişletmek istediğinizde kullanışlıdır.

        //addAll(int index, Collection<? extends E> c): Bu metod, belirtilen koleksiyondaki tüm öğeleri ArrayList'in
        // belirtilen indeksinden başlayarak ekler. Bu işlem sırasında, var olan öğeler sağa kaydırılır.

        ArrayList<Integer> newAges = new ArrayList<>();

        newAges.add(1);
        newAges.add(2);
        newAges.add(3);

        ages.addAll(newAges);
        System.out.println(ages);

        ages.addAll(0,newAges);
        System.out.println("ages = " + ages);

        ages.addAll(2, newAges);
        System.out.println("ages = " + ages);

        //size() metodu, ArrayList’teki öğelerin sayısını döndürür. (int return eder)
        int elemanSayisi = ages.size();
        System.out.println(elemanSayisi);

        System.out.println("------------------------");
        int[] number = new int[5];

        //number2[4] =7;
        number[2] = 8;
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ali","Ahmet"));
        ArrayList<String> lastNames = new ArrayList<>(Arrays.asList("Deli","Afacan"));
        names.addAll(1, lastNames);
        names.add("Veli");
        //names.add(1, "Veli");
        System.out.println(names);
        System.out.println(Arrays.toString(number));


    }
}

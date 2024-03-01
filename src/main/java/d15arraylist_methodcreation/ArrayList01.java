package d15arraylist_methodcreation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
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

        /*

        ages.addAll(newAges);
        System.out.println(ages);

        ages.addAll(0,newAges);
        System.out.println("ages = " + ages);

        ages.addAll(2, newAges);
        System.out.println("ages = " + ages);

        //size() metodu, ArrayList’teki öğelerin sayısını döndürür. (int return eder)
        int elemanSayisi = ages.size();
        System.out.println(elemanSayisi);

        //get(int index) metodu Arraylistte belirli bir konumdaki ogeye ulaşmak için kullanılır.
        Integer eleman = ages.get(3);
        int eleman1 = ages.get(6); //6. indeksteki 9 gelir.
        System.out.println(eleman);
        System.out.println(eleman1);

        //set(int index, E element) metodu, ArrayList'te belirtilen indeksteki öğeyi verilen yeni öğeyle değiştirir.
        // Bu metot, listedeki bir öğeyi güncellemek için kullanılır. Metot, eski öğeyi döndürür.
        Integer a = ages.set(0,15);
        System.out.println(a);
        System.out.println(ages);

         */

    }
}

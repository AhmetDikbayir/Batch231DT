package d28exceptions_enum_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators {
    public static void main(String[] args) {
        /*
        1-  Iterator'ler loop'larin yaptigi ayni isi yapar
        2)  Iterator'lerde sonsuz loop olusma ihtimali yoktur(for each gibi)
        3)  Iterator'ler ile loop'lar arasinda performans farki yoktur
        ****4)  Iterator'ler bir collection'dan eleman silme ve bir collection'daki elemani degistirme
        konusunda daha basarilidir****(For each e göre daha başarılı)
        5) Iki tip iterator vardir:
            a) Iterator:
            Bu sadece eleman silmede kullanilir, eleman eklemek veya elemani degistirmek mumkun degildir
            b) ListIterator:
            Bu eleman silebilir, ekleyebilir ve degistirebilir

            Not:
            Iterator, sadece soldan saga (ilk elemandan son elemana) calisir
            ListIterator iki yonlu calisabilir
         */

        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Fatma");
        myList.add("Tom");

        System.out.println(myList);

        //myList üzerinde bir döngü oluşturalım
        Iterator<String> myItr = myList.iterator();

        //hasNext() : Koleksiyonun bir sonraki elemaninin olup olmadigini kontrol eder(boolean)
        //next() : Pointer'i bir sonraki elemanin onune konumlandirir ve pointer'in atladigi elemani verir
        //remove() : Pointer'in atladigi elemani siler

        //**specific bir elemani iterator ile nasil silebiliriz? (Tom’u silelim)

        while (myItr.hasNext()){//en başa konumlanan pointerdan sonra eleman var mı diye bakar
            String s = myItr.next();
            if(s.equalsIgnoreCase("tom")){
                myItr.remove();

            }
        }

//        while (myItr.hasNext()){//en başa konumlanan pointerdan sonra eleman var mı diye bakar
//            myItr.next(); //pointeri 2. elemanın onune alir ve atladigi elemani verir
//            myItr.remove();//next'in verdiği elemanı siler
//
//        }
        System.out.println(myList);
    }
}

package d29iterators_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Iterators {
    public static void main(String[] args) {
        List<String> yourList = new ArrayList<>(Arrays.asList("Ali", "Can", "Aliye"));
        System.out.println(yourList);

        ListIterator<String> yourListItr = yourList.listIterator();

        //1) set(E e): Koleksiyonun geçerli elemanını değiştirir.

        while(yourListItr.hasNext()){
            String el = yourListItr.next();
            yourListItr.set(el + "*");
        }
        System.out.println(yourList);

        //2)elemanlari sondan basa dogru yazdirin
        List<String> yourList2 = new ArrayList<>(Arrays.asList("Ali", "Can", "Aliye"));

        ListIterator listItr2 = yourList2.listIterator();

        //Bu loop pointer'ı en sona almak için yazildi
        while(listItr2.hasNext()){
            listItr2.next();
        }
        //elemanlari sondan basa dogru yazdirin
        while(listItr2.hasPrevious()){//öncesinde eleman var mı diye bakar
            String el = (String) listItr2.previous(); //previous() pointer ' i sagdan sola alir
            System.out.println(el + "<--");
        }

//        List<String> yourList2 = new ArrayList<>(Arrays.asList("Ali", "Can", "Aliye"));
//        System.out.println(yourList2); //[Ali, Can, Aliye]
//
//        ListIterator<String> listItr2 = yourList2.listIterator(); //[Ali, Can, Aliye]
//
//        //Bu loop pointer'in en saga almak icin yazildi
//        while (listItr2.hasNext()){
//            listItr2.next();
//        }
//        //elemanlari sondan basa dogru yazdirin
//        while (listItr2.hasPrevious()){ //hasPrevious() onceli eleman var mi diye bakar
//            String el = listItr2.previous(); //previous() pointer'i sagdan sola alir
//            System.out.println(el + " <-- ");
//        }

    }
}

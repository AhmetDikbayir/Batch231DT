package d16methodcreation_overloading_passbyvalue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        //Bir listi oluşturmak için kısa yol
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 4, 9, 7));
        System.out.println(myList);



        //asList metodu constructor içinde kullanılmazsa sorun oluşur fakat constructor içinde oluşturulursa sorun olmaz.
        //asList metodu kullanarak kısa yoldan list oluşturabiliriz ama bunu kullanmanın
        // bazı handikapları vardır. List'imiz arka planda Array gibi çalışmaya başlar.
        //Yani List'in eleman sayisini değiştiren metodları kullanamazsınız. (Immutable)

        myList.remove(0); //HATA
        //myList.add(5); //HATA
        //clear() metodu bir listedeki tüm elemanları silmek için kullanılır.
        //myList.clear(); //HATA

        //myList.set(0,5);
        System.out.println(myList);
        System.out.println(myList.size());

    }
}

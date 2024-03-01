package d24collections;

import java.util.HashMap;

public class Maps01 {
    public static void main(String[] args) {
        //1) Map’ler sozluk gibidir. Aciklamalidir. orn: Ali = 13 .Map’ler collections degildir. Ordan miras almaz

        //2) Sol taraf yani key’ler tekrarsizdir. Value tarafi tekrarli olabilir.

        //3) Key tarafi icin Set kullanilir. Values için ise genellikle Collection yapısı kullanılır.

        //4) Map’in elemanlarina komple ‘entry set’ (giris elemani) denir.

        //Map nasil olusturulur?

        //1) HashMap: Key-value çiftlerini rastgele bir sırayla depolayan bir Map türüdür.En hizlisidir.
        HashMap<String, Integer> myMap = new HashMap<>();

        //put():Bir key-value çiftini map’e ekler.
        myMap.put("Ali Can", 12);
        myMap.put("Veli Han", 18);
        myMap.put("Ayşe Kaya", 15);
        myMap.put("Fatma Kaya", 19);
        System.out.println(myMap);

        myMap.put("Ali Can", 25); //key tekrarli kullanildiginda son value aktif olur (override eder) uzerine yazar
        System.out.println(myMap);


    }
}

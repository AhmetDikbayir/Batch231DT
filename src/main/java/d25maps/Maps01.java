package d25maps;

import java.util.*;

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

        //Sadece ‘key’ degerlerini nasil alabiliriz?

        //keySet(): Map’teki tüm key’lerin bir set’ini döndürür.Set’in sırası rastgeledir.
        Set<String> keyTarafi = myMap.keySet();
        System.out.println(keyTarafi);

        //Sadece ‘value’ degerlerini nasil alabiliriz?

        //values():Map’teki tüm value’ların bir collection’ını döndürür.Collection’ın sırası rastgeledir.

        Collection<Integer> valueTarafi = myMap.values(); //ODEV: Collection yerine List turu yazilabilir mi?
        List<Integer> valTarafi = new ArrayList<>(myMap.values());

        System.out.println("--------------");
        System.out.println(valTarafi);
        System.out.println("--------------");

        System.out.println(valueTarafi);

        //-----------------------------

        //get(): Bir key’e karşılık gelen değeri döndürür.key verirsiniz value’sunu getirir
        int age = myMap.get("Ali Can");
        System.out.println(age);

        //-----------------------------
        //Ornek 1: myMap’deki kisilerin yaslarinin ortalamasi nedir?

        double sum = 0;
        Collection<Integer> ages = myMap.values();
        for(Integer w : ages){
            sum += w;
        }
        double avg = sum/ages.size();
        System.out.println(avg);

        //entrySet() metodu, HashMap’in tüm degerlerini içeren bir Set döndürür.
        // Dongu gibi ayri satirlarda yazdirir.Cunku Loop’lar direkt Map’ler ile kullanilamaz.
        //Bu yuzden ozel method gelistirilmis. Set’in icinde Map yapisi saklanir.

        System.out.println(myMap); //{Ali Can=25, Ayşe Kaya=15, Veli Han=18, Fatma Kaya=19}

        Set<Map.Entry<String, Integer>> myEntrySet = myMap.entrySet();
        System.out.println("myEntry Set : " +myEntrySet);

        for(Map.Entry<String, Integer> w : myEntrySet){
            System.out.println(w);
        }

        int sum3 = 0;

        Set<Map.Entry<String, Integer>> myEntrySet2 = myMap.entrySet();
        for(Map.Entry<String, Integer> w : myEntrySet2){
            sum3 += w.getKey().length() + w.getValue();
        }
        System.out.println("sum3 = " + sum3);

        System.out.println("-----------------------------");
        //Ornek 2: Verilen Map’deki kisi isimlerinin character sayisi ile yaslarinin toplamini bulunuz.
        //Java’da Map.Entry kullanarak bir Set üzerinde loop yapabilir ve
        // hem anahtarları (getKey()) hem de değerleri (getValue()) elde edebilirsiniz.

        HashMap<String, Integer> kisiler = new HashMap<>();

        kisiler.put("Ali", 3);
        kisiler.put("Can", 5);
        kisiler.put("Ayse", 2);

        int total =0;

        Set<Map.Entry<String, Integer>> myKisiler = kisiler.entrySet();

        for( Map.Entry<String, Integer> w : myKisiler){
            total += w.getKey().length() + w.getValue();
        }

        System.out.println(total);


    }
}

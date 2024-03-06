package d25maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps02 {
    public static void main(String[] args) {
        HashMap<String, Integer> stdNames = new HashMap<>();

        stdNames.put("Ali", 18);
        stdNames.put("Can", 19);
        stdNames.put("Tom", 33);
        stdNames.put("Veli", 63);
        stdNames.put("Ahmet", 41);

        //key'i tekrarli kullandimizda hata vermiyordu ama bu sekilde yapmak best practice degildir
        //stdNames.put("Tom", 35);
        //System.out.println(stdNames);

        //1) replace() methodu value’lari key’leri kullanarak update etmeye yarar
        //Aynı işlemi put ile yapmak da teknik olarak işe yarar, ancak replace kullanmak,
        // kodunuzu okuyan diğer geliştiricilere ve size daha net bilgi verir.

        stdNames.replace("Tom", 39);
        System.out.println(stdNames);

        //2) replace() methodu eski deger kontrolu yaparak ta calisir
        stdNames.replace("Tom", 21,45); //Tom'un value'su 21 ise 45 yap
        System.out.println(stdNames); //Değişiklik olmaz.

        stdNames.replace("Tom", 39,45); //Tom'un value'su 39 ise 45 yap
        System.out.println(stdNames); //Değişiklik oldu.

        System.out.println("------------------");

        //3)putIfAbsent() metodu, belirtilen key ve value çiftini, key Map'te yoksa Map'e ekler.
        // Key Map'te zaten varsa, metodun hiçbir etkisi olmaz.

        stdNames.putIfAbsent("Tom", 77);
        System.out.println(stdNames); //77 eklemez çünkü key olan Tom map te var.

        stdNames.putIfAbsent("Ayse", 23);
        System.out.println(stdNames);

        System.out.println("------------------");
        //4- get() ve getOrDefault() method’lari eger aranan eleman map’te var ise, ikisi de ayni isi yapar
        //key verirsiniz, size value verir

        System.out.println(stdNames.get("Tom"));
        System.out.println(stdNames.getOrDefault("Tom", 18)); //45 Tom'un orjinal değeri geldi.

        //Kullanıcının oturum açıp açmadığını bunula kontrol edebilirsiniz.
        System.out.println(stdNames.get("Jerry"));//null
        System.out.println(stdNames.getOrDefault("Jerry", -1));//Jerry olmadığı için 18 getirdi.

        //5)containsKey() metodu, Map’te bir key olup olmadığını kontrol eder.
        //containsValue() metodu ise, Map’te bir value olup olmadığını kontrol eder.
        //Boolean return ederler

        Boolean b = stdNames.containsValue(19);
        System.out.println(b);//True
        System.out.println(stdNames.containsValue(99));//False

        System.out.println(stdNames.containsKey("Tom"));//true
        System.out.println(stdNames.containsKey("TOM"));//False

        //------------------------------------ buyuk /kucuk harf duyarlılığını ortadan kaldıralım
        Map<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Tom".toLowerCase(), 25);
        stdAges.put("Jerry".toLowerCase(),22);
        System.out.println(stdAges);//{tom=25, jerry=22}

        boolean cki = stdAges.containsKey("Tom".toLowerCase());
        System.out.println(cki);

        Set<Map.Entry<String, Integer>> stdAgesSet = stdAges.entrySet();
        for(Map.Entry<String, Integer> w : stdAgesSet){
            w.getKey().toUpperCase();
            System.out.println(w);
        }



        //------------------------------------

        //6)remove(“Tom”); methodu key kullanarak entry silmeye yarar
        stdNames.remove("Tom"); // Mapde değer küçük harf olursa silmez.
        System.out.println(stdNames);

        //remove(“Can”,19); methodu hem key hemde value’yu kontrol eder eslesirse siler yoksa silmez
        System.out.println(stdNames.remove("Can", 18)); //Doğrudan yazdırınca false veriyor.
        System.out.println(stdNames);//{Can=19, Ahmet=41, Veli=63, Ayse=23, Ali=18}
        // Can silinmez, value'su 19 olsaydi silinirdi

    }
}

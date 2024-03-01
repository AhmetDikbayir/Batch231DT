package d18datetime_stringbuilder;

public class Sb01 {
    public static void main(String[] args) {
        /*
            1) "StringBuilder" class da String ureten bir class tir.
            2) String class kullanarak String üretiriz, Java nicin StringBuilder classi da olusturdu?
                String class "immutable" (degistirilemez) String uretir,
                StringBuilder Class "mutable"(degistirilebilir) String üretir.
            3) "immutable" olmak demek orjinal degerin korunmasi, değistirilemez olmasi demektir
                "mutable" olmak demek orjinal degerin değistirilebilir olmasi demektir
            4) Bu nedenle, metin üzerinde sık sık ekleme, çıkarma veya değişiklik yapmanız gereken durumlarda
                StringBuilder kullanmak, daha verimli ve performanslı bir seçenek olabilir.
            5)StringBuilder, metin verilerini eklemek, çıkarmak, değiştirmek veya döndürmek için çeşitli yöntemler
             ve işlevler içerir. Bunlar arasında append, delete, insert, replace gibi sık kullanılan yöntemler bulunur.
          */
        String s = "Java";
        String t = s + "x";
        System.out.println(s);
        System.out.println(t);

        //Bir String variable olusturup, sonra ona baska String degerleri concatinate ettiginizde,
        // her seferinde heap memory'de yeni bir String objesi olusur. Orjinal deger degismez

        String c = "Ali";
        String d = "Ali";


        String e = new String("Ali");

        //String Pool
        //Bellek Verimliliği - avantaj
        //Esneklik eksikliği - dezavantaj
        //-------------------------------

        //StringBuilder b = "Ali";  bu şekilde object üretmeyiz. "" String üretir.


        //append() metodu, StringBuilder nesnesine yeni bir String eklemek için kullanılır.

        StringBuilder sb1 = new StringBuilder("Python");
        System.out.println(sb1);

        sb1.append("!");
        System.out.println(sb1);

        //Peki, bir String’i degistirdikten sonta tekrar ayni String’e yuklersem orjinal deger degismez mi?

        String a = "money";
        System.out.println(a);

        a = a + " more";

        System.out.println(a);

        /*
            1-String'i degistirdikten sonra ayni String'e assign ederseniz Java yine yeni bir container olusturur.
            2-Degismis degeri bu yeni container'in icine koyar ve eski container'i gosteren
            pointer yeni container'a yonlendirilir
            3-Dolayisiyla eski container adressiz kalir ve "Garbage Collector-cop toplayici"
            adressiz olan container'lari siler. GC bellek sızıntılarını önler.
            GC, Java'nın birçok uygulama için güvenli ve verimli bir dil olmasını sağlayan önemli bir özelliktir.
            Veri memory'de sahipsiz ve guvenliksiz bir sekilde beklemez.
            4-GC'nin çalışma zamanlaması tamamen JVM (Java Virtual Machine) tarafından kontrol edilir
            ve uygulamadan bağımsızdır
          */

        //capacity() methodu, ayrılmış olan ve henüz kullanılmayan karakter alanının büyüklüğünü ifade eder.
        //append() metodu, StringBuilder nesnesine yeni bir String eklemek için kullanılır.

        StringBuilder sb2 = new StringBuilder();

        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        sb2.append("Java");
        sb2.append("xxxxxxxxxxxxxxx");
        sb2.append("xxxxxxxxxxxxxxx4");
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());



    }
}

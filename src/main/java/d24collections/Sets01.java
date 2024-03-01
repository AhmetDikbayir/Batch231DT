package d24collections;

import java.util.*;

public class Sets01 {
    public static void main(String[] args) {


        //Set’ler tekrarsiz(unique) datalari depolamak icin kullanilir. Ornegin; e-mail, tc kimlik no, il plaka no

        /*Java'da üç tür set vardır:
        1) HashSet: Bu set, elemanların hash kodlarına göre depolandığı bir settir. Elemanlar,
        her birinin benzersiz bir hash kodu (kimlik numarası) ile depolandığı bir yapıda tutulur.
        Bir eleman eklediğinizde, bu elemanın hash kodu hesaplanır ve o hash koduna karşılık gelen
        bir hücreye yerleştirilir.

        HashSet'ler, en hızlı performansı sunar.Ancak, elemanların sırasını korumazlar.
        null'i eleman olarak kabul ederler */

        //Hash kodu gormek istersek

        String a = "Aliye Canan.";
        System.out.println(a.hashCode()); //Stringde farklılık yaptıkça her seferde farklı kodlar üretebiliyor, aynı da olabilir

        /*2) LinkedHashSet:Bu set, elemanların eklenme sırasına göre(insertion order) depolandığı
        bir settir.

        ***** LinkedHashSet class'i, HashSet class'inin child'idir. *****

        LinkedHashSet'ler, elemanların sırasını korumaya ihtiyaç duyulan uygulamalar için iyi bir seçimdir.
        Ancak, HashSet'lerden daha yavaş performans sunarlar. (orta)

        Ornegin; Okullarda kayit sirasina gore ogrenci bilgilerini tutmak isterseniz kullanabilirsiniz

        3) TreeSet:Bu set, elemanların doğal sırasına(natural order-kucukten buyuge) göre depolandığı bir settir.
        HashSet'ler ve LinkedHashSet'lerden daha yavaş performans sunarlar.
        Java'da TreeSet, SortedSet arayüzünü(interface) uygulayan bir class'tir.
        Bu nedenle, TreeSet bir Sorted Set'tir.*/


        //HashSet nasil olusturulur?

        HashSet<String> hs = new HashSet<>();
        System.out.println(hs); //[] içinde hiçlik var, null yok

        hs.add("Ali");
        hs.add("Veli");
        hs.add("Burcu");
        hs.add("Ayşe");
        hs.add("Deniz");
        System.out.println(hs);
        System.out.println(hs.hashCode());

        hs.add("Deniz"); // tekrarlı eleman hata vermez, tekrarlı elemanın üzerine yazar
        System.out.println(hs);
        System.out.println(hs.hashCode()); // Aynı elemanı ekleyince hashCode() değişmez.

        hs.add(null); //HashSet'e null ekleyebilirsiniz.
        System.out.println(hs);
        System.out.println(hs.hashCode());

        //-------------------- Set' eleman eklemenin kısa yolu

        HashSet<String> hs2 = new HashSet<>(Arrays.asList("Ali", "Veli"));
        System.out.println(hs2);

        Set<String> hs3 = Set.of("Ayşe", "Fatma"); // Bu şekilde oluşturulduğunda eleman eklenemz.
        System.out.println(hs3);
//        hs3.add("Deniz");
//        System.out.println(hs3);

        //----------------------------
        //LinkedHashSet nasil olusturulur?
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        //LinkedHashSet'e eleman nasil eklenir?
        lhs.add(5);
        lhs.add(2);
        lhs.add(15);
        lhs.add(19);
        lhs.add(7);
        lhs.add(11);
        lhs.add(null);
        System.out.println(lhs); // insertion order - ekleme sirasi

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(14);
        ls.add(19);
        ls.add(7);
        ls.add(11);
        System.out.println(ls);

        //retainAll() metodu, bir koleksiyondaki öğelerin başka bir koleksiyonla kesişimini
        // (yani her iki koleksiyonda da bulunan öğeleri-ortak) bulmak için kullanılır.

        lhs.retainAll(ls); //Değişikliğe uğrayan metodun solundakidir.
        System.out.println(lhs);
        System.out.println(ls);

        //TreeSet nasil olusturulur?
        TreeSet<Character> ts = new TreeSet<>();
        ts.add('5');
        ts.add('7');
        ts.add('g');
        ts.add('A');
        ts.add('_');
        //ts.add(null); ////null koyamazsiniz cunku null olsa dogal siralama olamazdi

        System.out.println(ts);

        //subset() belirli bir aralıktaki elemanları içeren yeni bir küme oluşturmak için kullanılır.
        //subSet() methodu, belirtilen aralıkta bulunan elemanlardan oluşan bir sorted set alt kümesi
        // oluşturur. Bu nedenle, subSet() yöntemini kullanmak için,
        // SortedSet türünden bir değişken oluşturmanız gerekir.

        //TreeSet<Character> ss = ts.subSet('7','g');  HATA SortedSet olmalıydı!!

        SortedSet<Character> ss = ts.subSet('B', 'z'); // Aralıkta olan değerleri yazar
        System.out.println(ss);


    }
}

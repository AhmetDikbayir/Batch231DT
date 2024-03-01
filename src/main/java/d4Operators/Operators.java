package d4Operators;

public class Operators {
    public static void main(String[] args) {
        /*
        +,-,*,/ islemleri Java'da matematikte kullanildigi gibi kullanilir
        Not 1: Java'da bir tamsayiyi baska bir tamsayiya bolerseniz sonuc her zaman tamsayi olur
        Not 2: Eger sonuc tamsayi degilse java sonucun ondalik kismini silerek onu int'e donusturur.
        Not 3: Bir matematiksel islemde farkli data tiplerini kullanirsaniz sonuc her zaman buyuk data tipinde olur.
        */

        int paraMiktari = 25;
        int kisiSayisi = 10;
        System.out.println(paraMiktari / kisiSayisi); //2, 2.5 cikacakti, Java noktadan sonrasini sildi

        double ucretMiktari = 25; //8 byte ondalikli sayi
        int ogrenciSayisi = 10; //4 byte tamsayi

        /*2) Java da "logical operator" lar.
       ==> AND (&&) isleminden true alabilmek icin her sey true olmalidir
       AND islemini carpma olarak dusunebiliriz

       ==> OR(||) isleminde bir tane true sonucu true yapmaya yeterlidir
       OR isleminde sonucun false olabilmesi icin hersey false olmalidir

       //==> NOT Operatoru (!) true olani false , false olani true yapar
       !true  ==> false
       !false ==> true
       !!true ==> true*/

        /*3) Comparison (Karsilastirma) Operators
       <, >, <=, >=, ==, !=
       Not: Karsilastirma operatorlerini kullandiginizda sonuc kesinlikle boolean (true, false) alirsiniz*/

        boolean a = 3 < 5; //true
        boolean b = 2 + 3 != 5; //false
        boolean c = 2 + 3 * 5 >= 19; //false, once carpma

        System.out.println(a && b); //false
        System.out.println(a || b || c); //true

        //---------------------
        //Type Casting
        /*Sayisal primitive data tiplerinin birbirine donusturulmesine Type Casting denir
        Numeric (sayisal) Data Type ==> byte - short - int - long - float - double */

        /*Not 1: Kucuk data type'larini buyuk data type'larina cevirmeyi Java otomatik olarak yapabilir. Bu isleme "AutoWidening" (Otomatik genisletme) denir*/

        /*Not 2: Buyuk data type'larini kucuk data type'larina cevirmek riskli bir istir. Veri kaybi olusabilir.
        Java bu isi otomatik olarak yapmaz. Bu islemi kod yazanlar yapar.
        Bu isleme "Explicit Narrowing"(Aciktan Daraltma)denir.*/

        //Ornek 1: byte data type’ ini int data type’ ina ceviriniz. ==> AutoWidening - otomatik genişletme

        byte age = 13;

        int ageInt = age;

        //Ornek 2 : int data type’ ini short data type’ ina ceviriniz.Explicit Narrowing (Aciktan Daraltma)
        //Burada weight 32bin den büyük olursa weightShort absürt değerler vermeye başlar.
        int weight = 31355;

        short weightShort = (short) weight;
        System.out.println(weightShort);

        //------------------
        //Java Library (Java Kutuphanesi - Standart Library)
        /*Java'da kütüphane, belirli bir işlevselliği sağlayan class'lar, interface'ler ve metotlar koleksiyonudur. */
        //.jar(java archive) formatında dağıtılırlar.
        //Java Standart Kutuphanesi (JDK kurduğumuzda otomatik gelir.)
        //Kutuphaneyi kullanabilmek için import keywordu kullanılır.

        //Java.lang ==> Otomatik olarak her java programında import edilir.
        //Java.util ==>
        //Java.io ==>
        //Java.security ==>

        //Java ucuncu taraf kutuphaneler
        //Apache Commons
        //Spring framework
        //Hibernate
        //Selenium
        //JavaFX


    }
}

package d7switch_ternary_string;

import java.io.Serializable;

public class Ternary01 {
    public static void main(String[] args) {
        //Ornek 1: Bir sayinin mutlak degerini hesaplayan kodu yaziniz.

        //-4 ==> -1*-4, 4 ==> 4, 0 ==> 0

        int c = 0;
        int result = c<0 ?c *-1: c;
        System.out.println(result);
        //----------------------------------

        //Ornek 2: Iki sayinin isareti ayni ise bu sayilari carpan, isaretleri farkli ise
        // “Farkli isaretli sayilari carpamiyorum” mesaji veren kodu yaziniz.

        int a = -2;
        int b = -5;

        //Object, Java'da butun non-primitive data type'larin ortak parent'idir

        Object result2 = (a > 0 && b > 0) || (a < 0 && b < 0) ? (a * b) : ("Farkli isaretli sayilari carpamiyorum");
        System.out.println(result2);

        //Her yere neden Object kullanılmaz!!!!
            //Veri tipi güvenliği sıkıntı tür dönüşüm hataları alınabilir.
            //Performans düşer
            //Derleyiciyi yorar
            //Kod okunurluğunu azaltır.
            //Metot erişimi zorlaşır. Objede spesifik metotlar yok.
    }
}

package d24collections;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Sets02 {
    public static void main(String[] args) {

        //Interview Sorusu
        //Ornek 1 : Ogrenci email adreslerini natural order’da siralanmis olarak depolayiniz.

        long t1 = System.nanoTime(); //Performans ölçümü için kullanılır.
        //1.yol: Yavaş - Cunku her elemanda siralama yapar.

        TreeSet<String> emails = new TreeSet<>();
        emails.add("k@gmail.com");
        emails.add("m@gmail.com");
        emails.add("u@gmail.com");
        emails.add("a@gmail.com");
        emails.add("y@gmail.com");
        emails.add("v@gmail.com");
        emails.add("b@gmail.com");
        emails.add("r@gmail.com");
        emails.add("n@gmail.com");
        emails.add("c@gmail.com");
        System.out.println(emails);

        long t2 = System.nanoTime();

        //Hizlandirmak icin eleman eklerken en hizli olandan(HashSet) yardim alalim
        //2.yol: Tavsiye edilir - Daha hizli

        HashSet<String> emailsHs = new HashSet<>();
        emailsHs.add("k@gmail.com");
        emailsHs.add("m@gmail.com");
        emailsHs.add("u@gmail.com");
        emailsHs.add("a@gmail.com");
        emailsHs.add("y@gmail.com");
        emailsHs.add("v@gmail.com");
        emailsHs.add("b@gmail.com");
        emailsHs.add("r@gmail.com");
        emailsHs.add("n@gmail.com");
        emailsHs.add("c@gmail.com");
        System.out.println(emailsHs); //Karışık verdi

        //Boş bir TreeSet oluşturalım ve constructor'ına HAshSet'i yazalım.
        TreeSet<String> emailsHsTs = new TreeSet<>(emailsHs);
        System.out.println(emailsHsTs);

        long t3 = System.nanoTime();

        System.out.println(t2-t1); //treeset
        System.out.println(t3-t2); //hashset


    }
}

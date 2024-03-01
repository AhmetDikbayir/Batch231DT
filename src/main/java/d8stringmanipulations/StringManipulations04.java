package d8stringmanipulations;

public class StringManipulations04 {
    public static void main(String[] args) {

        //Ornek 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //String tv = “$456.99”;  String laptop = “$875.99"; ==> 456.99 + 875.99 = 1332.98
        //valueOf() : Belirtilen String’i Double’a cevirir


        String tv = "$456.99";
        String laptop = "$875.99";

        tv = tv.replace("$", "");
        laptop = laptop.replace("$", "");

        Double.valueOf(tv);
        Double.valueOf(laptop);
        Double totalPrice = Double.valueOf(tv) + Double.valueOf(laptop);
        System.out.println(totalPrice); //1332.98

        //----------------
        //Ornek 2: Kullanici isminin ilk harflerini alip buyuterek console’a yazdiriniz.
        //      ”  ali cAN  ” ==> AC

        //trim() metodu bir String’deki bastaki ve sondaki bosluklari siler. Aradakileri silmez
        //split() String’i istediginiz karakterden parcalamaya yarar.

        String name =  "   ali  cAN   ";
        char first = name.trim().toUpperCase().charAt(0);
        //char last = name.trim().toUpperCase().split(" ")[1].charAt(0);
        char last = name.trim().toUpperCase().split("\\s+")[1].charAt(0);
        //Ali Can arasında birden fazla boşluk olsa da çalışır.
        //\\s+ ifadesi bir veya birden fazla ardışık boşluk karakterini ifade eder.
        System.out.println("first = " + first);
        System.out.println("last = " + last);

        //Char sayısal bir tür olduğu için içindeki değerlerin ASCII değerlerini alıp işlem yapar.
        System.out.println(first + last);

        //Başına hiçlik koyunca karakterleri birleştiriyor.
        System.out.println("" + first + last);

    }
}

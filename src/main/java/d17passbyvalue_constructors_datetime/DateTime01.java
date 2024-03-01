package d17passbyvalue_constructors_datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {
        //Date Data Tipi

        //LocalDate java.time paketinde yer alan bir classtir.
        //Bu sınıf, tarih bilgilerini temsil etmek ve işlemek için kullanılır.
        //Java'da java.time.LocalDate class'i, yerel tarihleri temsil etmek için kullanılır
        // ve saat bilgisini içermez, yani sadece gün, ay ve yıl bilgilerini içerir.

        //---------------
        //ornek 1: now(): Geçerli tarihi alır. Tarih bilgisini yerel bilgisayarınızın saatinden alır,
        // yani sizin bilgisayarınızın saatinden gelir

        LocalDate myDate = LocalDate.now(); //now() methodu static bir methoddur. Class ismiyle çağrılır.

        //String s = "Ali Can";
        //s.substring() ==> substring non-statictir cunku class ile ilgili değil object ile ulastık

        //Math.min() ==> static method

        System.out.println(myDate);

        //ornek 2 : getMonthValue(): Tarihin ayını (1-12 arasında) alır.
        //getMonth(): Bu metod ayı dondurur. (Month enum türünde)


        //Java'da Month veri türü, bir enum (enumeration) türüdür (numaralandırma türüdür).
        //Degisme ihtimali olmayan datalari depolamak icin kullanilir. Haftanin gun isimleri, Ay isimleri gibi

        int myMonth = myDate.getMonthValue();
        System.out.println(myMonth); //2

        Month ay = myDate.getMonth(); //Month bir data tipidir.

        System.out.println(ay);

        //ornek 3: getYear(): Tarihin yılını alır.
        int year = myDate.getYear();
        System.out.println(year);
        System.out.println(myDate.getDayOfYear()); //37, yilin 37. günü

        //ornek 4:getDayOfMonth(): Ayin gününü alır.

        int gun = myDate.getDayOfMonth();
        System.out.println(gun);

        DayOfWeek gun2 = myDate.getDayOfWeek();
        System.out.println(gun2); //TUESDAY - ENUM yapisi

        //ornek 5:
        //ileriki tarihe nasil gidilir?
        //plusDays(): Belirtilen gün sayısını tarihe ekler ve yeni bir LocalDate döndürür.
        //plusMonths(): Belirtilen ay sayısını tarihe ekler ve yeni bir LocalDate döndürür.
        //plusYears(): Belirtilen yil sayısını tarihe ekler ve yeni bir LocalDate döndürür.
        //Bu methodlar, orijinalleri değiştirmez, yeni bir gun, ay ve tarih nesnesi oluşturur.

        LocalDate newDate = myDate.plusYears(1).plusMonths(2).plusDays(4);
        System.out.println(newDate);

        /*ornek 6:Gecmis tarihe nasil gidilir?
        minusYears(): Bir LocalDate veya LocalDateTime nesnesinden belirtilen yıl sayısını çıkarır.
        minusMonths() : Bir LocalDate veya LocalDateTime nesnesinden belirtilen ay sayısını çıkarır.
        minusDays() : Bir LocalDate veya LocalDateTime nesnesinden belirtilen gün sayısını çıkarır.
        Sonuç olarak, çıkarma işleminden sonra elde edilen tarihi döndürürler.*/

        System.out.println(myDate.minusYears(1).minusMonths(3).minusDays(1));

        //------------------------
        //of(int year, int month, int dayOfMonth): Belirtilen yıl, ay ve günle bir LocalDate örneği oluşturur.

        LocalDate date1 = LocalDate.of(1980, 8, 3);
        LocalDate date2 = LocalDate.of(2010, 5, 4);

        //isAfter(): Bir tarihin başka bir tarihten sonra olup olmadığını kontrol eder.boolean verir
        //isBefore(): Bir tarihin başka bir tarihten once olup olmadığını kontrol eder.boolean verir

        boolean isAfter = date1.isAfter(date2);
        System.out.println(isAfter);

        boolean isBefore = date1.isBefore(date2);
        System.out.println(isBefore);

        //--------------
        //ornek 8: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yılı giriniz:");
        int years = input.nextInt();
        System.out.println("Lütfen ayı giriniz (1-12):");
        int month = input.nextInt();
        System.out.println("Lütfen günü giriniz:");
        int day = input.nextInt();

        //Kullanıcıdan alınan verilerle bir tarih oluşturalım.
        LocalDate girilenTarih = LocalDate.of(years, month, day);

        if(girilenTarih.isAfter(LocalDate.now())){
            System.out.println("Zamanı girebilirsiniz.");
        }else {
            System.out.println("Geçersiz bir tarih yazdınız.");
        }

    }
}

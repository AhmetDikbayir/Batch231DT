package d18datetime_stringbuilder;

import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.util.Scanner;

public class DateTime01 {

        public static void main(String[] args) {

            //ornek 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
            //Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.

            Scanner input = new Scanner(System.in);
            LocalDate girilenTarih = null;

            while (true){

                System.out.println("Lutfen yili giriniz:");
                int year = input.nextInt(); //Kullanicidan yil bilgisini aldik

                System.out.println("Lutfen ayi giriniz(1-12):");
                int month = input.nextInt(); //Kullanicidan ay bilgisini aldik

                if (month < 1 || month > 12){
                    System.out.println("Ay 1 ile 12 arasinda olmalidir. Lutfen tekrar deneyiniz");
                    continue; //Kullaniciyi dongunun basina yonlendirir
                }

                System.out.println("Lutfen gunu giriniz");
                int day = input.nextInt();  //Kullanicidan gun bilgisini aldik


                //O ayin kac cektigini bulmak icin, girilen yil ve ay icin YearMonth objesi olusturulur.
                YearMonth yearMonth = YearMonth.of(year, month);

                //YearMonth içine aylar String olarak da girilebilir.Formata DİKKAT!!!
                YearMonth yMonth = YearMonth.of(2021, Month.valueOf("JUNE"));

                //O ayın maksimum gün sayısı hesaplanır
                int daysInMonth = yearMonth.lengthOfMonth(); //daysInMonth'un içinde subat olsaydı 29 olurdu.

                if (day < 1 || day > daysInMonth){
                    System.out.println("Girilen ay icin gecersiz gun. Lutfen tekrar deneyiniz");
                    continue; //Kullaniciyi dongunun basina yonlendirir
                }

                girilenTarih = LocalDate.of(year,month,day); //Girilen bilgilerle LocalDate objesi olusturduk

                if(girilenTarih.isBefore(LocalDate.now())){
                    System.out.println("Geçersiz tarih girdiniz. Lütfen tekrar deneyiniz");
                }else {
                    System.out.println("Zamani girebilirsiniz");
                    break; //Gecerli tarih girildi, donguden cik
                }
            }
            input.close();
            //Başka kodlar olması gerekiyor...
            //ornek 9: Kullanicindan dogum tarihini alan ve girdigi tarihin gun ismini bulan kodu yaziniz.
    }
}

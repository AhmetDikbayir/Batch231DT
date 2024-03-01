package d18datetime_stringbuilder;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime02 {
    public static void main(String[] args) {
        //ornek 2: Kullanicindan dogum tarihini alan ve girdigi tarihin gun ismini bulan kodu yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen verilen sırada doğum tarihi bilginizi alt alta giriniz: yıl-ay-gün");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate date = LocalDate.of(year,month,day);
        System.out.println(date.getDayOfWeek());
        //Girilen tarihin gününü aldık.
    }
}

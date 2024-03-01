package d12loops_arrays;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        //Ornek 1: 0-100 arasi sayi tahmin etme oyununu do-while ile yaziniz.

        //Scanner ve Random class'larindan object uretelim
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //0 ile 100 arasında rastgele sayi üretelim.
        int rastgeleSayi = random.nextInt(0,101);

        int tahminEdilen;

        //20-100 arasini nasil seceriz?

        //Kullanicinin kac kere tahmin yaptigini takip etmek icin bir sayac olusturalim
        int denemeSayisi = 0;
        boolean tahminDogrumu = false;
        do{
            System.out.println("Please enter a number between the 0 and 100: ");
            tahminEdilen = scanner.nextInt();

            denemeSayisi++;
            if(tahminEdilen < rastgeleSayi){
                System.out.println("Sayi daha büyük");
            }else if(tahminEdilen > rastgeleSayi){
                System.out.println("Sayi daha küçük");
            }
            else {
                tahminDogrumu = true;
                System.out.println("Tebrikler deneme doğru");
                System.out.println("Deneme sayısı : " + denemeSayisi);
            }
        }while (!tahminDogrumu);
        scanner.close(); //Açtığınız kaynakları kapatmak iyi bir programlama pratiğidir.


    }
}

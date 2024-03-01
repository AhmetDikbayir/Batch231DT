package d4Operators;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //Ornek 4: Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //i)Alanini hesaplayiniz ==> Kisa kenar * Uzun kenar
        //ii)Cevresini hesaplayiniz ==> 2*Kisa Kenar + 2*Uzun Kenar

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the short side:");
        float shortSide = input.nextFloat();

        System.out.println("Please enter the long side:");
        float longSide = input.nextFloat();

        /*
        System.out.println("Alan : " + (shortSide * longSide));
        System.out.println("Cevre : " + (2*(shortSide + longSide)));
         */
        //ODEV: kısa kenar, uzun kenar kontrolunu dongu ile yapınız.(while ile yapınız).
        if(shortSide<longSide){
            System.out.println("Alan : " + (shortSide * longSide));
            System.out.println("Cevre : " + (2*(shortSide + longSide)));
        }else {
            System.out.println("Please enter right side length");
        }


    }
}

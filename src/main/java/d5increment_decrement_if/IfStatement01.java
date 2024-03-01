package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        if (3 < 5) {
            System.out.println("condition doğru if çalıştı.");
        }
        //--------------------------
        if (7 == 4 + 3) {
            System.out.println("condition doğru if çalıştı.");
        }
        //--------------------------
        //Ornek 1: Sayi 0 (dahil) ile 10 (haric) arasinda ise ekrana “Rakam” yazdirin.

        /*Scanner input = new Scanner(System.in);
        System.out.print("Please enter a digit: ");
        int num = input.nextInt();

        if((num>-1) && (num<10)){
            System.out.println("Rakam");
        }
        */
        //Ornek 2: Sayi uc basamakli ise ekrana “Sayi üç basamaklidir!” yazdirin.
        int n = 123;
        if(n>99 && n<1000){
            System.out.println("Sayı üç basamkalıdır.");
        }

    }
}

package d4Operators;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Ornek 5: Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz
        //      45678 ==> 45 + 78 = 123

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 digit number: ");
        int num = input.nextInt();

        //Java'da bir tamsayiyi baska bir tamsayiya bolunce sonuc tamsayi cikar.
        int firstTwo = num / 1000;

        //% isaretine modulus operatoru denir. Kalan bulunur.
        int lastTwo = num % 100;

        int result = firstTwo + lastTwo;
        System.out.println("Your number first two and last two digits is: " + result);
    }
}

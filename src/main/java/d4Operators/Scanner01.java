package d4Operators;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Java'da Scanner class'i, kullanıcıdan veya farklı bir kaynaktan girdi almanın oldukça kolay bir yolunu sağlar
        //Scanner sınıfı, farklı veri tiplerini (int, float, double, String, boolean vb.) kolaylıkla okuyabilir.
        //next(), nextInt(), nextDouble() gibi farklı metotlar, farklı ihtiyaçlara uygun şekillerde kullanicidan
        // girdi almayı sağlar.

        //Ornek 1 : Kullanicidan yasini isteyip console’a yazdiriniz

        //1.adim: Scanner class'tan object uretin
        Scanner input = new Scanner(System.in);
        //System.in ile klavye üzerinden veri girişi kabul edilir.

        //2. adim: Kullanıcıya ne istediğinize dair mesaj veriniz.
        System.out.print("Please enter your age: ");

        //3. adim: Uygun methodu kullanarak kullanicinin verdigi data'yi memory'e yerlestiriniz
        byte age = input.nextByte(); //kullanıcının girdiği veriyi yerel age değişkenine yükledik
        System.out.println("Your age is " + age);

    }
}

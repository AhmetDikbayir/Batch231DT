package d4Operators;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        /*Ornek 1:
        Kullanıcıdan;
        i)Adini ve Soyadini
        ii)Yaşını
        iii)Boyunu
        iv)Kilosunu
        v)Medeni durumunu girmesini isteyin.

        Ardından bunları bir etiketle konsolda farklı satırlarda yazdırın*/
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name and last name");
        String fullName = input.nextLine(); //nextLine() methodu ile birden fazla kelime girdisi alabiliriz

        System.out.println("Please enter your age: ");
        byte age = input.nextByte();

        System.out.println("Please enter your height: ");
        float height = input.nextFloat();

        System.out.println("Please enter your weight: ");
        short weight = input.nextShort();

        System.out.println("Please enter your marriage status: ");
        String maritalStatus = input.next(); //kullanıcıdan tek kelimeli String almak için kullanılır.

        //Kullanıcı verilerini konsola yazdırlaım
        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("maritalStatus = " + maritalStatus);
        //ODEV: nextLine'in enter'la bos gecmesini do-while dongusu ile duzeltiniz.

    }
}

package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        //Ornek 1: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = input.nextInt();
        //1. Yol:
        if (num % 2 == 0){
            System.out.println("Cift Sayi");
        }

        if (num % 2 != 0){ //num % 2 == 1'de yazabilirdik
            System.out.println("Tek sayi");
        }

        //2. Yol:
        //if-else statements
        //condition dogruysa (true) blogu, yanlissa (false) else blogu calisir
        //if-else'de sadece biri calisabilir.
        if (num % 2 == 0) {
            System.out.println("Your number is even.");
        } else {
            System.out.println("Your number is odd.");
        }


    }
}

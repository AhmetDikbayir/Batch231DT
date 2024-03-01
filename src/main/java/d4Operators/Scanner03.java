package d4Operators;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //Ornek3: Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter two number: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        double sumResult = num1 + num2;
        double subResult = Math.abs(num1 - num2);
        double multipleResult = num1 * num2;
        double divideResult = num1/num2;
        String result = String.format("%.2f", (divideResult));
        System.out.println("Your sum result is: " + sumResult);
        System.out.println("Your substract result is: " + subResult);
        System.out.println("Your multiple result is: " + multipleResult);
        System.out.println("Your divide result is: " + String.format("%.2f", divideResult));


    }
}

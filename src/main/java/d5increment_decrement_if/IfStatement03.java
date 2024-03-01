package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
        //if - else if ... - else

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");

        int num = input.nextInt();

        if (num > 0) {
            System.out.println(num + " is positive.");
        } else if (num < 0) {
            System.out.println(num + " is negative.");
        } else {
            System.out.println(num + " is notr.");
        }
    }
}

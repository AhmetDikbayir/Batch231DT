package d12loops_arrays;

import java.util.Scanner;

public class DoWhileLoops02 {
    public static void main(String[] args) {

        /*Ornek 1:
       Gecerli Username="admin" ve Password="pwd123" dur.
       Kullanicidan username ve password'u alin.
       Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
       Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin.
       Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz.
        */

        Scanner input = new Scanner(System.in);

        int counter = 0;
        do{
            if(counter==4){
                System.out.println("Your account is blocked!");
                break;
            }else {
                System.out.println("Please enter your Username:");
                String user = input.nextLine();

                System.out.println("Please enter your password:");
                String password = input.nextLine();

                if (user.equals("admin") && password.equals("pwd123")) {
                    System.out.println("Welcome to your account!!");
                    break;
                } else if (user != "admin" && password.equals("pwd123")) {
                    System.out.println("Your username is wrong");
                    counter++;
                    System.out.println("You have " + counter + " number of attempts");
                } else if (user.equals("admin") && password != "pwd123") {
                    System.out.println("Your password is wrong");
                    counter++;
                    System.out.println("You have " + counter + " number of attempts");
                } else {
                    System.out.println("Your information is wrong!!");
                    counter++;
                    System.out.println("You have " + counter + " number of attempts");
                }

            }


        }while (true);

    }
}

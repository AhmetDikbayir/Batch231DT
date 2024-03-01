package d9string_loops;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {
        /*Ornek 1: Bir parolanın aşağıdaki koşullara sahip olup olmadığını kontrol edin.

        1- Parola hicbir sey girilmeden gecilmemeli, en az bir karakter icermelidir.
        2- Karakterler sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir.
        3- Başında ve sonunda boşluk olmamalıdır.*/

        //Not: isEmpty() metodu sadece hicligi kontrol eder (true verir).
        //isBlank() metodu ise hem hicligi hemde space’i kontrol eder(true verir)

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password: ");
        String password = input.nextLine();

        //1- Parola hicbir sey girilmeden gecilmemeli, en az bir karakter icermelidir.
        boolean first = password.isEmpty();

        //2- Karakterler sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir.
        //boolean isChar = password.replaceAll(" ", "").length()>0;

        boolean second = password.isBlank();


        //3- Başında ve sonunda boşluk olmamalıdır.
        //Basindaki ve sonundaki bosluklari alinca, ilk haline esitse, orjinalinde bosluk yoktur.
        boolean third = password.trim().equals(password);

        if(first){
            System.out.println("Password cannot be empty");
        }

        if(second) {
            System.out.println("Parola bos birakilmamali ve bosluk harici karakterlerde bulunmalidir");
        }

        if(!third) {
            System.out.println("Parolanın başında veya sonunda boşluk bırakılmamalı");
        }

    }
}

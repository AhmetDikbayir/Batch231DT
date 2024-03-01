package d8stringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {
        /*Ornek 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.

        i)En az 8 karakter olsun
        ii)Space karakteri password'de olmasin
        iii)En az bir tane buyuk harf olsun
        iv)En az bir tane kucuk harf olsun
        v)En az bir tane rakam olsun */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your password: ");
        String password = scan.nextLine();

        //i)En az 8 karakter olsun
        boolean lengthControl = password.length()>7;
        //System.out.println("lengthControl = " + lengthControl);

        //ii) Space karakteri password'de olmasin
        boolean spaceControl = password.replaceAll("[^ ]", "").length() ==0; //length() yerine .isEmpty() de yazabilirdik.
        //System.out.println("spaceControl = " + spaceControl);

        //iii)En az bir tane buyuk harf olsun
        boolean upperCaseControl = password.replaceAll("[^A-Z]", "").length()>0;
        //System.out.println("upperCaseControl = " + upperCaseControl);

        //iv)En az bir tane kucuk harf olsun
        boolean lowerCaseControl = password.replaceAll("[^a-z]", "").length()>0;
        //System.out.println("lowerCaseControl = " + lowerCaseControl);

        //v)En az bir tane rakam olsun
        boolean digitControl = password.replaceAll("[^0-9]", "").length()>0;
        //System.out.println("numberControl = " + digitControl);

        //ODEV: En az 1 tane sembol icermeli
        // Şifrede en az bir sembol içerip içermediğini kontrol et
//        boolean symbolControl = password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*");
        boolean symbolControl = password.replaceAll("[^\\p{Punct}]", "").length()>0;
        System.out.println(symbolControl);

        boolean isValid = lengthControl && spaceControl && upperCaseControl && lowerCaseControl && digitControl && symbolControl;
        //System.out.println(isValid);
/*
        if(!digitControl){
            System.out.println("Sifre en az bir rakam icermelidir");
        }

        if (isValid){
            System.out.println("Sifre gecerlidir");
        }else {
            System.out.println("Sifre gecersizdir");
        }
 */

    }
}

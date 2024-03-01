package d28exceptions_enum_iterators;

import java.util.Arrays;
import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {
        //Cities c = new Cities(); //ENUM'dan obje oluşturamayız.

        //1- Enum daki bir sabite nasil ulasabiliriz?
        Cities il = Cities.BURSA;
        System.out.println(il);
        System.out.println(Cities.ADIYAMAN.getCityName());
        int ankara = Cities.ANKARA.getPlateCode();
        System.out.println(ankara);

        //4- Karabuk’un plaka koduna ulasalim
        System.out.println(Cities.KARABÜK.getPlateCode()); //78

        //5- Kullanicidan bir ilin plaka kodunu alarak bunun hangi il oldugunu console a yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir plaka kodu giriniz:");
        int plaka = scan.nextInt();

        //values() methodu enum icindeki tum datalari bir array icinde bize verir

        Cities[] sehirler = Cities.values();
        //System.out.println(Arrays.toString(sehirler));
        if(plaka<1 || plaka>81){
            System.out.println("Lütfen 1 - 81 arasında bir plaka kodu giriniz.");
        }else{
            for(Cities w : sehirler){
                if(plaka == w.getPlateCode()){
                    System.out.println("Girmis oldugunuz plaka " + w.getCityName() + " iline aittir");
//                    System.out.println(w.getCityName());
//                    System.out.println(w.getPlateCode());
//                    System.out.println(w.getPostalCode());
                    break;
                }
            }
        }



    }
}

package d27exceptions;

public class E05 {
    public static void main(String[] args) {
        //try blogundan sonra birden fazla catch bloğu kullanabilir miyiz?
        int a = 12;
        int b = 1;
        String s = "My Java";

        //getCharFromString(s,a,b);
        getCharFromString2(s,a,b);

    }

    public static void getCharFromString(String s, int a, int b){
        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (ArithmeticException e){
            System.out.println("Sifira bolme yapilamaz " + e.getMessage());
        } catch (IndexOutOfBoundsException e){
            System.out.println("index numarası " + (s.length()-1) + " den büyük olamaz.");
            //e.getCause() hatanin sebebi class'ta yukluyse verir, yoksa null verir
        }
    }

    public static void getCharFromString2(String s, int a, int b){

        //2.yol: Tum exception turlerini tek bir catch’te yakalamak icin “exception” adli parent kullanilir.
        //fakat tavsiye edilen daha özel mesajlar vermektir.
        try{
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);

        }catch (Exception e){
            System.out.println("Bir istisna oluştu : " + e.getClass());
            //getClass() exception'ın cesidini verir.
        }
    }
}

package d27exceptions;

public class E03 {
    public static void main(String[] args){
        //3) StringIndexOutOfBoundsException, bir String nesnesinin karakter dizisindeki
    // geçersiz bir indekse erişmeye çalışıldığında ortaya çıkan bir istisna türüdür.

        String s = "Java";
        karakterSec(s,10);


    }//main dışı

    public static void karakterSec(String s, int idx){

        try {
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Olmayan indeksleri kullanmayınız : " + e.getMessage());
            e.printStackTrace(); // kod yazan hataları görmek isterse kullanılır. exception'ı gösterir.
            //exception fırlatılmaz.
            System.out.println("Exceptiondan sonra bu da çalışır");
        }
        System.out.println("App çalışıyor");

    }
}

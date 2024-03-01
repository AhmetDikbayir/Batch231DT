package d27exceptions;

public class E02 {
    public static void main(String[] args) {

        //2) NumberFormatException : Bir metnin sayisal bir deger olarak donusturulememesi durumunda olusur

        String s = "1234a";
        convertStringToInt(s);


    }//main dışı

    public static void convertStringToInt(String s){
        try{
            int intS = Integer.valueOf(s);
            System.out.println(intS + 1); // 1'i donusturup donusturmediğini anlamak için yazdık
        } catch (NumberFormatException e){
            System.out.println("Dönüşüm için rakam dışı karakter kullanmayınız : " + e.getMessage());
        }

        //FileWriter, PrintWriter ile exception'ları dışarıya alabiliriz
    }
}

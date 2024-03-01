package d9string_loops;

public class StringManipulations01 {
    public static void main(String[] args) {
        //Ornek 1: Bir String’in belirli bir karakterinden baslayarak belirli bir karaktere kadar
        // tum karakterleri dynamic olarak aliniz. abc@gmail.com ===> gmail

        //1. Yol: HArd Code - tavsiye edilmez.

        String a = "abc.def@yahoo.com";
        String s1 = a.substring(4, 9); //gmail
        System.out.println(s1);

        //2. Yol: Dinamik

        String company1 = a.split("@")[1].split("\\.")[0];
        //Noktadan bölmek istersek \\. yazmalıyız.
        System.out.println(company1);

        //3. Yol: Dinamik
        //indexOf() method’u spesifik bir karakterin ilk gorunumunun index’ini verir
        //Bu method olmayan karakterler icin -1 verir

        int startingIndex = a.indexOf("@");
        //mailde iki tane nokta varsa da doğru çalışırı.
        int endingIndex = a.lastIndexOf(".");
        String companyName = a.substring(startingIndex + 1, endingIndex);
        System.out.println(companyName);

    }
}

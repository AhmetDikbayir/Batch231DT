package d10loops;

public class ForLoops02 {
    public static void main(String[] args) {
        //ornek 1: Verilen bir tamsayinin rakamlari toplamini console yazdiriniz
        //      578 ==> 5+7+8=20 ==> Output 20 olmali

        //Iki int’i birbirine bolersek sonuc int olur (tamsayi).
        //Java virgulden sonrasini siler, yuvarlama islemi yapmaz.
        //ornegin: 578/10=57
        //Azaltma islemi 10’a bolme yoluyla yapilacak

        int sayi = 578;
        int sum = 0;

        for(;sayi>0; sayi/=10){
            sum += sayi%10;
        }
        System.out.println(sum);

        System.out.println("----------------------------");

        //Ornek 2: Bir String’teki tekrarsiz karakterleri veren kodu yaziniz
        // Yusuf ==> Ysf

        String s1 = "Yusuf";
        String unique = "";

        for(int i = 0; i< s1.length(); i++){
            char ch = s1.charAt(i);

            if(s1.indexOf(ch) == s1.lastIndexOf(ch)){
                unique += ch;
            }
        }
        System.out.println("Tekrarsiz olanlar: " + unique);

    }
}

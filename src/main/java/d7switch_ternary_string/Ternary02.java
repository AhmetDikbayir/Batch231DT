package d7switch_ternary_string;

public class Ternary02 {
    public static void main(String[] args) {
        //Ornek : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz

        int a = -254;
        a = Math.abs(a); //absolute value , mutlak değer aldik
        String result = a >99 && a<1000 ? "Sayi uc basamaklidir." : "Sayi uc basamkli değildir.";
        System.out.println(result);
    }
}

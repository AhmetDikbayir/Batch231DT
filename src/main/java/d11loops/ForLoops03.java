package d11loops;

public class ForLoops03 {
    public static void main(String[] args) {
        //Ornek 2: Verilen sayıda ondalık kısımdaki rakamların toplamını bulunuz.
        //            28.587 ==> 5+8+7=20

        double num = 28.587;

        //double ı string e cevirdik
        String sNum = String.valueOf(num);

        sNum = sNum.split("\\.")[1];
        int decimalPart = Integer.valueOf(sNum); //unboxing //587
        int sum = 0;
        for (int i = decimalPart ; i > 0; i/= 10) {
            sum += i %10;
        }
        System.out.println(sum);
    }
}

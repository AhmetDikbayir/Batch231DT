package d16methodcreation_overloading_passbyvalue;

public class MethodCreation02 {
    public static void main(String[] args) {

        //Örnek 1 calistirma
        int a = multiply(2, 4);
        System.out.println(a);

        //Örnek 2 calistirma
        int b = multipleSum(2,4,8);
        System.out.println(b);

        //örnek 3: calismasi
        yazdir("Ali gel.");



    }//main disi

    //örnek 1: İki sayiyi çarpan bir method oluşturunuz.
    //protected bu classtan erisilebilir.
    //Bir de sadece miras alinan classlardan erisilebilir(extends)

    protected static Integer multiply(int a, int b) {
        return a * b;
    }

    //ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method olusturunuz

    //private : Buraya sadece ayni class icerisinden erisilebilir.
    //Diger class’lar erisemez
    private static Integer multipleSum(int a, int b, int c) {
        return a * b + c;
    }

    //ornek 3: Girilen bir kelimeyi konsola yazdiran bir method olusturunuz (void yani return yok)

    //ornek 3: Girilen bir kelimeyi konsola yazdiran bir method olusturunuz (void yani return yok)

    //Eger bir method yeni bir data uretmiyor ise return type’i void olur
    //void ise return yazilmaz

    public static void yazdir(String str){
        System.out.println(str);
    }
}

package d17passbyvalue_constructors_datetime;

public class Car {
    //OOP - Object-1-pasif-2-aktif
    //class - variable - method ==> object

    /*  1- Bir veri yapısı veya yardımcı bir class oluştururken, genellikle main methoduna ihtiyaç duymazsınız.
        2- Ancak bir uygulama geliştirirken veya bağımsız bir program çalıştırırken,
            main methodu oluşturmanız gerekebilir.
        3- Gercek projelerde genelde bircok class olur ve sadece 1 tane main method'lu class olur.
            Adina da "runner" eklenir.*/

    //1- variable'lar oluşturalım (pasif özellikler)

    String brand = "Honda";
    String model = "Accord";

    int year = 2023;
    int a = 2;

    boolean hybrid = true;

    //Method'lar oluşturlaım (aktif özellikler)
    public void hareket(){
        System.out.println(brand + " hizli hareket eder.");
    }

    public void dur(){
        System.out.println(brand + " güvenli bir şekilde durur.");
    }

    /*
        Constructor nedir?
        Classtan object olusturmamizi saglayan bolumdur.
        Class olusturdugumuzda Java bize otomatik olarak bir constructor verir.
        Bu constructor'lara "default constructor" denir.
        default constructor ===> Car ()
     */

    //Ama car class’i bize hep ayni degerleri gonderir. Bu class’i kullanip farkli degerler olusturabiliriz.
    //Kendiniz constructor’inizi olusturdugunuz zaman Java default constructor’i siler

    //-------------------------------
    //Custom (parametreli) Constructor nasil olusturulur?

    //Access Modifier + Class ismi + () + {}

    //-------------------------------
    /*Method ile Constructor arasindaki fark nedir? Interview Sorusu

    1)Methodlarda return type olur, constructor'larda olmaz
    2)Methodlar yaptiklari ise gore isimlendirilirler, constructorlar ise her zaman Class ismi ile isimlendirilirler
    3)Methodlar bir aksiyon yapmak icin olusturulur, Constructorlar ise object olusturmak icindir
    4)Method isimleri kucuk harfle baslar, constructor isimleri ise class ismi ile ayni oldugu icin buyuk harf le baslar

    ****** Parametreli constructorlar olusturarak ayni classdan farkli özelliklere sahip object'ler olusturabiliriz*/

    public Car(String brand, String model, int year, boolean hybrid) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;
    }

    public Car(String brand, boolean hybrid) {
        this.brand = brand;
        this.hybrid = hybrid;
    }

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand, String model, boolean hybrid) {
        this.brand = brand;
        this.model = model;
        this.hybrid = hybrid;
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(boolean hybrid) {
        this.hybrid = hybrid;
    }

    public Car(int year, boolean hybrid) {
        this.year = year;
        this.hybrid = hybrid;
    }
//toString() oluşturalım

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}

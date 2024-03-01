package d20instanceblock_oop;

public class InstanceBlock3 {
        //Ornek 3: Bir araba fabrikasinda her araba siyah renkli ve yakit tipi benzin olsun.
        //(Bunlar ortak ozellikler. Digerleri sonra ayarlansin)
    static double pi;

    static  { //static block
        pi = 3.14;
        System.out.println("Static block 1");
        System.out.println(pi);
    }

    public String color;

    public String fuelType;

    //instance block - Her obje üretildiğinde burası çalışır
        {
            color = "Black";
            //System.out.println("Araba rengi : " + color);
            fuelType = "Gasoline";
        }

        public InstanceBlock3(){
            System.out.println("Araba rengi : " + color);
            System.out.println("Araba yakıt durumu : " + fuelType);
        }

    //Parametreli constructor olusturarak farkli renk ve yakit tipinde araba uretebiliriz.

//    public InstanceBlock3(String fuelType) {
//        this.fuelType = fuelType;
//    }


    public InstanceBlock3(String color) {
        this.color = color;
    }


    public InstanceBlock3(String color, String fuelType) {
        this.color = color;
        this.fuelType = fuelType;
    }
}

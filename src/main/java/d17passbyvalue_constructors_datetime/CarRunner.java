package d17passbyvalue_constructors_datetime;


public class CarRunner {
    public static void main(String[] args) {
        //Car class'ından obje üretelim

        Car c1 = new Car("Toyota", "Corolla", 2024, true); //Custom Constructor
        c1.brand = "Toyota";
        System.out.println(c1.brand);
        System.out.println(c1.model);
        System.out.println(c1.year);
        c1.hareket();
        c1.dur();

        Car c2 = new Car("Audi", "A5", false);
        System.out.println(c2.brand);


        System.out.println(c1); //@776ec8df -- reference -- adres
        System.out.println(c2); //@4eec7777 -- reference -- adres

        //Java'da toString metodu genellikle bir nesnenin içeriğini okunabilir bir String olarak döndürmek için kullanılır.

        Car c3 = new Car("Fiat", "Şahin");
        System.out.println(c3.brand + " " +  c3.model);

    }
}

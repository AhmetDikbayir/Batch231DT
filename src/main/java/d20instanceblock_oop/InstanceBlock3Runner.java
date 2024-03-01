package d20instanceblock_oop;

public class InstanceBlock3Runner {
    public static void main(String[] args) {
        InstanceBlock3 car1 = new InstanceBlock3();
        InstanceBlock3 car2 = new InstanceBlock3("Beyaz", "Dizel");

          System.out.println("Araba rengi : " + car2.color);
        System.out.println("Araba rengi 1 : " + car1.color);
        System.out.println("Araba yakıt türü : " + car2.fuelType);
    }
}

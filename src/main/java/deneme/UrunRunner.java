package deneme;

public class UrunRunner {
    public static void main(String[] args) {
        Urun u1 = new Urun();
        u1.krediKart();
        u1.nakit();
        u1.normalPak();

        System.out.println("-------------------------");

        Urun u2 = new Urun();
        u2.nakit();
        u2.hediyePak();
        u2.yurtIci();


    }


}

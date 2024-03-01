package d22oop;

public class AudiRunner {

    public static void main(String[] args) {
        //Motor m = new Motor(); HATA: Interface' lerden object üretemezsiniz.
        AudiA4 a4 = new AudiA4();

        AudiS5 s5 = new AudiS5();

        s5.eco();
        s5.turbo();
        s5.esp();

        a4.turbo();
        a4.abs();
        a4.analog();
    }
}

package d22oop;

public class StudentRunner {
    public static void main(String[] args) {
        Student s = new Student();

        //-------------get
        System.out.println(s.getAge());
        System.out.println(s.isSuccessful());
        int newAge = s.getAge();
        System.out.println(newAge);
        System.out.println(s.name);

        //-------------set
        s.setAge(14);
        System.out.println(s.getAge());

        s.setSuccessful(false);
        System.out.println(s.isSuccessful());


        //Arastirma Odevi: encapsulation'da private ile gizlenen bir veri baska
        //bir package'dan set method ile degistirilebilir mi? (Güvenliği zayıflatma diye bir kısım var. Ona bak)
    }
}

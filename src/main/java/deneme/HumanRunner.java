package deneme;

public class HumanRunner {
    public static void main(String[] args) {
        Human h = new Human();
        Human h2 = new Human();
        System.out.println(h2);
        //h.name = "Ali";
        System.out.println(h);

        Teacher t = new Teacher("Ayşe", "Deniz", 25, "Atatürk", "Lise");
        //t.job = " Math Teacher";
        t.name = "Ahmet";
        t.age = 27;
        t.older(t.age);
        System.out.println(t.age);
        System.out.println("------------------");
        System.out.println(t.job);

        Student s = new Student("Veli" , "Deli", "Cum", 4);
        s.name = "Veli";
        s.age = 13;
        s.school = "Cumhuriyet Secondary School";
        s.grade = 7;
        System.out.println(s.job);

//        int note = s.giveNote(50);
//        System.out.println(note);

    }
}

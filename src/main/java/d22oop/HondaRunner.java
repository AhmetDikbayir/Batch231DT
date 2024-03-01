package d22oop;

public class HondaRunner {

    public static void main(String[] args) {

        //Honda h = new Honda(); Abstract class'tan object üretilmez.


        Civic c = new Civic();
        c.engine();

        String name = c.name;
        System.out.println(name);


        Accord a = new Accord();
        a.engine();

        a.music();
    }
}

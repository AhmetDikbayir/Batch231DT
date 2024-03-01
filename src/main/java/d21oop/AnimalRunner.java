package d21oop;

public class AnimalRunner {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.feedWithMilk();
        d.drink();
        int s = d.carpma(5,4);
        System.out.println(s);

        Bird b = new Bird();
        b.tweet();
        b.drink();
        b.eat();

        Cat c = new Cat();
        c.feedWithMilk();

        //a) Java 'Multiple Inheritance' i desteklemez. 'Single Inheritance' i destekler.

        //b) Parent ve birden fazla child ile olusturulan inheritance yapilanmasina
        //  ‘Hierarchical Inheritance’ denir ve Java bunu kabul eder.

        //-------------------------------------

        /*c) Ama coklu parent'lardan yararlanamamak iyi olmadi. Ozelliklerini inherit etmek istedigimiz class'lar birden fazla ise (parent'lar) o durumda Java bize, Apartman tarzi yapilanma olusturmustur.( 'Multi Level Inheritance') Java bunu kabul eder.*/

        //-------------------------------------

        // Java’da parent’tan child’a olan iliskilere HAS-A Relationship denir(yukaridan asagiya)
        // Java’da child’tan parent’a olan iliskilere IS-A Relationship denir (asagidan yukariya)

        //-------------------------------------

        //Java'da, bir sınıf için herhangi bir constructor açıkça tanımlanmamışsa,
        // Java derleyicisi o sınıfa ait varsayılan bir constructor ekler.
        // Bu varsayılan constructor parametresizdir ve class'in kendisine aittir,
        // Object class içinde tanımlı değildir. Ancak, tüm class'lar doğrudan ya da dolaylı olarak
        // Object class'indan miras alır ve Object sınıfındaki temel metodlara erişebilir.
        //(örneğin, toString(), equals(), hashCode() vb.).



    }
}
